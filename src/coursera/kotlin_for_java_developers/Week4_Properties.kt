package coursera.kotlin_for_java_developers

val foo1 = run {
    println("Calculating the answer...")
    42
}

val foo2: Int
    get() {
        println("Calculating the answer...")
        return 42
    }

fun main() {
    println("$foo1 $foo1 $foo2 $foo2")
}
