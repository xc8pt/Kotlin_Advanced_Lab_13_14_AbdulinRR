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
    val solarSystem = mutableListOf(
        "Mercury", "Venus", "Earth", "Mars",
        "Jupiter", "Saturn", "Uranus", "Neptune"
    )
    println(solarSystem.size)
    print(solarSystem.indexOf("Earth"))
    print(solarSystem.indexOf("Pluto"))
    println()
    for (planet in solarSystem) {
        println(planet)
    }
    solarSystem.add("Pluto")
    ///
    solarSystem.add(3,"Theia")
    ///
    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)
}