//Untuk lebih meringkas kode program kelas person maka kita dapat menggabungkan
//Proses deklarasi dan menginisialisasi sebuah variabel pada blok inisialisasi kedalam satu
//statement seperti berikut:
class PersonB (_firstName: String, _lastName: String, _age: Int){
    var firstName:String = _firstName
    var lastName:String= _lastName
    var age:Int = _age
}
fun main(){
    val budi = PersonB("Budi", "Budi", 21)
    println("name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")

}