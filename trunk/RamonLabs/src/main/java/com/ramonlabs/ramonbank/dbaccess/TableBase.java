package com.ramonlabs.ramonbank.dbaccess;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class TableBase<T> {

	protected HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public void save() {
		hibernateTemplate.saveOrUpdate(this);
	}

	public void update() {
		hibernateTemplate.saveOrUpdate(this);
	}

	@SuppressWarnings("unchecked")
	public List<T> loadAll() {
		return (List<T>) hibernateTemplate.loadAll(this.getClass());
	}

	

	@SuppressWarnings("unchecked")	
	public List<T> select(Parametro... parametros) {

		DetachedCriteria criteria = DetachedCriteria.forClass(this.getClass());

		for (Parametro t : parametros) {
			criteria.add(Restrictions.eq(t.getName(), t.getValue()));
		}

		return hibernateTemplate.findByCriteria(criteria);

	}

	
	@SuppressWarnings("unchecked")
	public T Load(Parametro... parametros) {

		DetachedCriteria criteria = DetachedCriteria.forClass(this.getClass());

		for (Parametro t : parametros) {
			criteria.add(Restrictions.eq(t.getName(), t.getValue()));
		}
		List<T> lista = hibernateTemplate.findByCriteria(criteria);

		if(lista.size() > 0)
			return lista.get(0);
		return null;

	}
}
