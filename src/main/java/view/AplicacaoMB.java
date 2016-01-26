package view;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import model.Assunto;

@ManagedBean
@ApplicationScoped
public class AplicacaoMB {
	
	private Assunto[] assuntos = Assunto.values();
	
	public Assunto[] getAssuntos() {
		return assuntos;
	}

	
}
