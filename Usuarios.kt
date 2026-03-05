// Creación de clase para representar a un usuario
class Usuario( val documento: String, val telefono: String, val correo: String) {
    // Funciones de validación del documento no puede ser vacío.
    fun validarDocumento(): Boolean {
        if(documento.isNotBlank()) {
            return true
        } else {
            println("\n --Documento vacío")
            return documento.isNotBlank()
        }
    }

    // Función de validación del teléfono, debe contener solo dígitos.
    fun validarTelefono(): Boolean {
        if(telefono.all { it.isDigit() }) {
            return true
        } else {
            println("\n --Teléfono inválido")
            return false
        }
    }

    // Función de validación del correo, debe contener "@" y ".".
    fun validarCorreo(): Boolean {
        if(correo.contains("@") && correo.contains(".")) {
            return true
        } else {
            println("\n --Correo inválido")
            return false
        }
    }
}
