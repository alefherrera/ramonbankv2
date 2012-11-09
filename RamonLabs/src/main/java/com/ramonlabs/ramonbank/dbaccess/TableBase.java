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

	/*
	 * public void create() { Session session =
	 * hibernateTemplate.getSessionFactory().getCurrentSession(); Transaction tx
	 * = session.beginTransaction(); session.save(this); tx.commit();
	 * 
	 * }
	 */

	// public void update() {
	// Session session =
	// hibernateTemplate.getSessionFactory().getCurrentSession();
	// session.update(this);

	// }

	/*
	 * public void delete() { Session session =
	 * hibernateTemplate.getSessionFactory().getCurrentSession();
	 * session.delete(this);
	 * 
	 * }
	 */

	/*public List<T> select() {
		ArrayList<Parametro> param = new ArrayList<Parametro>();

		Object valor = null;

		for (Method campo : this.getClass().getMethods()) {

				if (campo.getName().startsWith("get") && campo.getName() != "getClass")
				{
					try {
						valor = new Object();
						valor = campo.invoke(this,new Object[]{});
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (valor != null) {
						param.add(new Parametro(campo.getName().replace("get",""), valor));
					}
				}			
			
		}

		return this.select((Parametro[]) param.toArray());

		
		 * foreach (System.Reflection.PropertyInfo item in
		 * this.GetType().GetProperties()) { var valor = item.GetValue(this);
		 * 
		 * if (valor != null && Dic.ContainsKey(valor.GetType()) &&
		 * valor.ToString() != Dic[valor.GetType()].ToString()) { param.Add(new
		 * Parameter(item.Name, valor)); } } return
		 * this.Select(param.ToArray());
		 
	}*/

	@SuppressWarnings("unchecked")	
	public List<T> select(Parametro... parametros) {

		DetachedCriteria criteria = DetachedCriteria.forClass(this.getClass());

		for (Parametro t : parametros) {
			criteria.add(Restrictions.eq(t.getName(), t.getValue()));
		}

		return hibernateTemplate.findByCriteria(criteria);

	}

	@SuppressWarnings("unchecked")
	public List<T> select(Parametro parametro) {

		DetachedCriteria criteria = DetachedCriteria.forClass(this.getClass());

		criteria.add(Restrictions.eq(parametro.getName(), parametro.getValue()));

		return hibernateTemplate.findByCriteria(criteria);
	}
	
	@SuppressWarnings("unchecked")
	public T Load(Parametro parametro)
	{
		DetachedCriteria criteria = DetachedCriteria.forClass(this.getClass());

		criteria.add(Restrictions.eq(parametro.getName(), parametro.getValue()));
		List<T> lista = hibernateTemplate.findByCriteria(criteria);
		if(lista.size() > 0)
			return lista.get(0);
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public T Load(Parametro[] parametros) {

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
