class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        val invokable: Invokable = this
        invokable.numberOfInvocations++
        return invokable
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()
