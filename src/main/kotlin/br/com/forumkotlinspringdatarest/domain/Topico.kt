package br.com.forumkotlinspringdatarest.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Topico(
    @Id @GeneratedValue
    var id: Long? = null,
    var titulo: String? = null,
    var mensagem: String? = null
)