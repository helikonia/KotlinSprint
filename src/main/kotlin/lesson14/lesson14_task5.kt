package org.example.lesson14

open class BaseMessage(
    val id: Int,
    val author: String,
    val text: String,
)

class Message(
    id: Int,
    author: String,
    text: String,
) : BaseMessage(id, author, text)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : BaseMessage(id, author, text)

class Chat() {

    private val messages = mutableListOf<BaseMessage>()
    private var nextMessageId = 1
    fun addMessage(author: String, text: String): Int {
        val msg = Message(nextMessageId++, author, text)
        messages.add(msg)
        return msg.id
    }


    fun addThreadMessage(parentMessageId: Int, author: String, text: String): Int {
        val child = ChildMessage(nextMessageId++, author, text, parentMessageId)
        messages.add(child)
        return child.id
    }

    fun printChat() {
        val grouped = messages.groupBy { msg ->
            when (msg) {
                is ChildMessage -> msg.parentMessageId
                else -> msg.id
            }
        }
        val parentMessages = messages.filterIsInstance<Message>()

        for (msg in parentMessages) {
            println("${msg.author}: ${msg.text}")
            val children = grouped[msg.id]?.filterIsInstance<ChildMessage>()
            if (!children.isNullOrEmpty()) {
                for (child in children) {
                    println("\t${child.author}: ${child.text}")
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()
    val m1 = chat.addMessage("Ann", "Hello!")
    val m2 = chat.addThreadMessage(m1, "Oleg", "Hello, Ann!")
    chat.printChat()

}