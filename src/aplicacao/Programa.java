package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;
import services.CalculoService;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * agora mudou a necessidade, será usada uma lista de produtos na entrada
		 * contendo produto e preço
		 * agora nosso programa deverá retornar o produto com o maior valor
		 * 
		 */ 
		List<Produto> lista = new ArrayList<>();
		
		//String path = "C:\\Users\\dsilva\\Documents\\entrada.txt";
		String path = "C:\\Users\\dsilva\\Documents\\in-produtos.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			String [] colunas;
			String nome;
			Double valor;
			
			while(linha != null) {
				colunas = linha.split(",");
				//System.out.print("Coluna 0: "+ colunas[0]);
				nome = colunas[0];
				//System.out.println(" Coluna 1: "+ colunas[1]);
				valor = Double.parseDouble(colunas[1]);
				
				lista.add(new Produto(nome, valor));
				
				//lista.add(new Produto(String nome, valor));
				linha = br.readLine();
			}
			
			System.out.print(lista.toString());
			
			
			Produto x = CalculoService.max(lista);
			System.out.println("\n\nProduto mais valioso: ");
			System.out.println(x);
			
		} catch (Exception e) {
			System.out.println("Erro: "+ e.getMessage());
		}

	}

}
