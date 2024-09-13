fun main() {
    ex03()
}

fun exemploArray1() {

    var numeros = arrayOf(1, 2, 3, 4, 5)
    var nomes = arrayOf("Ana", "Bruno", "Carlos")

    println("Número na pos 0 do array de numeros: " +
            numeros[0])

    println("Nome na pos 1 do array nomes: " +
            nomes[1])

    // mostrando dados do array utilizando for

    println("Valores do array numeros:")

    for (numeroAtual in numeros) {
        print("$numeroAtual ")
    }

    // mostrando dados do array nomes utilizando foreach
    println("\nNomes do array nomes:")
    nomes.forEach { nomeAtual -> print("$nomeAtual ") }

}

fun exemploFunSimples() {

    val media = calcularMedia(5f, 7.2f, 3.7f)
    val notaFormatada = String.format("%.1f", media)
    print("Média do aluno: $notaFormatada")

}

fun calcularMedia(n1: Float, n2: Float, n3: Float) : Float {
    val media = (n1+n2+n3)/3
    return media
}

fun exemploCompanionObject() {

    println ("75 + 379 = ${Calculadora.somar(75.0, 379.0)}")
    println("87 - 13 = ${Calculadora.subtrair(87.0, 13.0)}")

}

fun ex01() {

    println("Exercício 01: Calculando a Média de Idades")

    var idades = Array(5) {0} // criando array sem valores

    for (i in idades.indices) {
        print("Informe uma ${i+1}ª idade: ")
        idades[i] = readln().toInt()
    }

    // calcula a media dos valores do array
    val media = idades.average()
    println("\nMédia das idades: $media")

}

fun ex02() {

    println("Exercício 02: Temperatura Máxima e Mínima ")

    var temperaturas = Array(7) { 0f }

    var min : Float = 0f
    var max : Float = 0f

    for (i in temperaturas.indices) {
        print("Informe a temperatura do ${i+1}º dia: ")
        temperaturas[i] = readln().toFloat()

        /*
        if (i == 0) {
            min = temperaturas[0]
            max = temperaturas[0]
        } else {

            if (temperaturas[i] > max) {
                max = temperaturas[i]
            } else if (temperaturas[i] < min) {
                min = temperaturas[i]
            }

        }*/

        // melhorando a abordagem com o when
        when {
            i == 0 -> {
                min = temperaturas[0]
                max = temperaturas[0]
            }
            temperaturas[i] > max -> max = temperaturas[i]
            temperaturas[i] < min -> min = temperaturas[i]
        }

    }

    // verificar valor minimo e maximo dentro um array
    min = temperaturas.min()
    max = temperaturas.max()

    println("Temperatura mínima: $min")
    println("Temperatura máxima: $max")

}

fun ex03(){

    /**
     *Exercício 03: Contando Letras em um Nome
     * Ana é uma estudante que está aprendendo sobre programação e gostaria de criar um
     * programa que conte quantas vezes uma determinada letra aparece em seu nome. Desenvolva
     * um programa que peça o nome e a letra a ser contada, e exiba o resultado.
     * Dicas:
     * 1. Peça ao usuário para digitar o nome.
     * 2. Peça ao usuário para digitar a letra que deseja contar.
     * 3. Use um loop para contar quantas vezes a letra aparece no nome.
     * 4. Exiba o resultado.
     */

    println("Exercício 03: Contando Letras em um Nome")

    println("Digite um nome qualquer: ")
    var nome = readln()

    println("Digite a letra que deseja contar: ")
    var letra = readln()[0]

    var qtLetras = 0

    for (char in nome){
        if(char.equals(letra, ignoreCase = true)){
            qtLetras++
        }
    }
    println("No nome (${nome}) a letra (${letra}) aparece ${qtLetras} vezes")
}

fun ex04(){

    /**
     * Exercício 04: Procurando um Número em um Array
     * Lucas é um desenvolvedor iniciante e está praticando como procurar valores em arrays. Ele
     * gostaria de criar um programa que permita ao usuário procurar um número específico em um
     * array de números inteiros. O programa deve informar se o número está presente ou não.
     * Dicas:
     * 1. Crie um array de números inteiros.
     * 2. Peça ao usuário para digitar o número que deseja procurar.
     * 3. Use um loop para verificar se o número está presente no array.
     * 4. Exiba uma mensagem informando se o número foi encontrado ou não.
     */

    println("Exercício 04: Procurando um Número em um Array")


}

fun ex05() {

    var nomes = Array(5) { "" }

    for (i in nomes.indices) {
        print("Digite o ${i+1}º nome: ")
        nomes[i] = readln()
    }

    // ordenar os nomes em ordem alfabetica
    nomes.sort()

    println("Nome em orgem alfabética: ")
    nomes.forEach { nomeAtual -> println(nomeAtual) }

}

fun ex17() {

    println("Id atual: ${Exercicio17.gerarID()}")
    println("Id atual: ${Exercicio17.gerarID()}")
    println("Id atual: ${Exercicio17.gerarID()}")
    println("Id atual: ${Exercicio17.gerarID()}")
    println("Id atual: ${Exercicio17.gerarID()}")
}