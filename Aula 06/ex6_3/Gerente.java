package ex6_3;

public class Gerente extends Funcionario{
	private boolean numVendas = false;
	private int salario = salarioBase;
	@Override
	public int getSalario() {
		if(numVendas) {
			salario += 200;
			return salario;
		}
		return salarioBase;
	}

}
