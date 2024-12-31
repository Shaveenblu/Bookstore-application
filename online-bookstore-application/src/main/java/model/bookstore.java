package model;
import jakarta.persistence.*;
@Entity
@Table(name = "student")

public class bookstore {

	@Id
	private int id;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}


	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	private String title;
	private double price;
	@ManytoOne
	@JoinColumn(name = "author_id", nullable = false)
	private Author author;

	
	public bookstore() {
		
	}

	
	public bookstore(String title, String price, Author author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	public String toString() {
		return "Student [id =" + id + ", firstname=" + title + ", lastName=" + price + ", email =" + author + "]";
	}
	
	
}

