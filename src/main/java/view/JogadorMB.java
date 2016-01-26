package view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Jogador;

@ManagedBean
@SessionScoped
public class JogadorMB {
	
	private Jogador jogador;

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogardor) {
		this.jogador = jogardor;
	}
	
	

}
