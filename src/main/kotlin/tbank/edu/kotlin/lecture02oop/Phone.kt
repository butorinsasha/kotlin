package tbank.edu.kotlin.lecture02oop

class Phone(
    override val manufacturer: String,
    override val model: String,
    private var battery: Int = 100
) : Device, Portable {
    override fun work() {
        "working".prettyPrint()
        battery -= 10
    }

    override fun charge() {
        "charging".prettyPrint()
        battery = 100
    }

    override fun batteryInfo() {
        "battery $battery".prettyPrint()
    }
}