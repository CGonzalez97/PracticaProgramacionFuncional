import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList();
		
		for(int i = 0; i < 20; i++) {
			lista.add(i+1);
		}
		
		//Imperativo
		List<Integer> listaImp = new ArrayList();
		System.out.println("Imperativo");
		int contador = 0;
		for(Integer n:lista) {
			if(n > 10) {
				listaImp.add(n);
			}
		}
		System.out.println(listaImp);
		
		//Funcional
		System.out.println("Funcional");
//		lista.stream().forEach(x -> System.out.print(x+" "));
		List<Integer> listaFun = lista.stream().filter(x -> x > 10).collect(Collectors.toList());
		System.out.println(listaFun);
		

	}

}
