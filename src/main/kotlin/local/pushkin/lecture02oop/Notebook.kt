package local.pushkin.lecture02oop

class Notebook(
    override val manufacturer: String,
    override val model: String,
    private var battery: Int = 100
) : PC(manufacturer, model), Portable {
    override fun installDocker() {
        "brew install docker".prettyPrint()
    }

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