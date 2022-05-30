class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
	override fun iterator() = object: Iterator<MyDate> {
        var currentDate = start
        override fun hasNext(): Boolean = currentDate <= end
        override fun next(): MyDate {
            if (hasNext()) {
                val tmp = currentDate
                currentDate = currentDate.followingDate()
                return tmp
            }
            else return currentDate
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
