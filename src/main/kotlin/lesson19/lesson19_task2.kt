package org.example.lesson19

enum class Category {
    CLOTHES {
        override fun getStatusDescription(): String {
            return "Category of clothes"
        }
    },
    STATIONERY {
        override fun getStatusDescription(): String {
            return "Category of stationery"
        }
    },
    OTHER {
        override fun getStatusDescription(): String {
            return "Other categories"
        }
    };

    abstract fun getStatusDescription(): String

}

class Product(val productName: String, val productId: Int, val category: Category) {

    fun printOrderInfo() {
        println(
            """
            name: $productName
            id: $productId
            category: ${
                when (category) {
                    Category.CLOTHES -> Category.CLOTHES.getStatusDescription()
                    Category.STATIONERY -> Category.STATIONERY.getStatusDescription()
                    else -> Category.OTHER.getStatusDescription()
                }
            }
        """.trimIndent()
        )
    }
}

fun main() {

    val skirt = Product("Skirt", 23, Category.CLOTHES)
    skirt.printOrderInfo()

    val pencilCase = Product("Pencil case", 45, Category.STATIONERY)
    pencilCase.printOrderInfo()

    val lipstick = Product("Lipstick", 55, Category.OTHER)
    lipstick.printOrderInfo()
}