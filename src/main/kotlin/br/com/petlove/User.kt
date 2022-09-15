package br.com.petlove

import javax.persistence.*

@Entity
@Table(name = "test_trash")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String
)

