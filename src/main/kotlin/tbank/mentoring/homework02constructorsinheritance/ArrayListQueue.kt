package tbank.mentoring.homework02constructorsinheritance

import tbank.mentoring.homework01sealedclasses.Drivable
import tbank.mentoring.homework01sealedclasses.Vehicle
import tbank.mentoring.homework03queue.Queue

fun main() {
    val car1 = Vehicle.Car(190, "Hatchback")
    val car2 = Vehicle.Car(200, "Sedan")
    val plane1 = Vehicle.Plane(2500, "Su27")
    val plane2 = Vehicle.Plane(2778, "Mig29")
    val boat1 = Vehicle.Boat(50)
    val boat2 = Vehicle.Boat(5)
    val arrayListQueue1 = ArrayListQueue<Drivable>()

    arrayListQueue1.enqueue(car1)
    arrayListQueue1.enqueue(car2)
    arrayListQueue1.enqueue(plane1)
    arrayListQueue1.enqueue(plane2)
//    arrayListQueue1.enqueue(boat1)
//    arrayListQueue1.enqueue(boat2)

    println(arrayListQueue1)
    println(arrayListQueue1.count)

    arrayListQueue1.dequeue()
    println(arrayListQueue1)
    println(arrayListQueue1.count)
    println(arrayListQueue1.peek())
    println(arrayListQueue1.count)

    val arrayList = arrayListOf(car1, plane1)
    val arrayListQueue2 = ArrayListQueue(arrayList)
    println(arrayListQueue2)

    val arrayListQueue3 = ArrayListQueue(arrayListOf(car1, car1))
    println(arrayListQueue3)
}

class ArrayListQueue<D : Drivable>(private val arrayList: ArrayList<D>) : Queue<D> {

//    constructor(vararg v: V) : this(v.toCollection(ArrayList()))
    constructor(vararg v: D) : this(arrayListOf(*v))

    override fun enqueue(element: D): Boolean {
        return arrayList.add(element)
    }

    override fun dequeue(): D? =
        if (this.isEmpty) null
        else arrayList.removeAt(0)

    override val count: Int
        get() = arrayList.size

    override fun peek(): D? = arrayList.getOrNull(0)

    override fun toString() = arrayList.toString()
}