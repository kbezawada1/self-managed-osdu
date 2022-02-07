output "result" {
  value = data.kubernetes_secret.secret.data["var.data_name"]
}
