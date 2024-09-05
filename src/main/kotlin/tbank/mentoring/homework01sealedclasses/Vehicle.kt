package tbank.mentoring.homework01sealedclasses

// Написать sealed class для видов транспорта (давай возьмем машина, самолет, лодка),
// которые принимают общий аргумент максимальная скорость и уникальный для каждого класса.
// Машина тип кузов, самолет модель, лодка булевый флаг парусный/ не парусны.
// И реализовать функцию, которая будет принимать в качестве аргумента тип созданного
// класса и в зависимости от типа выводить уникальные данные

fun main() {
    move(Vehicle.Car(100, "Hatchback"))
    move(Vehicle.Plane(1000))
    move(Vehicle.Boat(50))
}

sealed class Vehicle(val maxSpeed: Int) {
    class Car(maxS: Int, val type: String = "Sedan") : Vehicle(maxS), Drivable {
        override fun toString() = "${this.javaClass.simpleName}{maxSpeed=$maxSpeed, type=$type}"
    }

    class Plane(maxS: Int, val model: String = "Su27") : Vehicle(maxS), Drivable {
        override fun toString() = "${this.javaClass.simpleName}{maxSpeed=$maxSpeed, model=$model}"
    }

    class Boat(maxS: Int, val hasSail: Boolean = true) : Vehicle(maxS) {
        override fun toString() = "${this.javaClass.simpleName}{maxSpeed=$maxSpeed, hasSail=$hasSail}"
    }
}

interface Flyable {

}

interface Drivable {

}

fun move(v: Vehicle) {
    when (v) {
        is Vehicle.Car -> println("Car is moving with max speed of ${v.maxSpeed} km/h, type: ${v.type}")
        is Vehicle.Plane -> println("Plane is moving with max speed of ${v.maxSpeed} km/h, model: ${v.model}")
        is Vehicle.Boat -> println("Boat is moving with max speed of ${v.maxSpeed} km/h, has sail: ${v.hasSail}")
    }
}
