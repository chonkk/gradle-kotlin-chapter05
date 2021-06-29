import kotlin.math.roundToInt

class chapter05 {
}
fun main(){
//    sample1()
//    sample2()
//    sample3()
//    sample4()
//    sample5()
//    sample6()
//    sample7()
//    sample8()
    sample9()
}

fun sample9() {
    fun getTemperatureAtAirport(code: String): String = "${(Math.random() * 30).roundToInt() + code.count()} C"
    // (코드, 온도) Pair의 리스트
    val airportCodes = listOf("LAX", "SFO", "PDX", "SEA")
    val temperatures = airportCodes.map { code -> code to getTemperatureAtAirport(code) }

    for (temperature in temperatures) {
        println("Airport: ${temperature.first}: Temperature: ${temperature.second}")
    }

}

fun sample8() {
    val sites = mapOf("naver" to "naver.com", "daum" to "daum.net")
    for (site in sites) {
        println("${site.key} ---- ${site.value}")
    }

    for ((key, value) in sites) {
        println("$key ---- $value")
    }
}

fun sample7() {
    val sites = mapOf("naver" to "naver.com", "daum" to "daum.net")
// null이라면 default값 리턴
    val siteName2: String? = sites.getOrDefault("naver1", "localhost.com")
    println(siteName2)

// map도 마찬가지로 + - 연산자 이용가능하다.
    val copySites = sites + ("kakao" to "kakao.com")
    println(copySites)

    val copySites2 = copySites - "daum"
    println(copySites2)

    val copySites3 = copySites - "daum2"
    println(copySites3)
}

fun sample6() {
    val sites = mapOf("naver" to "naver.com", "daum" to "daum.net")
    // get은 map에 해당하는 키가 없다면 nullable 타입을 리턴한다. 아래의 코드는 동작하지 않는다.
//val siteName: String = sites.get("naver1")
//println(siteName)

// Nullable 참조 타입 사용하자
    val siteName: String? = sites.get("naver1")
    println(siteName)

    val siteName1: String? = sites["naver"]
    println(siteName1)

// null이라면 default값 리턴
    val siteName2: String? = sites.getOrDefault("naver1", "localhost.com")
    println(siteName2)

    println(sites.containsKey("naver"))
    println(sites.containsValue("naver.com"))
    println(sites.contains("naver"))
    println("naver" in sites)
}

fun sample5() {
    val fruits: Set<String> = setOf("Apple", "Banana", "Apple")
    println(fruits)
}

fun sample4() {
    val names = listOf("Tom", "Jerry")
    println(names.javaClass)

    for ((index, name) in names.withIndex()) {
        println("$index, $name")
    }
}

fun sample3() {
    // 이뮤터블 리스트
    val fruits = listOf("Apple", "Banana", "Grape")
    println("first fruit : ${fruits[0]}, second fruit : ${fruits[1]}")
    println(fruits.contains("Apple"))
    println("Apple" in fruits)
}

fun sample2() {
    val smartNumbers = intArrayOf(1, 2, 3, 4, 5)

// 이 외에 사용방법
    println(smartNumbers.size)
    println(smartNumbers.average())
    println(smartNumbers.sum())

    println(Array(5) { i -> (i + 1) * (i + 1) }.sum())
}

fun sample1() {
    val alphabet = arrayOf("a", "b", "c", "d")

    println("${alphabet[0]} and ${alphabet[1]}")
}
