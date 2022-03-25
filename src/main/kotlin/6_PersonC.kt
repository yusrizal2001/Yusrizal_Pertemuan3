//Untuk lebih ringkasannya lagi, deklarasi dan inilisasi property dapat dilakukan hanya didalam
//Parameter konstruktor utama, seperti contoh kode program berikut:
class PersonC (var firstName: String, var lastName: String, var age: Int){}
fun main(){
    val budi = PersonC("budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}

