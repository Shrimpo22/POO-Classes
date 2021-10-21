package ex6_3;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Funcionario> empresa = new ArrayList<>();

	public void addFuncionarios(Funcionario f) {
		empresa.add(f);
	}

	public void removeFuncionarios(Funcionario f) {
		empresa.remove(f);
	}
}
