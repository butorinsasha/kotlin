package tbank.edu.kotlin.lecture02oop

fun main() {
    val hp = PC("HP", "Pro desk")
//    hp.installDocker()

    val mac = Notebook("Apple", "Macbook Pro")
//    mac.installDocker()

    val iPhone = Phone("Apple", "12")


//    val portables = listOf(mac, iPhone)
//    portables.forEach{ it.work() }

    val allDevices = listOf(hp, mac, iPhone)
    allDevices.forEach{ it.deviceInfo() }

//    with(mac) {
//       batteryInfo()
//       work()
//       work()
//       batteryInfo()
//       charge()
//       batteryInfo()
//    }
}