
fun main() {
    val s: Short = Short.MAX_VALUE  // 32767
    val b: Byte = Byte.MAX_VALUE    // 127

    val b1: Byte = s.toByte()       //
//    val b2: Byte = s as Byte        // ClassCastException: class java.lang.Short cannot be cast to class java.lang.Byte
    val b3: Byte? = s as? Byte      // null

    val s1: Short = b.toShort()
//    val s2: Short = b as Short      // java.lang.ClassCastException: class java.lang.Byte cannot be cast to class java.lang.Short
    val s3: Short? = b as? Short    // null

    println("s = $s")
    println("b = $b")

    println("b1 = $b1")             // -1
//    println("b2 = $b2")           // java.lang.ClassCastException: class java.lang.Byte cannot be cast to class java.lang.Short
    println("b3 = $b3")             // null

    println("s1 = $s1")             // 127
//    println("s2 = $s2")           // java.lang.ClassCastException: class java.lang.Byte cannot be cast to class java.lang.Short
    println("s3 = $s3")             // null
}
