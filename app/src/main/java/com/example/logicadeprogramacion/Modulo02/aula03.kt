package com.example.logicadeprogramacion.Modulo02

fun main() {
//    val name = "Hello WORLD"
//    println(name)
//
//    val notas: List<Double> = listOf(2.5, 5.0, 5.1, 7.5) //Aqui estamos especificando de usar numeros decimales colocando
//    // List<Double> antes de declarar la variable
//
//    val quantidadeDeNotas = notas.size
//    val somaDasNotas = notas.sum()
//    val media = somaDasNotas / quantidadeDeNotas
//
//    println("a media de notas é $media")
//
//    if (media >= 7){
//        println("Alunno Aprovado")
//    } else if (media >= 5 ){
//        println("Aluno Pode Reparar")
//    }
//    else {
//        println("Aluno Reprovado")
//    }
////booleanos
//
//    val estaDeNoite = true
//
//    val estaFrio = false

// Colletions

    // lista Inmutable (No se pueden alterar)

    val listaDoMercado = listOf("manzana", "banana", "frango", "uva")
    // no se puede alterar
//    listaDoMercado[0] = "coco"

    println(listaDoMercado)


    val listaDoMercadoMutable = mutableListOf("manzana", "banana", "frango", "uva")
    listaDoMercadoMutable[0] = "coco"
    listaDoMercadoMutable.add("papa")
    println(listaDoMercadoMutable)

    // lista que muestras numero no repetidos

    val setDosNumeros = setOf(1,2,3,5,5,6,8,3,4)
    println(setDosNumeros)

}
