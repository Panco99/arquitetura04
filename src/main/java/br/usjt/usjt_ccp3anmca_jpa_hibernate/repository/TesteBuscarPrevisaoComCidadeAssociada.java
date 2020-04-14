package br.usjt.usjt_ccp3anmca_jpa_hibernate.repository;

import javax.persistence.EntityManager;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Previsao;

public class TesteBuscarPrevisaoComCidadeAssociada {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Previsao p = manager.find(Previsao.class, 1L);
		System.out.println(p.getCidades());
		System.out.println(p);
		manager.close();
		JPAUtil.close();
	}
}


