package br.com.forumkotlinspringdatarest.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.springframework.data.repository.CrudRepository

@Entity
data class Instructor (
    @Id @GeneratedValue
    var id: Long? = null,
    var name: String? = null,
    var surname: String? = null,
    var email: String? = null
)

interface InstructorRepository: CrudRepository<Instructor, Long>