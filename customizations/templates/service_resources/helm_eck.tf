/*
.Synopsis
   Terraform Helm Install
.DESCRIPTION
   This file holds the helm install for Elastic Cloud Operator.
*/


#-------------------------------
# Elastic Cloud Kubernetes
#-------------------------------
locals {
  helm_eck_name    = "eck"
  helm_eck_ns      = "elastic-system"
  helm_eck_repo    = "https://helm.elastic.co"
  helm_eck_version = "1.9.1"
  elasticsearch = {
    elastic-instance = {
      agent_pool = "internal"
      node_count = 3
      storage    = 128
      cpu        = 2
      memory     = 8
    }
  }
}

resource "kubernetes_namespace" "eck" {
  metadata {
    name = local.helm_eck_ns
  }

  depends_on = [module.aks]
}

resource "helm_release" "eck-operator" {
  name       = local.helm_eck_name
  repository = local.helm_eck_repo
  chart      = "eck-operator"
  version    = local.helm_eck_version
  namespace  = local.helm_eck_ns

  depends_on = [kubernetes_namespace.eck]
}

module "elasticsearch" {
  depends_on = [helm_release.eck-operator]
  source = "../../../modules/providers/azure/elasticsearch"

  for_each = local.elasticsearch

  create_namespace = true
  namespace        = each.key
  agent_pool       = each.value.agent_pool
  node_count       = each.value.node_count
  storage          = each.value.storage
  cpu              = each.value.cpu
  memory           = each.value.memory
}

module "secret" {
  depends_on = [module.elasticsearch]

  for_each = local.elasticsearch
  namespace        = each.key
}