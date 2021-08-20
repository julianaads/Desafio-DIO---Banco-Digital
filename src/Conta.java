
public abstract class Conta implements IConta{
	
	protected static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENSIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENSIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	

	public void sacar() {

	}

	public void depositar() {

	}

	public void transferir() {

	}

	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;
		
	}

	@Override
	public void depositar(double valor) {
			this.saldo = saldo + valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfoComuns() {
		System.out.println("===Extrato===");
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Agência: %d", this.numero));
		System.out.println(String.format("Agência: %.2f", this.saldo));
	}

}
