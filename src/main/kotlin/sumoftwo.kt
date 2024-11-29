package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in numbers.indices) {
        val x = numbers[i]
        val y = target - x
        if (map.contains(y)) {
            return intArrayOf(map.getValue(y), i)
        }
        map[x] = i
    }

    throw IllegalArgumentException()
}