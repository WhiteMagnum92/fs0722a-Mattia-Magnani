package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {

	static List<String> lista1 = new ArrayList<String>();
	static List<String> lista2 = Arrays.asList("Test1", "Test2", "Test3");

	public static void main(String[] args) {

		lista1.add("Angular");
		lista1.add("CorsoEpicode");
		lista1.add("JavaSpring");

		Stream<String> listaFiltrata = lista1
				.stream()                           //trasforma i dati in strem
				.filter(ele -> ele.length() >= 8)   // filtriamo i dati
				.map(ele -> ele + "!");             // modifichiamo l'elemento aggiungendo un "!"
				             

		String s =  listaFiltrata.reduce("", (acc, ele) -> acc + ele + "#");
		System.out.println(s);
		//listaFiltrata.forEach(ele -> System.out.println(ele));
		
		
		Set<String> listaManipolata = lista1
				.stream()                           
				.map(ele -> "|" + ele + "|")
				.collect(Collectors.toSet());       //interrompe lo stream
		listaManipolata.forEach(ele -> System.out.println(ele));
		
		Stream<Integer> streamBuilder = Stream.<Integer>builder()
				.add(25)
				.add(77)
				.add(66)
				.build();
		
		Integer max = streamBuilder.max(Integer::compare).get();
		System.out.println("Max num: " + max);
	}

}
