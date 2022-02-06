
data "kubernetes_secret" "secret" {
  metadata {
    name = "elasticsearch-es-elastic-user"
    namespace = var.namespace
  }
}