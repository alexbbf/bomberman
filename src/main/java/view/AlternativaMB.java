package view;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import model.Alternativa;

@ManagedBean
@ViewScoped
public class AlternativaMB {

	private Alternativa correta = new Alternativa();

	private Alternativa alternativa1 = new Alternativa();

	private Alternativa alternativa2= new Alternativa();

	private Alternativa alternativa3= new Alternativa();
	
	private List<Alternativa> alternativas;

	public List<Alternativa> getAlternativas() {
		correta.setCorreta(true);
		alternativa1.setCorreta(false);
		alternativa2.setCorreta(false);
		alternativa3.setCorreta(false);
		alternativas.add(correta);
		alternativas.add(alternativa1);
		alternativas.add(alternativa2);
		alternativas.add(alternativa3);
		List<Alternativa> a = alternativas;
		correta = new Alternativa();
		alternativa1 = new Alternativa();
		alternativa2 = new Alternativa();
		alternativa3 = new Alternativa();
		
		alternativas.clear();
		return a;
	}

	public void setAlternativas(List<Alternativa> alternativas) {
		this.alternativas = alternativas;
	}

	public Alternativa getCorreta() {
		return correta;
	}

	public void setCorreta(Alternativa correta) {
		this.correta = correta;
	}

	public Alternativa getAlternativa1() {
		return alternativa1;
	}

	public void setAlternativa1(Alternativa alternativa1) {
		this.alternativa1 = alternativa1;
	}

	public Alternativa getAlternativa2() {
		return alternativa2;
	}

	public void setAlternativa2(Alternativa alternativa2) {
		this.alternativa2 = alternativa2;
	}

	public Alternativa getAlternativa3() {
		return alternativa3;
	}

	public void setAlternativa3(Alternativa alternativa3) {
		this.alternativa3 = alternativa3;
	}

}
