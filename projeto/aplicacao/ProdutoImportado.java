

public class ProdutoImportado extends Produto {
	private double frete;

	public ProdutoImportado(String nome, double preco, double frete) {
		super(nome, preco);
		this.frete = frete;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}
	
	public double precototal(){
		return getPreco() + getFrete();
	}   
	
	@Override
	public String etiqueta() {
	    return getNome() + " $" + String.format("%.2f", precototal()) + " (custo frete: $ " + String.format("%.2f", getFrete()) + ")";
	}

}
