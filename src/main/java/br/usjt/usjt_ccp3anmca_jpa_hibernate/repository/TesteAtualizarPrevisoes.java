package br.usjt.usjt_ccp3anmca_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Previsao;

public class TesteAtualizarPrevisoes {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Previsao p = manager.find(Previsao.class, 1L);
		p.setDescricao(p.getDescricao()+" Sol ");
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
