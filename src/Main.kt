fun main() {

    val naruto: Hero = Hero()
    naruto.name = "Наруто Узумаки"
    naruto.gender = "Мужской"
    naruto.role = "Хокаге"
    naruto.hp = 200
    naruto.mp = 40
    naruto.lvl = 50
    naruto.element = "Молния"

    val orochimaru = Enemy()
    orochimaru.name = "Орочимару"

    naruto.showStats()
    println("Наруто увидел врага ${orochimaru.name}! Его здоровье - ${orochimaru.hp}")
    naruto.attack(orochimaru, 25)


//    naruto.takeDamage(20)
//    naruto.takeDamage(30)
//    naruto.greet(naruto.name)
//    naruto.greet("Наруто")
//    naruto.castSpell()
//    naruto.castSpell()
//    naruto.castSpell()
//    naruto.castSpell()
//    naruto.heal()
//    naruto.sayHello()
//    naruto.meditate()
//    naruto.takeDamage()
//    naruto.showStats()
//    println("Имя: ${naruto.name} \n" +
//            "Пол: ${naruto.gender} \n" +
//            "Класс: ${naruto.role}\n" +
//            "Здоровье: ${naruto.hp}\n" +
//            "Мана: ${naruto.mp}\n")
//
//    val sasuke: Hero = Hero()
//    sasuke.name = "Саске Учиха"
//    sasuke.gender = "Мужской"
//    sasuke.role = "Шиноби-Отступник"
//    sasuke.hp = 120
//    sasuke.mp = 180
//    naruto.lvl = 50
//    naruto.element = "Черная молния"
//
//    println("Имя: ${sasuke.name} \n" +
//            "Пол: ${sasuke.gender} \n" +
//            "Класс: ${sasuke.role}\n" +
//            "Здоровье: ${sasuke.hp}\n" +
//            "Мана: ${sasuke.mp}")
//
//    val satoru: Hero = Hero()
//    satoru.name = "Годжо Сатору"
//    satoru.gender = "Мужской"
//    satoru.role = "Маг проклятый"
//    satoru.hp = 160
//    satoru.mp = 300
//    naruto.lvl = 50
//    naruto.element = "Бесконечность"
//
//    println("Имя: ${satoru.name} \n" +
//            "Пол: ${satoru.gender} \n" +
//            "Класс: ${satoru.role}\n" +
//            "Здоровье: ${satoru.hp}\n" +
//            "Мана: ${satoru.mp}")
//
//    var hero = Hero()
//    print("Введите имя героя:")
//    hero.name = readln()
//    print("Введите пол героя:")
//    hero.gender = readln()
//    print("Введите класс героя:")
//    hero.role = readln()
//    print("Введите здороввье героя:")
//    hero.hp = readln().toInt()
//    print("Введите ману героя:")
//    hero.mp = readln().toInt()
//    print("Введите уровень героя:")
//    hero.lvl = readln().toInt()
//    print("Введите стихию героя:")
//    hero.element = readln()
//
//    println("Имя: ${hero.name} \n" +
//            "Пол: ${hero.gender} \n" +
//            "Класс: ${hero.role}\n" +
//            "Здоровье: ${hero.hp}\n" +
//            "Мана: ${hero.mp}\n" +
//            "Уровень: ${hero.lvl}\n" +
//            "Стихия: ${hero.element}")

}