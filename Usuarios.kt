class Usuario( val documento: String, val telefono: String, val correo: String) {
    fun validarDocumento(): Boolean {
        if(documento.isNotBlank()) {
            return true
        } else {
            println("\n --Documento vacío")
            return documento.isNotBlank()
        }
    }

    fun validarTelefono(): Boolean {
        if(telefono.all { it.isDigit() }) {
            return true
        } else {
            println("\n --Teléfono inválido")
            return false
        }
    }

    fun validarCorreo(): Boolean {
        if(correo.contains("@") && correo.contains(".")) {
            return true
        } else {
            println("\n --Correo inválido")
            return false
        }
    }
}