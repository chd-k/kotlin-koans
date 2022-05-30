// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =
    this.customers.fold(customers[0].getOrderedProducts().toSet()) {
        commonProducts, customer -> commonProducts intersect customer.getOrderedProducts()
    }

fun Customer.getOrderedProducts(): List<Product> =
        this.orders.flatMap { it.products }
        
