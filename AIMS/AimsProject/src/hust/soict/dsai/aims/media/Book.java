package hust.soict.dsai.aims.media;
import java.util.*;

public class Book extends Media{

//	private int id;
//	private String title;
//	private String category;
//	private float cost;
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)){
			authors.add(authorName);
		}
		else {
			System.out.println("This author have been in the list");
		}
	}
	public Book(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}
	public Book(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		}
		else {
			System.out.println("There are no author having name "+ authorName);
		}
	}
	
}
