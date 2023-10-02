fun isPalindrome(num: Int): Boolean {
    return num.toString() == num.toString().reversed()
}

fun palindromeArray(n: Int, m: Int): List<Int> {
    val result = mutableListOf<Int>()
    for (num in n..m) {
        if (isPalindrome(num)) {
            result.add(num)
        }
    }
    return result
}
fun splitNumber(number: Int, k: Int): List<Int> {
    val digits = number.toString().map { it.toString().toInt() }
    val result = mutableListOf<Int>()
    var currentIndex = 0
    while (currentIndex < digits.size) {
        val currentGroup = digits.subList(currentIndex, currentIndex + k)
        result.add(currentGroup.joinToString("").toInt())
        currentIndex += k
    }
    return result
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }
    if (num == 2) {
        return true
    }
    if (num % 2 == 0) {
        return false
    }
    val sqrt = Math.sqrt(num.toDouble()).toInt()
    for (i in 3..sqrt step 2) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}

fun primeFactorsArray(n: Int): List<Int> {
    val result = mutableListOf<Int>()
    for (num in 2..n) {
        if (isPrime(num) && n % num == 0) {
            result.add(num)
        }
    }
    return result
}
