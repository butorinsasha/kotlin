package tbank.edu.kotlin.lecture03collections1

import tbank.edu.kotlin.lecture03collections1.Collections.Companion.immutableListConstruction
import tbank.edu.kotlin.lecture03collections1.Collections.Companion.mutableListConstuction
import java.util.*

class Collections {
    companion object {
        fun immutableListConstruction() {
            var immutableList = listOf("This", "is", "Sparta")
            println(immutableList.joinToString(separator = " ", postfix = "!"))
            println(immutableList[0])
            println(immutableList.get(0))
//            immutableList[0] = "What" // -> Compilation error: cant change elements in immutable list

//           'var' can be reassigned to another list of
            immutableList = listOf("Never", "say", "\"never\"")
            println(immutableList.joinToString(separator = " ", postfix = "!"))
        }

        fun mutableListConstuction() {
            val mutableList = mutableListOf("This", "is", "Sparta")
            mutableList.add(0, "Is")
            mutableList[1] = "this"
            mutableList[mutableList.lastIndex]="Sparta?"
            mutableList.removeAt(2)
            println(mutableList.joinToString(separator = " ") { it.uppercase(Locale.getDefault()) })
        }
    }
}

fun main() {
    immutableListConstruction()
    mutableListConstuction()
}