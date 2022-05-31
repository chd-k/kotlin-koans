fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td(getCellColor(0, 0)) {
                    text("Product")
                }
                td(getCellColor(0, 1)) {
                    text("Price")
                }
                td(getCellColor(0, 2)) {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for ((index, prod) in products.withIndex()) {
                tr(getTitleColor()) {
                	td(getCellColor(index, 0)) {
                    	text(prod.description)
                	}
                	td(getCellColor(index, 1)) {
                    	text(prod.price)
                	}
                	td(getCellColor(index, 2)) {
                    	text(prod.popularity)
                	}
            	}
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, column: Int) = if ((index + column) % 2 == 0) "#dce4ff" else "#eff2ff"
