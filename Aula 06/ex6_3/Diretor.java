package ex6_3;

public class Diretor extends Funcionario{
	private int lucroMensal;
	@Override
	public int getSalario() {
		return (salarioBase * 2) + (int)(lucroMensal*0.01);
	}

}
