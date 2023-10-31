fun main() {
    val card = readln()
    val sum = card.filter { it.isDigit() }.reversed()
        .map { it.toString().toInt()}.toMutableList()
        .mapIndexed() { i, value -> if ((i + 1) % 2 == 0) value * 2 else value }
        .map { if (it > 9) it % 10 + it / 10 else it }.sum()
    if (sum % 10 == 0) print("Корректный номер карты") else print("Неорректный номер карты")
}