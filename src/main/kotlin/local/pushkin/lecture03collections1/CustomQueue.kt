package local.pushkin.lecture03collections1

class CustomQueue<T> {
    private val elements: MutableList<T> = mutableListOf()

    fun isEmpty(): Boolean = elements.isEmpty()

    fun size(): Int = elements.size

    fun enqueue(item: T) {
        elements.add(item)
    }

    fun dequeue(): T? {
        if (isEmpty()) {
            return null
        }
        return elements.removeAt(0)
    }

    fun peek(): T? {
        if (isEmpty()) {
            return null
        }
        return elements[0]
    }

    override fun toString(): String = elements.toString()
}

fun main() {
    val customQueue = CustomQueue<String>()
    customQueue.enqueue("Kotlin")
    customQueue.enqueue("Java")
    customQueue.enqueue("Python")
    println("Custom Queue: $customQueue")

    println("Dequeued: ${customQueue.dequeue()}")
    println("Custom Queue after dequeue: $customQueue")

    println("Peek: ${customQueue.peek()}")
}