class Library<T> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }

    fun addAll(newItems: List<T>) {
        items.addAll(newItems)
    }

    fun getAllItems(): List<T> = items.toList()

    fun clear() {
        items.clear()
    }

    fun isEmpty(): Boolean = items.isEmpty()

    fun size(): Int = items.size
}

data class Book(
    val title: String,
    val author: String,
    val year: Int,
    val isbn: String
)

data class Magazine(
    val title: String,
    val issue: Int,
    val month: String
)

data class DVD(
    val title: String,
    val director: String,
    val duration: Int // в минутах
)

sealed class LibraryItem {
    data class BookItem(val book: Book) : LibraryItem()
    data class MagazineItem(val magazine: Magazine) : LibraryItem()
    data class DVDItem(val dvd: DVD) : LibraryItem()
}

fun filterByYear(items: List<LibraryItem>, year: Int): List<LibraryItem.BookItem> {
    return items.filterIsInstance<LibraryItem.BookItem>()
        .filter { it.book.year == year }
}

fun sortByTitle(items: List<LibraryItem>): List<LibraryItem> {
    return items.sortedBy { item ->
        when (item) {
            is LibraryItem.BookItem -> item.book.title
            is LibraryItem.MagazineItem -> item.magazine.title
            is LibraryItem.DVDItem -> item.dvd.title
        }
    }
}

fun groupByAuthor(items: List<LibraryItem>): Map<String, List<Book>> {
    return items.filterIsInstance<LibraryItem.BookItem>()
        .groupBy { it.book.author }
        .mapValues { entry -> entry.value.map { it.book } }
}

fun calculateTotalDuration(items: List<LibraryItem>): Int {
    return items.filterIsInstance<LibraryItem.DVDItem>()
        .sumOf { it.dvd.duration }
}

fun main() {
    val library = Library<LibraryItem>()

    val book1 = Book("Война и мир", "Лев Толстой", 1869, "978-5-389-12345-6")
    val book2 = Book("Преступление и наказание", "Фёдор Достоевский", 1866, "978-5-389-12346-3")
    val book3 = Book("Анна Каренина", "Лев Толстой", 1877, "978-5-389-12347-0")

    val magazine1 = Magazine("National Geographic", 123, "January")
    val magazine2 = Magazine("Science Today", 45, "March")

    val dvd1 = DVD("Интерстеллар", "Кристофер Нолан", 169)
    val dvd2 = DVD("Властелин колец", "Питер Джексон", 178)

    library.addItem(LibraryItem.BookItem(book1))
    library.addItem(LibraryItem.BookItem(book2))
    library.addItem(LibraryItem.BookItem(book3))
    library.addItem(LibraryItem.MagazineItem(magazine1))
    library.addItem(LibraryItem.MagazineItem(magazine2))
    library.addItem(LibraryItem.DVDItem(dvd1))
    library.addItem(LibraryItem.DVDItem(dvd2))

    val allItems = library.getAllItems()

    println("Всего элементов в библиотеке: ${library.size()}")

    println("\n1. Книги, выпущенные в 1869 году:")
    val books1869 = filterByYear(allItems, 1869)
    books1869.forEach { println("- ${it.book.title}") }

    println("\n2. Элементы, отсортированные по названию:")
    val sortedItems = sortByTitle(allItems)
    sortedItems.forEach { item ->
        val title = when (item) {
            is LibraryItem.BookItem -> item.book.title
            is LibraryItem.MagazineItem -> item.magazine.title
            is LibraryItem.DVDItem -> item.dvd.title
        }
        println("- $title")
    }

    println("\n3. Книги, сгруппированные по авторам:")
    val booksByAuthor = groupByAuthor(allItems)
    booksByAuthor.forEach { (author, books) ->
        println("$author:")
        books.forEach { println("  - ${it.title} (${it.year})") }
    }

    println("\n4. Общая продолжительность всех DVD:")
    val totalDuration = calculateTotalDuration(allItems)
    println("$totalDuration минут (${totalDuration / 60} ч ${totalDuration % 60} мин)")
}