//    variable Constants
const val APP = "Learning Powerfull Kotlin"
const val VERSION = "1.0"
fun main() {
    var fullName: String = "Muhammad Al-Farisi"
    val namaPanggilan: String = "Salman"
    val age: Int = 27

    lateinit var namafaiz: String
    println(fullName)
    println(namaPanggilan)
    fullName = "Salman"
    println(age)
    println(fullName)
    println(namaPanggilan)

    fun editNamaFaiz(){
        namafaiz = "Muhammad faiz"
        println(namafaiz)
    }

    editNamaFaiz()

    fun printConstants(){
        println("====Constants Print====")
        println(APP)
        println(VERSION)
    }

    printConstants()
}

