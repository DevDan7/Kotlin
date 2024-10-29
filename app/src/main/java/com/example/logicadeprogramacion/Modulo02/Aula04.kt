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

    println("Digite sua Idade:")
    val idade = readln().toInt()

    println("Digite sua senha:")
    val senha = readln()

    val senhaCorreta = "1234"

    if (idade >= 18 && senha == senhaCorreta) {
        println("Acesso permitido: Vocé é maior de idade e digito a senha correcta ")
    } else {
        println("Acesso Denegado: Idade insuficiente ou senha Incorreta")
    }

    

}



