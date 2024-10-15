
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		
		System.out.println("QUAL A QUQANTIDADE DE PRODUTOS ?");
		int quantidade = scanner.nextInt();
		scanner.nextLine();
		
		String nome;
		double preco;
		
		for(int i = 0 ; i<quantidade; i++) {
			System.out.println("será um produto comum, importado ou usado?");
			String opcao = scanner.nextLine();
			
			
			switch(opcao) {
				case "comum":
					System.out.println("NOME:");
					nome = scanner.nextLine();
					
					System.out.println("PRECO:");
					preco = scanner.nextDouble();
					scanner.nextLine();
					
					Produto produtocomum = new Produto(nome, preco);
					lista.add(produtocomum);
					break;
				
				case "usado":
					System.out.println("NOME:");
					nome = scanner.nextLine();
					
					System.out.println("PRECO:");
					preco = scanner.nextDouble();
					scanner.nextLine();
					
					System.out.println("DATA DE USO:");
					String data = scanner.nextLine();
					
					Produto produtousado = new ProdutoUsado(nome, preco, data);
					lista.add(produtousado);
					break;
					
				case "importado":
					System.out.println("NOME:");
					nome = scanner.nextLine();
					
					System.out.println("PRECO:");
					preco = scanner.nextDouble();
					scanner.nextLine();
					
					System.out.println("FRETE:");
					double frete = scanner.nextDouble();
					scanner.nextLine();
					
					Produto produtoimportado = new ProdutoImportado(nome, preco, frete);
					lista.add(produtoimportado);
					break;
			}
			
		}
		scanner.close();
		System.out.println("PRODUTOS CADASTRADOS:");
		for(Produto p: lista) {
			System.out.println(p.etiqueta());
		}
		
	}

	}

