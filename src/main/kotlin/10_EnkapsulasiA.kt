//Inisialissi sintaks getter dan setter di kotlin bersifat opsional,karena secara sefault kotlin telah
//men generate method getter dan setter untuk property yang motable (var) dan hanya getter
//untuk propety yang read-only (val). secara default kode yang ter-generate secara otomatis
//tersebut adalah seperti pada contoh sbb:

class Employee(_id: Int, _name: String, _age: Int){
    val id: Int = _id
    get() = field

    var name: String = _name
    get() = field
    set(value) {
        field = value
    }
    var age : Int =_age
    get() = field
    set(value) {
        field = value
    }
}
fun main(){
    val emp = Employee (1101, "jono", 25)
    println("id : ${emp.id}, Nama: ${emp.name}, Umur: ${emp.age}")
}