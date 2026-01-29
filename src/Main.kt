fun main(){
//    val question1 = Question<String>(
//        "Речка спятила с ума - По домам пошла сама. ___",
//        "водопровод",
//        Difficulty.MEDIUM
//    )
//    val question2 = Question<Boolean>(
//        "Небо зелёное. Правда или ложь",
//        false,
//        Difficulty.EASY
//    )
//    val question3 = Question<Int>(
//        "Сколько дней между полнолуниями?",
//        28,
//        Difficulty.HARD
//    )
//    println(question1.answer)
//    println(question2.answer)
//    println(question3.answer)
//    println(question1.toString())
//
//    println("${Quiz.answered} of ${Quiz.total} answered.")
//    println(Quiz.progressText)
    ///
//    val quiz = Quiz()
//    quiz.printQuiz()
    ///
//    Quiz().apply { printQuiz() }
    ///
//    println(solarSystem[0])
//    println(solarSystem[1])
//    println(solarSystem[2])
//    solarSystem[3] = "Little Earth"
//    println(solarSystem[3])
//    println(solarSystem[4])
//    println(solarSystem[5])
//    println(solarSystem[6])
//    println(solarSystem[7])
////    println(solarSystem[8])
    ///
//    val solarSystem = mutableListOf(
//        "Mercury", "Venus", "Earth", "Mars",
//        "Jupiter", "Saturn", "Uranus", "Neptune"
//    )
//    println(solarSystem.size)
//    print(solarSystem.indexOf("Earth"))
//    print(solarSystem.indexOf("Pluto"))
//    println()
//    for (planet in solarSystem) {
//        println(planet)
//    }
//    solarSystem.add("Pluto")
//    ///
//    solarSystem.add(3,"Theia")
//    ///
//    println(solarSystem.contains("Pluto"))
//    println("Future Moon" in solarSystem)
//
//    val solarSystem = mutableMapOf(
//        "Mercury" to 0,
//        "Venus" to 0,
//        "Earth" to 1,
//        "Mars" to 2,
//        "Jupiter" to 79,
//        "Saturn" to 82,
//        "Uranus" to 27,
//        "Neptune" to 14
//    )
//    println(solarSystem.size)
//    ///
//    solarSystem["Pluto"] = 5
//    println(solarSystem.size)
//    println(solarSystem["Pluto"])
//    ///
//    println(solarSystem.get("Theia"))
//    ///
//    solarSystem.remove("Pluto")
//    println(solarSystem.size)
//    ///
//    solarSystem["Jupiter"] = 78
//    println(solarSystem["Jupiter"])
    ///
//    cookies.forEach {
//        println("Пункт меню: ${it.name}")
//    }
    ///
//    val fullMenu = cookies.map{
//        "${it.name} - $${it.price}"
//    }
//    println("Полное меню:")
//    fullMenu.forEach {
//        println(it)
//    }
    ///
//    val softBakedMenu = cookies.filter{
//        it.softBaked
//    }
//    println("Мягкое печенье:")
//    softBakedMenu.forEach {
//        println("${it.name} - $${it.price}")
//    }
    ///
//    val groupedMenu = cookies.groupBy { it.softBaked }
//    val softBakedMenu = groupedMenu[true] ?: emptyList()
//    val crunchyMenu = groupedMenu[false] ?: emptyList()
//    println("Soft cookies:")
//    softBakedMenu.forEach {
//        println("${it.name} - $${it.price}")
//    }
//    println("Crunchy cookies:")
//    crunchyMenu.forEach {
//        println("${it.name} - $${it.price}")
//    }
    ///
//    val totalPrice = cookies.fold(0.0) { total, cookie ->
//        total + cookie.price
//    }
//    println("Total price: $${totalPrice}")
    ///
    val alphabeticalMenu = cookies.sortedBy { it.name }
    println("Меню в алфавитном порядке:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}