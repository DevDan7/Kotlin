package com.example.logicadeprogramacion.Modulo02

// TODO: Lazos de repeticion

fun main () {

    // for

//    for (i in 2 .. 10) { // aqui la i es una variable que puede ser cualquiera por buenas practicas se usa la i
//        println("Hello")       // por buenas practicas se usa la i. el 1 es donde inicia el lazo hasta el 10
//    }

//    for (i in 2 .. 10) {
//        println(i)       // aqui inicia en i que es declarada despues del in hasta el ultimo numero
//    }

    // ahora lo podemos hacer con listas
//
//    val listaDeMercado = mutableListOf<String>("carne", "frango", "peixe") // la declaracion de String la s debe estar en mayuscula
//    listaDeMercado.add("Agua")
//
//    val listaDosNumerosMenoresQue10 = listOf(1..10)
//
//
//    for (item in listaDeMercado) { // el item es una variable que puede cambiar
//        println(item)       // aqui inicia en i que es declarada despues del in hasta el ultimo numero
//
//    }
//
//    for (i in listaDosNumerosMenoresQue10) {
//        println(i)
//    }

    // usando for con if y else

//    val nomes = listOf("Sorennys", "Daniel", "Viky", "Mv")
//
//    for (nome:String in nomes) {
//        if (nome.length > 4) {
//            println("$nome es un nombre largo")
//        } else if (nome.length <= 4) {
//            println("$nome es un nome corte")
//        }

        // usando While lo usamos caundo no tenem os los valores definidos
//
//        val senhaCorreta = "1234"
//            print("Digite a senha:")
//            var senha = readln()
//
//        while (senha != senhaCorreta){
//            println("senha incorreta")
//            println("Digite sua senha novamente:")
//            senha = readln()
//        }
//
//        println("senha correta: Acesso Permitido")

    //TODO: PROGRAMA PARA USUARIO INTRODUCIR SENHA COM MAXIMO DE INTEMTOS

//    val correctPassword = "1234"
//    var attempts = 0 // se crea una variable en 0 para contar el numero de intentos
//    var isBlocked = false // cuando es false es porque la senha a sido bloqueada
//
//    while (attempts < 3 && !isBlocked) { // este while entra cuando el numero de intentos es menor a 3 y
//                                         // la senh es correcta o en el caso diferente de false
//        println("Introduce tu contraseña:") // se le da un aviso al usuario para inserir la senha
//        val userInput = readLine() // despues del usuario ingresar se guarda en la variable userInput
//
//        // Si el numero de intentos es menor a 3 y la senha no esta bloqueada pasa el if
//
//        if (userInput == correctPassword) { // so la senha es correta
//            println("Acceso concedido.")
//            break // este break finaliza el codigo cuando la senha es correcta
//            // si el break seguiria corriendo el progrma preguntando otra vez la senha
//
//        } else { // si la senha es incorrecta pasa a este else
//            attempts++ // aumenta de 1 en  1 hasta llegar al limite de intentos que esta
//            // en la condicion del while
//            println("Contraseña incorrecta. Te quedan ${3 - attempts} intentos.")
//        }
//
//        if (attempts == 3) {
//            isBlocked = true
//            println("Acceso bloqueado. Excediste el número de intentos permitidos.")
//        }
//    }

    //TODO: TRABAJNDO CON DO

//    println("Ingresa un número mayor que 10:")
//    var numero = readLine()!!.toInt()  // Lee el número y lo convierte a Int
//
//    while (numero <= 10) { // Verifica si el número es menor o igual a 10
//        println("Número no válido. Intenta de nuevo:")
//        numero = readLine()!!.toInt()  // Vuelve a leer el número
//    }
//
//    println("Número aceptado: $numero")

    var numero: Int

    do {
        println("Ingresa un número mayor que 10:")
        numero = readLine()!!.toInt() // Lee el número y lo convierte a Int
    } while (numero <= 10) // Repite si el número es menor o igual a 10

    println("Número aceptado: $numero")

    // *********   Explicando cuando iniciar una variable vacia o null

    var puntaje: Int? = null // 'puntaje' puede ser un número o nulo

    // Simulando la opción de no realizar el examen
    println("¿Realizaste el examen? (sí/no)")
    val respuesta = readLine()

    if (respuesta == "sí") {
        println("Ingresa tu puntaje:")
        puntaje = readLine()!!.toInt() // Aquí el usuario ingresa un número válido
    }

    // Verificando si el puntaje es nulo
    if (puntaje != null) {
        println("Tu puntaje es: $puntaje")
    } else {
        println("No se ingresó ningún puntaje porque no realizaste el examen.")
    }



    var puntaje1: Int = 0 // Inicializa 'puntaje' con 0 (siempre tiene un valor)

    // Simulando la obtención de un puntaje de un examen
    println("Ingresa tu puntaje:")
    puntaje1 = readLine()!!.toInt() // Asume que el usuario ingresa un número válido

    println("Tu puntaje es: $puntaje") // Muestra el puntaje






}