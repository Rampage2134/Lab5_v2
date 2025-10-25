fun main() {
    val quests = mutableListOf<Quest>()

    for (i in 1 .. 3) {
        println("Добавим квест #$i")
        val quest = Quest()
        println("Введите название квеста: ")
        val title = readln()
        println("Введите время выполнения (в часах): ")
        val duration = readln().toInt()
        println("Введите награду (в монетах): ")
        val reward = readln().toInt()
        println("Введите уровень сложности: ")
        val difficult = readln()
        quest.init(title, duration, reward, difficult)
        quests.add(quest)
        println()
    }

    println("Все доступные квесты:")
    for (quest in quests) {
        quest.printInfo()
    }

//    println("Введите название квеста: ")
//    val title = readln()
//    println("Введите время выполнения (в часах): ")
//    val duration = readln().toInt()
//    println("Введите награду (в монетах): ")
//    val reward = readln().toInt()
//    println("Введите уровень сложности: ")
//    val difficult = readln()
//
//    quest.init(title, duration, reward, difficult)
//
//    quest.printInfo()
}