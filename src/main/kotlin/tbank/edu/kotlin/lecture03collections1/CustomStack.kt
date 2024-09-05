package tbank.edu.kotlin.lecture03collections1

class CustomStack<T> {
    private val elements: MutableList<T> = mutableListOf()

    fun isEmpty(): Boolean = elements.isEmpty()

    fun size(): Int = elements.size

    fun push(item: T) {
        elements.add(item)
    }

    fun pop(): T? {
        if (isEmpty()) {
            return null
        }
        return elements.removeAt(elements.size - 1)
    }

    fun peek(): T? {
        if (isEmpty()) {
            return null
        }
        return elements[elements.size - 1]
    }

    override fun toString(): String = elements.toString()
}

fun main() {
    val customStack = CustomStack<String>()
    customStack.push("Kotlin")
    customStack.push("Java")
    customStack.push("Python")
    println("Custom Stack: $customStack")

    println("Popped: ${customStack.pop()}")
    println("Custom Stack after pop: $customStack")

    println("Peek: ${customStack.peek()}")
}