package br.usjt.usjt_ccp3anmca_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Previsao;

public class TesteInsereUmaPrevisao {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Previsao p = new Previsao();
		p.setTempMin(15.0);
		p.setTempMax(35.0);
		p.setUmidade(40);
		p.setDescricao("Sol");
		p.setLatitude("55°W");
		p.setLongitude("10°S");
		p.setHora("15");
		manager.persist(p);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
