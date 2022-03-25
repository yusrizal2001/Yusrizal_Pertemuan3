//Blok inisialisasi diawali dengan keyword init, selama instansiasi sebuah objek, uturan eksekusi
//Blok insalisasi sama dengan urutan yang ada pada tubuh class, berselangkan inisialisasi
//Property-nya
class InitOrder(name: String) {
    val firstProperty = "First property: $name".also (::println)
    init {
        println("First initializer block that prints ${name}")

    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init{
        println("Second initiazer block that prints ${name.length}")
    }
}
fun main(){
    val initOrder = InitOrder("RPL")
}