// Archivo principal para ejecutar el programa.
fun main() {
    // Ingreso de datos por parte del usuario.
    println("Ingrese su documento:")
    val documento = readLine() ?: ""
    println("Ingrese su nombre completo:")
    val nombre_completo = readLine() ?: ""
    println("Ingrese su teléfono:")
    val telefono = readLine() ?: ""
    println("Ingrese su correo:")
    val correo = readLine() ?: ""

    // Creación de instancia de Usuario para validar los datos ingresados.
    val usuario = Usuario(documento, telefono, correo)

    val documentoValido = usuario.validarDocumento()
    val telefonoValido = usuario.validarTelefono()
    val correoValido = usuario.validarCorreo()

    // Si todas las validaciones son exitosas, se crea un nuevo huésped y se muestra el registro exitoso.
    if (documentoValido && telefonoValido && correoValido) {
        val huesped = Huesped(documento, nombre_completo, telefono, correo)
        println("Registro exitoso: $huesped")
    } else {
        println("Error en el registro. Por favor revise los datos ingresados.")
    }
}