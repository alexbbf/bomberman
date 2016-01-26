package view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import business.QuestaoBusiness;
import model.Assunto;
import model.Questao;

@ManagedBean
@SessionScoped
public class QuestaoMB {
	
	@EJB
	private QuestaoBusiness business;
	
	private Assunto[] assuntos;
	
	private List<Questao> questoes;
	
	private int cont = 0;
	
	private int acertos = 0;
	
	public List<Questao> pesquisar() {
		return business.pesquisar(assuntos);
	}

	public Assunto[] getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(Assunto[] assuntos) {
		this.assuntos = assuntos;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}
	
	

}
