package org.example.lesson11

class User private constructor(
    val userId: Int,
    val userName: String,
) {
    class Builder(private val userId: Int) {
        private var userName: String = ""
        fun userName(name: String) = apply { userName = name }
        fun build() = User(userId, userName)
    }
}

class Message private constructor(
    val authorId: Int,
    val message: String,
) {
    class Builder(private val authorId: Int) {
        private var message: String = ""
        fun message(text: String) = apply { message = text }
        fun build() = Message(authorId, message)
    }
}

class Forum(
    private val users: MutableList<User> = mutableListOf(),
    private val messages: MutableList<Message> = mutableListOf(),
    private var nextUserId: Int = 1
) {
    fun createNewUser(userName: String): User {
        val user = User.Builder(nextUserId++)
            .userName(userName)
            .build()
        users.add(user)
        return user
    }

    fun createNewMessage(userId: Int, text: String): Message? {
        val userExists = users.any { it.userId == userId }
        if (!userExists) return null
        val message = Message.Builder(userId)
            .message(text)
            .build()
        messages.add(message)
        return message
    }

    fun printThread() {
        for (msg in messages) {
            val authorName = users.find { it.userId == msg.authorId }?.userName ?: "Unknown"
            println("$authorName: ${msg.message}")
        }
    }
}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Alice")
    val user2 = forum.createNewUser("Bob")
    forum.createNewMessage(user1.userId, "Hello everyone!")
    forum.createNewMessage(user1.userId, "How are you?")
    forum.createNewMessage(user2.userId, "Hi Alice!")
    forum.createNewMessage(user2.userId, "I'm fine, thanks!")

    forum.printThread()
}