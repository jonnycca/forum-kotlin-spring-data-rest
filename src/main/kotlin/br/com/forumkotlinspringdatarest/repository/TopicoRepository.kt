package br.com.forumkotlinspringdatarest.repository

import br.com.forumkotlinspringdatarest.domain.Topico
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "topicos")
interface TopicoRepository: CrudRepository<Topico, Long> {
}