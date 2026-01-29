# Лабораторная работа №13-14
Коллекции, обобщения и функциональный стиль в Kotlin
## Описание
Данная лабораторная работа посвящена изучению продвинутых возможностей языка Kotlin, которые активно используются при разработке Android-приложений.
В рамках работы рассматриваются:
- обобщённые типы (Generics);
- коллекции Kotlin;
- функции высшего порядка;
- extension-функции;
  Все примеры ориентированы на практическое применение и подготовку к разработкемобильных приложений.
## Как запустить проект
1. Клонируйте репозиторий:
```bash
git clone <https://github.com/xc8pt/Kotlin_Advanced_Lab_13_14_AbdulinRR.git>
```
---
## В этой лабораторной работе было изучено множество полезных функций и методов их применений, а именно:
 - Extension-функции (extension functions)
 - extension-функции с использованием интерфейсов
 - Scope-functions: доступ к свойствам и методамобъекта
 - Массивы в Kotlin
 - Lists (Списки)
---
### Extension-функции (extension functions)
Пример использования:
```kotlin
override fun printProgressBar() {
        repeat(Quiz.answered) {print("▓")}
        repeat(Quiz.total - Quiz.answered) {print("▓")}
        println()
        println(progressText)
    }
```
---
### extension-функции с использованием интерфейсов
Пример использования:
```kotlin
interface ProgressPrintable{
    val progressText: String
    fun printProgressBar()
}
class Quiz : ProgressPrintable {
    override val progressText: String
        get() = "${answered} of ${total} answered"
}
```
---
### Scope-functions: доступ к свойствам и методамобъекта
Пример использования:
```kotlin
fun printQuiz(){
        question1.let{
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let{
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let{
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
```
### Массивы в Kotlin
Массив (Array) — это простейший способ хранить несколько значений одного типа данных.
 - массив состоит из элементов (items);
 - элементы упорядочены;
 - доступ к элементам осуществляется по индексу.
---
Пример использование:
####  Создание массива
```kotlin
val rockPlanets = arrayOf("Mercury", "Venus", "Earth", "Mars")
val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
val solarSystem = rockPlanets + gasPlanets
```
---
####  Доступ к элементам массива and Изменение элемента массива
```kotlin
   println(solarSystem[0])
   println(solarSystem[1])
   println(solarSystem[2])
   solarSystem[3] = "Little Earth"
   println(solarSystem[3])
   println(solarSystem[4])
   println(solarSystem[5])
   println(solarSystem[6])
   println(solarSystem[7])
```
---
#### Ограничение размера массива
```kotlin
   solarSystem[8] = "Pluto"
```
---
### Lists (Списки)
List — это упорядоченная коллекция с изменяемым размером.
Чаще всего она реализована поверх массива, 
который автоматически увеличивается при необходимости.
 - элементы хранятся по порядку;
 - можно вставлять элементы в середину списка в определённый индекс;
 - добавление и удаление элементов происходит «под капотом» за счёт пересоздания массива.
---
### List и MutableList
В Kotlin коллекции описываются через интерфейсы.
 - List — интерфейс для только чтения упорядоченной коллекции.
 - MutableList — расширяет List и добавляет методы для изменения списка(add, remove и т.д.).
---
#### Функция listOf()
```kotlin
val solarSystem = mutableListOf(
    "Mercury", "Venus", "Earth", "Mars",
    "Jupiter", "Saturn", "Uranus", "Neptune"
)
println(solarSystem.size)
```
---
#### Доступ к элементам списка
```kotlin
println(solarSystem[2])
println(solarSystem.get(3))
```
---
####  Добавление элементов (MutableList)
```kotlin
val solarSystem = mutableListOf(
    "Mercury",
    "Venus",
    "Earth",
    "Mars",
    "Jupiter",
    "Saturn",
    "Uranus",
    "Neptune" 
)
solarSystem.add("Pluto") 
```
---
### Sets (Множества)
Set — это коллекция без фиксированного порядка, которая не допускает дубликатов
 - элементы уникальны;
 - порядок элементов не гарантирован;
 - нет индексов.
#### Использование MutableSet
```kotlin
val solarSystem = mutableSetOf(
    "Mercury", "Venus", "Earth", "Mars",
    "Jupiter", "Saturn", "Uranus", "Neptune"
)
```
---
### Map collection (Коллекция Map)

## Автор
Абдулин Ринат Рушанович
## Лицензия
Проект создан в учебных целях.