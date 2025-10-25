class Quest {
    var title: String = "Без названия"
    var duration: Int = 0
    var reward: Int = 0
    var difficult: String = "Не указан"

    fun printInfo() {
        println("Название квеста: ${this.title}\n" +
                "Время выполнения: ${this.duration}\n" +
                "Награда: ${this.reward} золотых\n" +
                "Уровень сложности: ${this.difficult}")
    }

    fun init(title: String, duration: Int, reward: Int, difficult: String) {
        this.title = title
        this.duration = duration
        this.reward = reward
        this.difficult = difficult
    }
}