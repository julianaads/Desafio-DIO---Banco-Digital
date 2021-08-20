
public class ContaPoupanca extends Conta {
	
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}



	private static int SEQUENSIAL = 1;

	

	@Override
	public void imprimirExtrato() {
		imprimirInfoComuns();
		
	}





}
