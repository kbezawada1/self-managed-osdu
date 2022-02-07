variable "name" {
  type        = string
  description = "The name of the secret to retrieve"
  default     = "elasticsearch-es-elastic-user"
}

variable "namespace" {
  type        = string
  description = "The namespace of the secret to retrieve"
  default     = "elastic-instance"
}

variable "data_name" {
  type        = string
  description = "The data name of the secret to retrieve"
  default     = "elastic"
}
