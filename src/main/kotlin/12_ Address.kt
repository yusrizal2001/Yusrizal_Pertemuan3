fun copyAddress(address: `11_Address`):`11_Address`{
    val result = `11_Address` () //there's no'new keyword in Kotlin
    result.name = address.name //accessors are called
    result.street = address.street
    // ...
    return result
}