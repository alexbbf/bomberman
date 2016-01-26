package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Assunto;
import model.Questao;

public class QuestaoDao {

	private EntityManager em;

	public QuestaoDao(EntityManager em) {
		this.em = em;
	}

	public List<Questao> pesquisar(long quantidade, Assunto assunto) {

		return em
				.createQuery("select q from Questao q where q.assunto = :assunto order by random() limit :quantidade",
						Questao.class)
				.setParameter(":assunto", assunto).setParameter(":quantidade", quantidade).getResultList();
	}

}
