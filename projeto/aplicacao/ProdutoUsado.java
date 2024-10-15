
public class ProdutoUsado extends Produto {
	private String data;

	public ProdutoUsado(String nome, double preco, String data) {
		super(nome, preco);
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String etiqueta() {
		return getNome() + "(usado) $" + getPreco() + "(data de uso:" + getData() + ")";
	}

}