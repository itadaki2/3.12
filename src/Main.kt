fun main() {
    print("введите двузначное число: ")
    val chislo = readLine()!!.toInt()

    val desyatki = chislo / 10 // вычис десяток
    val edinicy = chislo % 10 // вычис единиц

    // сравнение
    if (desyatki > edinicy) {
        println("первая цифра больше")
    } else if (desyatki < edinicy) {
        println("вторая цифра больше")
    } else {
        println("цифры одинаковые")
    }
}
