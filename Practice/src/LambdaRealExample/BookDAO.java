package LambdaRealExample;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(12, "ram", 23));
		books.add(new Book(13, "lak", 22));
		books.add(new Book(14, "bhart", 21));
		books.add(new Book(15, "shatrg", 20));
		return books;

	}

}
