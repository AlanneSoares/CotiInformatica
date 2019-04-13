package manager;

import java.util.ArrayList;
import java.util.List;

import entity.Produto;

public class ManagerProduto {
	
	private List<Produto> produtos;

	{
		this.produtos = new ArrayList<Produto>();
		// bloco anonimo
		// para vários construtores
	}
	
	public ManagerProduto() {}
	
	public ManagerProduto(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void adicionar(Produto p) {
		this.produtos.add(p); // this para referenciar o atributo. Nesse caso sem o this, como não é o mesmo que o nome do parâmetro não precisa do this. Com ou sem this está correto. 
	}
								// varargs
	public void adicionarVarios(Produto...produtos) {
		for (Produto x : produtos) {
			this.produtos.add(x);
		}
	}
	
	public void print() {
		// stream(): API Java 8 serva para ordenar, listar
		// forEach(): para cada item
		this.produtos.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		ManagerProduto mp = new ManagerProduto();
		Produto p1 = new Produto(100, "Iphone", 350.);
		Produto p2 = new Produto(101, "Sansung", 200.);
		Produto p3 = new Produto(102, "Iphone", 350.);
		mp.adicionarVarios(p1,p2,p3); // usando o varargs
		mp.print();
	}
}
