// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> {
    val (more, _) = this.customers.partition { it.orders.count { it.isDelivered == false } > it.orders.count { it.isDelivered == true } }
    return more.toSet()
}
