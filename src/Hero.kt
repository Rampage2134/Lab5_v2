class Hero {
    var name: String = "Неизвестный"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 10
    var lvl: Int = 1
    var element: String = "Не указан"

    fun sayHello() {
        println("Я - $name, мой путь только начинается!")
    }

    fun showStats() {
        println("Имя: $name \n" +
                "Пол: $gender \n" +
                "Класс: $role \n" +
                "Здоровье: $hp \n" +
                "Мана: $mp \n" +
                "Уровень: $lvl \n" +
                "Стихия: $element")
    }

    fun meditate() {
        println("$name медетирует...")
        mp += 20
        println("Мана восстановлена! Текущая мана $mp")
    }

    fun takeDamage (amount: Int) {
        println("$name получает урон!")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")
        die()
    }

    fun castSpell() {
        if (mp >= 10) {
            mp -= 10
            println(
                "Герой искользует магию. Потрачено маны: 10\n" +
                        "Текущее количество маны: $mp"
            )
        } else {
            println("Недостаточно маны для приминения магии")
        }
    }

    fun heal() {
        if (mp >= 10) {
            println("Лечусь! Восстановлено здоровье, потрачено 10 маны.")
            hp += 10
            mp -= 10
        } else {
            println("Недостаточно маны! У вас только $mp маны.")
        }
    }

    fun greet(name: String) {
        println("Привет, $name!")
    }

    fun die() {
        if (hp == 10) {
            println("Герой умер!")
        }
    }

    fun attack(enemy: Enemy, damage: Int) {
        println("$name атакует врага ${enemy.name}!")
        enemy.takeDamage(damage)
    }

    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        if (enemy.element == element) {
            println("Полученный урон от магии уменьшен")
            val reducedDamage = damage / 2
            enemy.takeDamage(reducedDamage)
        }
        else {
            enemy.takeDamage(damage)
        }
    }

    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается!")

        println("$name атакует первым!")
        opponent.takeDamage(15)

        println("${opponent.name} отвечает!")
        this.takeDamage(15)

        println("Дуэль завершена.")
        println("Состояние героев:")
        this.showStats()
        opponent.showStats()
    }


}