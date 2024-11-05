package com.example.logicadeprogramacion.Modulo02

//Aspecto	          Función sin devolución	                              Función con retorno
//Valor de retorno	  *No devuelve nada.	                            *Devuelve un valor (puede ser de cualquier tipo).
//Uso	              *Generalmente se usa para realizar acciones.	    *Se usa para calcular y devolver resultados.
//Almacenamiento	  *No puedes almacenar un resultado.	            *Puedes almacenar el resultado en una variable.
//Propósito	          *Realizar efectos secundarios (como imprimir).	*Calcular y proporcionar información.

fun main() {

    // aqui estamos llamando printSoma dentro de main
//    println(printSoma())
//    val soma = getSoma() // Funcion con retorno
//    println(soma)
//    val resultado = soma(5, 5)
//    println(resultado)
//
//    val result = multiplica(10,10)
//    println(result)

//    olaPessoa() // aqui estamos llaMnado la funcion con el paramatro default
//    olaPessoa("Daniel") // aqui declaramos el parametro directamente y es sustituido por el dafoult

    // funciones lambada


//    val somalb: (Int, Int) -> Int = {a,b -> a + b} // aqui ejecutamos toda la fucnion en main
//
//    println(somalb(10, 20))

val nome = "Daniel Villegas"

println(nome.uppercase())



}
// toda funcion debe ser llamada en main

// cuando la funcion no tenie Retunr ella es un procedimimiento

//fun printSoma() {
//    val resultado = 5 + 5
//    println(resultado)
//}

//fun getSoma(): Int {
//    return 5 + 10
//
//}

//fun soma(valor1: Int, valor2: Int): Int {
//    return valor1 + valor2
//}

// simplificando la funcion

//fun multiplica(a: Int, b: Int): Int = a * b
//
//fun olaPessoa(name: String = "Pessoa") {  //  estamos dando como default Pessoa
//    println("hola, $name")
//}


//todo: Funciones lambadas

fun somalb1(num1: Int, num2: Int):   Int = num1 + num2 // esta funcion va a ser llamada en main









