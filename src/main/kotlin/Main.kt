fun main(args: Array<String>) {

    var nota1: Double = 0.0
    var nota2: Double = 0.0
    var nota3: Double = 0.0
    var nota4: Double = 0.0
    var media: Double = 0.0

    print("Digite a primeira nota: ")
    nota1 = readLine()!!.toDouble()
    print("Digite a segunda nota: ")
    nota2 = readLine()!!.toDouble()
    print("Digite a terceira nota: ")
    nota3 = readLine()!!.toDouble()
    print("Digite a quarta nota: ")
    nota4 = readLine()!!.toDouble()

    media = (nota1 + nota2 + nota3 + nota4) / 4

    print("A sua média é = $media ")

    if(media > 8 && media <= 10){
        println("Excelente")
    }else if(media > 5 && media <= 8){
        println("Boa")
    }else if(media > 4 && media <= 5){
        println("Regular")
    }else if(media >= 0 && media <= 4){
        println("Reprovado")
    }else{
        println("Média Inválida")
    }

}