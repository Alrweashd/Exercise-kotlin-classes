fun main() {
    println("Hello World!")
    val myBook = Book("World War 2","Turki",2025, "History");

    println("myBook $myBook")
    println(myBook.getBookInfo())

}
class Book(var title: String,
           var author: String,
           var yearPublished: Int,
           var genre: String) {

    override fun toString(): String {
        return "Title: $title, Author:$author, Year: $yearPublished"
    }
    fun getBookInfo():String {
        return "$title by $author ($yearPublished) genre: $genre"
    }

}