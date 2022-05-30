fun doSomethingWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy(String::length)

    val maximumSizeOfGroup = groupsByLength.values.map(List<String>::size).maxOrNull()

    return groupsByLength.values.firstOrNull { it.size == maximumSizeOfGroup }
}
