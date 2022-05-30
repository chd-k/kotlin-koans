import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

class TimeIntervalAndAmount(val interval: TimeInterval, val amount: Int)

operator fun TimeInterval.times(amount: Int): TimeIntervalAndAmount = TimeIntervalAndAmount(this, amount)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeIntervalAndAmount: TimeIntervalAndAmount): MyDate 
= this.addTimeIntervals(timeIntervalAndAmount.interval, timeIntervalAndAmount.amount)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
