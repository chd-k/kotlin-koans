data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(comparable: MyDate): Int {
        if (this.year != comparable.year) return this.year - comparable.year 
        else {
            if (this.month != comparable.month) return this.month - comparable.month
            else return this.dayOfMonth - comparable.dayOfMonth
        }
    } 
}

fun test(date1: MyDate, date2: MyDate) {
    println(date1 < date2)
}
