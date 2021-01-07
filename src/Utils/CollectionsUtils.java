package Utils;
import com.app.core.*;

import static java.time.LocalDate.parse;
import static com.app.core.Category.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class CollectionsUtils {
	
	
	
     
	public static Set<Book> populateData() {
		Author a[]= {new Author("author1","author1@gmail.com"),new Author("author8","author1@gmail.com")};
		Author b[]= {new Author("author1","author1@gmail.com")};
		Author c[]= {new Author("author1","author1@gmail.com")};
		Author d[]= {new Author("author1","author1@gmail.com")};
		Author e[]= {new Author("author1","author1@gmail.com")};
		
		HashSet<Book> book = new HashSet<>();
		book.add(new Book("book1",valueOf("FICTION"),1000.0,parse("2020-10-10"),5,a));
		book.add(new Book("book1",valueOf("FICTION"),1000.0,parse("2020-10-10"),5,b));
		book.add(new Book("book2",valueOf("FICTION"),1000.0,parse("2020-10-10"),5,c));
		book.add(new Book("book3",valueOf("SCIENCE"),1000.0,parse("2020-10-12"),5,d));
		book.add(new Book("book4",valueOf("SCIENCE"),1000.0,parse("2020-10-13"),5,e));
		book.add(new Book("book5",valueOf("FINANCE"),1000.0,parse("2020-10-14"),5,a));
		book.add(new Book("book6",valueOf("FINANCE"),1000.0,parse("2020-10-15"),5,a));
		book.add(new Book("book7",valueOf("YOGA"),1000.0,parse("2020-10-16"),5,d));
		book.add(new Book("book8",valueOf("YOGA"),1000.0,parse("2020-10-17"),5,e));
		book.add(new Book("book9",valueOf("MEDITATION"),1000.0,parse("2020-10-18"),5,d));
		book.add(new Book("book10",valueOf("MEDITATION"),1000.0,parse("2020-10-19"),5,a));
		
         		
		

		 
		 
		return book;
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
