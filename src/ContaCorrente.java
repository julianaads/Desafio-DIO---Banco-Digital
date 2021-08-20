
public class ContaCorrente extends Conta {

	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}



	private static int SEQUENSIAL = 1;



	@Override
	public void imprimirExtrato() {
		imprimirInfoComuns();
		
		
	}

}
