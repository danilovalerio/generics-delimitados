package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import services.CalculoService;

public class Programa {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		String path = "C:\\Users\\dsilva\\Documents\\entrada.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while(linha != null) {
				lista.add(Integer.parseInt(linha));
				linha = br.readLine();
			}
			
			Integer x = CalculoService.max(lista);
			System.out.println("Max: ");
			System.out.println(x);
			
		} catch (Exception e) {
			System.out.println("Erro: "+ e.getMessage());
		}

	}

}
