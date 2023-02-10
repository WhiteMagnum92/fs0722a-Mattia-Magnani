package esercitazione4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainEsercitazione4 {
	
	static List<Product> prodotti = new ArrayList<>();

	public static void main(String[] args) {
		
		Product p1 = new Product(101l, "La carica dei 101", "books", 9.99);
		Product p2 = new Product(102l, "Bambola", "baby", 4.99);
		Product p3 = new Product(103l, "Il signore degli anelli", "books", 100.99);
		Product p4 = new Product(104l, "Pallone da calcio", "boys", 15.99);
		Product p5 = new Product(105l, "Le cronache del mondo emerso", "books", 22.99);
		Product p6 = new Product(106l, "Whisky per far addormentare neonati incazzati", "baby", 35.99);
		Product p7 = new Product(107l, "Spada laser", "boys", 7.99);
		Product p8 = new Product(108l, "Java 4 show, Angular 4 pr0", "books", 199.99);
		Product p9 = new Product(109l, "Ciuccio intarsiato di rubini, filigranato in oro ", "baby", 1000.99);
		Product p10 = new Product(110l, "AK47", "boys", 2.99);

		prodotti.add(p1);
		prodotti.add(p2);
		prodotti.add(p3);
		prodotti.add(p4);
		prodotti.add(p5);
		prodotti.add(p6);
		prodotti.add(p7);
		prodotti.add(p8);
		prodotti.add(p9);
		prodotti.add(p10);
	
		
		//esercizio1
		List<Product> prodotti100 = prodotti.stream().filter(ele -> ele.getCategory() == "books" && ele.getPrice()>100).collect(Collectors.toList());
		
		System.out.println("Libri con costo superiore a 100");
		prodotti100.forEach(ele -> System.out.println(ele.getName()));
		
		//esercizio2
		Customer giovannino = new Customer(1, "Giovannino", 2);
		LocalDate orderDate = LocalDate.now();
		LocalDate deliveryDate = orderDate.plusDays(5);
		Order ordine1 = new Order(1,"In consegna", orderDate, deliveryDate, prodotti, giovannino);
		
		List<Order> listaBaby = ordine1.getProduct().stream().filter(ele -> ele.getCategory()=="baby").collect(Collectors.toList()));
	
	}
	
	
	
	
	

}
