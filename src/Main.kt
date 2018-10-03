fun main(args: Array<String>) {
    val fullname: (String, String) -> String = {s1, s2 ->
        "Nama saya adalah $s1 $s2"
    }

    getFullname("Panji", "Sadewo", fullname)
}

fun getFullname(firstname: String, lastname: String, result:
(String, String) -> String){
    val res = result(firstname, lastname)
    println(res)
}