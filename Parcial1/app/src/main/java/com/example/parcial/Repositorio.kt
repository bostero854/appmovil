package com.example.parcial

data class Usuario(
    val email: String,
    val password: String,
    val nombre: String
)
class Repositorio {

    private val usuarios = listOf(
        Usuario("pedro@pe.com.ar", "abc123", "Pedro Pe")
    )

    fun obtenerUsuario(email: String, password: String): Usuario? {
        return usuarios.find { it.email == email && it.password == password }
    }
}
