package view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import business.QuestaoBusiness;
import model.Alternativa;
import model.Assunto;
import model.Questao;

@ManagedBean
@ViewScoped
public class QuestaoMB {

	@EJB
	private QuestaoBusiness business;

	private Assunto[] assuntos;

	private List<Questao> questoes;

	private Questao questao = new Questao();

	private int cont;

	private int indice;

	private int acertos;

	private Assunto assunto;

	private Alternativa certa = new Alternativa();

	private Alternativa al1 = new Alternativa();

	private Alternativa al2 = new Alternativa();

	private Alternativa al3 = new Alternativa();

	private Alternativa alternativaSelecionada;

	public void salvar() {

		certa.setCorreta(true);
		al1.setCorreta(false);
		al2.setCorreta(false);
		al3.setCorreta(false);
		questao.adiconarAlternativa(al1);
		questao.adiconarAlternativa(al2);
		questao.adiconarAlternativa(al3);
		questao.adiconarAlternativa(certa);
		certa = new Alternativa();

		al1 = new Alternativa();

		al2 = new Alternativa();

		al3 = new Alternativa();

		questao.setAssunto(assunto);
		business.salvar(questao);
		questao = new Questao();
	}

	public String jogar() {
		questoes = pesquisar();
		cont = 1;
		acertos = 0;
		indice = 0;
		questao = questoes.get(indice);
		System.out.println(questao.getDescricao());
		return "pm:questao";

	}

	public void incrementa() {
		System.out.println(cont);
		cont = cont + 1;
	}

	public String proxima() {
		if (cont / 60 > 5) {
			return "pm:fim";
		}
		indice++;
		questao = questoes.get(indice);
		return "pm:questao";
	}

	public List<Questao> pesquisar() {
		return business.pesquisar(assuntos);

	}

	public Alternativa getAlternativaSelecionada() {
		return alternativaSelecionada;
	}

	public void setAlternativaSelecionada(Alternativa alternativaSelecionada) {
		this.alternativaSelecionada = alternativaSelecionada;
	}

	public Alternativa getCerta() {
		return certa;
	}

	public void setCerta(Alternativa certa) {
		this.certa = certa;
	}

	public Alternativa getAl1() {
		return al1;
	}

	public void setAl1(Alternativa al1) {
		this.al1 = al1;
	}

	public Alternativa getAl2() {
		return al2;
	}

	public void setAl2(Alternativa al2) {
		this.al2 = al2;
	}

	public Alternativa getAl3() {
		return al3;
	}

	public void setAl3(Alternativa al3) {
		this.al3 = al3;
	}

	public Questao getQuestao() {
		return questao;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public Assunto getAssunto() {
		return assunto;
	}

	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
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
