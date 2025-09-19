package org.example.lesson17

class User(login: String, password: String) {

    var userLogin = login
        set(value) {
            println("You changed the login from $field to $value")
            field = value
        }
    private var passwordField = password
    var userPassword: String
        get() = "*".repeat(passwordField.length)
        set(value) {
            println("You can not change the password")
        }

}

fun main() {
    val user = User("Monro", "432-084-0")
    println("Current login: ${user.userLogin}")
    println("Current password: ${user.userPassword}")

    user.userLogin = "Meow"
    println("New login: ${user.userLogin}")

    user.userPassword = "pfojgpd"
    println("Password after attempt to change: ${user.userPassword}")
}