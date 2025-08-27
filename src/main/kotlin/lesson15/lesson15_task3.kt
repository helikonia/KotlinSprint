package org.example.lesson15

abstract class BasicUser(val login: String, val avatar: String, val isOnline: Boolean) {

    abstract fun readForum()
    abstract fun sendMessage()
}

class User(login: String, avatar: String, isOnline: Boolean) : BasicUser(
    login = login,
    avatar = avatar,
    isOnline = isOnline,
) {
    override fun readForum() {
        println("User reads forum")
    }

    override fun sendMessage() {
        println("User sends message")
    }
}

class Admin(login: String, avatar: String, isOnline: Boolean) : BasicUser(
    login = login,
    avatar = avatar,
    isOnline = isOnline
) {
    override fun readForum() {
        println("Admin reads forum")
    }

    override fun sendMessage() {
        println("Admin sends message")
    }

    fun deleteMsg() {
        println("Admin deleted message")
    }

    fun deleteUser() {
        println("Admin deleted User")
    }
}

fun main() {
    val user1 = User("meow", "cat", true)
    val admin1 = Admin("admin", "admin", true)

    user1.sendMessage()
    user1.readForum()
    admin1.sendMessage()
    admin1.readForum()
    admin1.deleteMsg()
    admin1.deleteUser()
}