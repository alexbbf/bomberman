package business;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.QuestaoDao;
import model.Assunto;
import model.Questao;

@LocalBean
@Stateless
public class QuestaoBusiness {
	
	@PersistenceContext
	private EntityManager em;

	private QuestaoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new QuestaoDao(em);

	}

	public List<Questao> pesquisar(Assunto[] assuntos) {
		long totalDePerguntas = 30;
		long quantidadePorAssunto = Math.round( totalDePerguntas/ assuntos.length);
		
		List<Questao> questoes = new ArrayList<Questao>();
		
		for (int i = 0; i < assuntos.length; i++) {
			Assunto a = assuntos[i];
			questoes.addAll(dao.pesquisar(quantidadePorAssunto, a));
		}
		
		return questoes;
	}
	
	


}
