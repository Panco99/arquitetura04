package br.usjt.usjt_ccp3anmca_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.DiasDaSemana;

public class TesteRemovePerfilComUsuarioAssociado {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiasDaSemana d = manager.find(DiasDaSemana.class, 1L);
		manager.remove(d);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
