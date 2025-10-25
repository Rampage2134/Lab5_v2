class Enemy {
    var name: String = "Враг"
    var hp: Int = 50
    var element: String = "Не указан"

    fun takeDamage(amount: Int) {
        hp -= amount
        if (hp < 0) hp = 0
        println("$name - получает $amount урона." +
                "Оставшееся здоровье: $hp")
    }
}