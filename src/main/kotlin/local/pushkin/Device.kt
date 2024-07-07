package local.pushkin

interface Device {
    val manufacturer: String
    val model: String

    fun deviceInfo() = "info about device".prettyPrint()

    fun String.prettyPrint() {
        println("manufacturer '${manufacturer}', model '${model}'")
        println(this)
        println()
    }
}

