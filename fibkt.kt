fun fib_list(n: Int): List<Int> {
    val list = mutableListOf(1, 1)
    for (i in 2..n) {
        list += list[i - 1] + list[i - 2]
    }
    return list
}

fun fib_recurse(n: Int): Int =
    if (n == 1 || n == 0) {
        1
    } else {
        fib_recurse(n - 1) + fib_recurse(n - 2)
    }

fun main(args: Array<String>) {
    println(fib_recurse(20))
    println(fib_list(20))
}
