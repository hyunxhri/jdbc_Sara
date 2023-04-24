fun main() {

    val product = Product(5, "Smartphone", 999.99f, "The latest smartphone model", "Apple", "Electronics")

    val productId = product.createProduct(product)

    println("Product ID: $productId")

}

