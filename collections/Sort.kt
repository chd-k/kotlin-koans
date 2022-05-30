fun Shop.getCustomersSortedByOrders(): List<Customer> =
        this.customers.sortedByDescending { it.orders.size }
        
