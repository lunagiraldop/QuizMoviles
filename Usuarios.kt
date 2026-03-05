class Usuario( val documento: String, val telefono: String, val correo: String) {
    fun validarDocumento(): Boolean {
        return documento.isNotBlank()
    }

    fun validarTelefono(): Boolean {
        return telefono.all { it.isDigit() }
    }

    fun validarCorreo(): Boolean {
        return correo.contains("@") && correo.contains(".")
    }
}