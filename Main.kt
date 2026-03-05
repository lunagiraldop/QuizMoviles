fun main() {
    println("Ingrese su documento:")
    val documento = readLine() ?: ""
    println("Ingrese su nombre completo:")
    val nombre_completo = readLine() ?: ""
    println("Ingrese su teléfono:")
    val telefono = readLine() ?: ""
    println("Ingrese su correo:")
    val correo = readLine() ?: ""

    val usuario = Usuario(documento, telefono, correo)

    val documentoValido = usuario.validarDocumento()
    val telefonoValido = usuario.validarTelefono()
    val correoValido = usuario.validarCorreo()

    if (documentoValido && telefonoValido && correoValido) {
        val huesped = Huesped(documento, nombre_completo, telefono, correo)
        println("Registro exitoso: $huesped")
    } else {
        println("Error en el registro. Por favor revise los datos ingresados.")
    }
}