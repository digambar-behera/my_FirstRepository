package digambarsProjects1;

class Library{
	String [] books;
	int no_of_books;
	Library(){
		this.books = new String[100];
		this.no_of_books = 0;
	}
	void addBook(String book) {
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println(book + " has been added.");
	}
	void showAvailableBooks() {
		System.out.println("Available books are:");
		for (String book : this.books) {
			if (book == null) {
				continue;
			}
			System.out.println("* " + book);
		}
	}
	void issueBook(String book) {
		for (int i=0; i<this.books.length;i++) {
			if (this.books[i].equals(book)) {
				System.out.println("This book has been issued!");
				this.books[i] = null;
				return;
			}
		}
		System.out.println("This book doest not exist!");
	}
	void returnBook(String book) {
		addBook(book);
	}
}

public class OnlineLibrary {
	public static void main(String[] args) {
		Library centralLibrary = new Library();
		centralLibrary.addBook("3 Body Problem");
		centralLibrary.addBook("The Death's End");
		centralLibrary.addBook("The Dark Shaolin");
		centralLibrary.showAvailableBooks();
		centralLibrary.issueBook("3 Body Problem");
		centralLibrary.showAvailableBooks();
		centralLibrary.returnBook("3 Body Problem");
		centralLibrary.showAvailableBooks();
	}
}
