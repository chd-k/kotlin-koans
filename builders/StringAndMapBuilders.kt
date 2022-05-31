import java.util.HashMap

fun buildMutableMap(build: HashMap<Int, String>.() -> Unit): Map<Int, String> {
    val mutableMap = HashMap<Int, String>()
    mutableMap.build()
    return mutableMap
}

fun usage(): Map<Int, String> {
    return buildMutableMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
