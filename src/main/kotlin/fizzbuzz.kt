package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val results = Array(n) {""}
    for (i in results.indices) {
        val fizzOrBuzz = fizzOrBuzz(i)
        results[i] = fizzOrBuzz
    }
    return results
}

private fun fizzOrBuzz(n: Int): String{
    if (n.mod(3) == 0 && n.mod(5) == 0){
        return "FizzBuzz"
    }
    else if (n.mod(3) == 0){
        return "Fizz"
    }
    else if (n.mod(5) == 0){
        return "Buzz"
    }
    return n.toString()
}