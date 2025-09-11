package org.example.lesson17

class Folder(folderName: String, val fileAmount: Int, val isSecret: Boolean) {
    val folderName = folderName
        get() {
            return when {
                (isSecret) -> {
                    println("The folder is secret, amount of files - 0")
                    "Secret folder"
                }

                else -> {
                    println("name is $field, amount of files: $fileAmount")
                    field
                }
            }
        }

    fun printInfo() {
        println("Folder Name: $folderName")
        println(
            "File Amount: ${
                if (isSecret) {
                    0
                } else fileAmount
            }"
        )
        println("Is Secret: $isSecret")
    }
}

fun main() {
    val folder = Folder("Documents", 7, true)
    folder.printInfo()
}