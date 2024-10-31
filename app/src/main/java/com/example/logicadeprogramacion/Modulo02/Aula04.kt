package com.example.logicadeprogramacion.Modulo02

fun main () {

    //TODO: Trabajando solo con IF

//    println("Digite un numero:")
//
//    val input = try {
//        readln().toInt()
//
//// Intenta convertir a número
//    } catch (e: NumberFormatException) {
//        println("Por favor, ingresa un número válido.")
//
//
//        0  // O cualquier otro valor por defecto
//    }
//
//    if (input > 10) {
//        println("$input é maior que 10")
//    }
//
//    if (input < 10) {
//        println("$input é menor que 10")
//    }

    //TODO: Ahora trabajando con if y else
//
//    val input = readln().toInt()
//
//    if (input > 10) {
//        println("$input é maior o igual que 10")
//    } else if (input == 9) {
//        println("$input é igual a 9")
//    } else if (input == 8) {
//        println("$input é igual a 8")
//    } else if (input == 7) {
//        println("$input é igual a 7")
//    } else {
//        println("$input é menor o igual a 6")
//    }
//
////TODO: OPERADORES $$, || Y !
//
//    print("Digite sua Idade:")
//    val idade = readln().toInt()
//
//    print("Digite sua senha:")
//    val senha = readln()
//
//    val senhaCorreta = "1234"
//
//    // Uso del Operador &&
//
//    if (idade >= 18 && senha == senhaCorreta) {
//        println("Acesso permitido: Vocé é maior de idade e digito a senha correcta ")
//    } else {
//        println("Acesso Denegado: Idade insuficiente ou senha Incorreta")
//    }
//
//    //Uso del operador ||
//
//    if (idade < 18 || senha != senhaCorreta) {
//        println("Restriciones: Voce é menor de idade ou digito a senha errada")
//    } else {
//        println("Voce Atende os requisitos de idade e senha")
//    }
//
//    val bloqueioTemporario = false
//    if (!bloqueioTemporario) {
//        println("Seu Acesso nao esta Bloqueado")
//    } else {
//        println("Seu Acesso esta Temporariamente Bloqueado")
//
//    }

    //TODO: Operado when

    print("Digitte o nome do mes:")
    val mes = readln() // este metodo pide al usuario que insira un mes y lo guarda en la variable mes

    var  estacao = ""  // se declara una variable vacia que va a ser prenchida por el usuario
    //tiene que ser var para poder ser modificada

    when (mes) {
        "dezembro", "janeiro", "febereiro" -> estacao = "Verao"
        "marco", "abril", "maio" -> estacao = "outono"
        "juno", "julho", "agosto" -> estacao = "inverno"
        "setembro", "outubro", "novembre" -> estacao = "primavera"
        else -> println("Mes invalido: Digite un mes valido") // se usa un else dentro do when para cuando
        // el usuario digite un comando errado
    }

    // aqui usameos un if para cuando la estacion sea diferenta a la variable vacia
    // porue el usuario ya digito un mes y fue aprovado por el else de arriba

    if (estacao != "") {
        println("A estacao correspondente ao mes $mes é: $estacao")
    }

    // En este caso si no digitamos el mes correcto el codigo cierra. debe estar escrito de la misma forma al codigo

}



