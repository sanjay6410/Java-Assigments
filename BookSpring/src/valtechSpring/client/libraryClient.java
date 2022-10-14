package valtechSpring.client;


import java.util.Date; 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import javafx.util.converter.LocalDateStringConverter;
import valtechSpring.orm.Address;
import valtechSpring.orm.Article;
import valtechSpring.orm.Author;
import valtechSpring.orm.Blog;
import valtechSpring.orm.Book;
import valtechSpring.orm.Publisher;
import valtechSpring.orm.handBook;



public class libraryClient {

	public static void main(String[] args) {

		SessionFactory sf=new AnnotationConfiguration()
				.configure()				
				.addAnnotatedClass(Publisher.class)
				.addAnnotatedClass(Book.class)
				.addAnnotatedClass(Author.class)
				.addAnnotatedClass(Address.class)
				.addAnnotatedClass(Article.class)
				.addAnnotatedClass(Blog.class)
				.addAnnotatedClass(handBook.class)
				
				
				.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		Author author=new Author("sanjay",9878987);
//		//ses.save(author);
//		
		Address address=new Address("Ashoknagar","Davangere","karnataka",577544);
//		
//		ses.saveOrUpdate(author);
//		ses.saveOrUpdate(address);
//		author.setAddress(address);
//		address.setAuthor(author);
		
		
		Publisher publisher=new Publisher("Ramesh",768787878);
//		ses.save(publisher);
		ses.saveOrUpdate(publisher);
		ses.saveOrUpdate(address);
		ses.saveOrUpdate(author);
		publisher.setAddress(address);
		address.setPublisher(publisher);
		address.setAuthor(author);
		author.setAddress(address);
//		
		
		Book book=new Book("Ramayana",new Date(47,8,15));
		ses.save(book);
		Article article=new Article("http://article.com");
		ses.save(article);
		Blog blog=new Blog("http://blog.com",5);
		ses.save(blog);
		handBook handbook=new handBook(890,2000,2022,8);
		ses.save(handbook);
	
		Publisher pb=new Publisher("Karthik",784548789);
		Publisher pb1=new Publisher("Darshan",889789876);
//		ses.saveOrUpdate(pb);
//		ses.saveOrUpdate(pb1);
//		ses.saveOrUpdate(address);
//		ses.saveOrUpdate(author);
//		pb.setAddress(address);
//		pb1.setAddress(address);
//		address.setPublisher(pb);
//		address.setPublisher(pb1);
//		address.setAuthor(author);
//		author.setAddress(address);
//		ses.save(pb);
//		ses.save(pb1);
//		Publisher pb2=(Publisher)ses.load(Publisher.class, 70);
//		Publisher pb3=(Publisher)ses.load(Publisher.class, 71);
//		
//		Author a1=(Author)ses.load(Author.class, 80);

		

		
		tx.commit();
		ses.close();
		sf.close();

	}

}
