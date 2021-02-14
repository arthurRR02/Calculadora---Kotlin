import kotlin.math.log
import kotlin.math.pow

fun main(){
    println("Digite um número: ")
    var num1 = readLine()!!.toFloatOrNull()
    while (num1 == null || num1.equals("")){
        println("Digite um valor")
        num1 = readLine()!!.toFloatOrNull()
    }

    println("Digite outro número: ")
    var num2 = readLine()!!.toFloatOrNull()
    while(num2 == null || num2.equals("")){
        println("Digite um valor")
         num2 = readLine()!!.toFloatOrNull()
    }

    println("Selecione a operação: " +
            "\n Digite 1 para Soma" +
            "\n Digite 2 para Subtração" +
            "\n Digite 3 para Multiplicação" +
            "\n Digite 4 para Divisão" +
            "\n Digite 5 para Potenciação" +
            "\n Digite 6 para Raiz" +
            "\n Digite 7 para Porcentagem" +
            "\n Digite 8 para Capitalização de valor" +
            "\n Digite 9 para Desconto de valor" +
            "\n Digite 10 para logaritmo")
    val operacao = readLine()!!.toInt()

    val soma = num1!! + num2!!
    val subtr = num1!! - num2!!
    val mult = num1!! * num2!!
    val divisao = num1!! / num2!!
    val potencia = num1!!.pow(num2!!)
    val raiz = num1!!.pow(1/num2!!)
    val porcent = num1!! * (num2!!/100)
    val fatorAcresc = num1!! * (1 + num2!!/100)
    val fatorDesconto = num1!! * (1 - num2!!/100)
    val logaritmo = log(num1!!, num2!!)

    when(operacao){
        1 -> println(soma)
        2 -> println(subtr)
        3 -> println(mult)
        4 -> println(divisao)
        5 -> println(potencia)
        6 -> println(raiz)
        7 -> println(porcent)
        8 -> println(fatorAcresc)
        9 -> println(fatorDesconto)
        10 -> println(logaritmo)
        else -> println("Selecione uma opção válida")
    }



}