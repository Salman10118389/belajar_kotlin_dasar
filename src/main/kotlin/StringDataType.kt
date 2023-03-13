fun main() {
    var address: String = """
        Jl. Ipik gandamanah,
        Gg. Oi NO.01,
        RT 004/007, Kp. Cipicung,
        Kel. Tegal Munjul,
        Kec. Purwakarta
    """.trimIndent()



    var firstName: String = "Muhammad"
    var lastName: String = "Al-Farisi"

    println(firstName)
    println(lastName)
    println(address)
//  Menggabungkan beberapa String
//  Bisa menggunakan operator plus(+)

    var fullName: String = "$firstName $lastName"

    var desc: String = "total $fullName char = ${fullName.length}"
    println(fullName)

    println(desc)
}