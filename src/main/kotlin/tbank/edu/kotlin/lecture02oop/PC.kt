package tbank.edu.kotlin.lecture02oop

open class PC(
    override val manufacturer: String,
    override val model: String
) : Device {
    open fun installDocker() {
        "\$apt-get install docker".prettyPrint()
    }
}