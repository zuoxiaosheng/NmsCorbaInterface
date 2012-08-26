package dao;

// Generated 2011-3-12 17:33:56 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Trareq.
 * @see dao.Trareq
 * @author Hibernate Tools
 */
public class TrareqHome {

	private static final Log log = LogFactory.getLog(TrareqHome.class);

//	private final SessionFactory sessionFactory = getSessionFactory();
//
//	protected SessionFactory getSessionFactory() {
//		try {
//			return (SessionFactory) new InitialContext()
//					.lookup("SessionFactory");
//		} catch (Exception e) {
//			log.error("Could not locate SessionFactory in JNDI", e);
//			throw new IllegalStateException(
//					"Could not locate SessionFactory in JNDI");
//		}
//	}
	private static final SessionFactory sessionFactory;
	static{
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();					
		}
		catch(Throwable ex){
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

	public void persist(Trareq transientInstance) {
		log.debug("persisting Trareq instance");
		try {
//			sessionFactory.getCurrentSession().persist(transientInstance);
			Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction(); 		    
			session.persist(transientInstance);
			tx.commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Trareq instance) {
		log.debug("attaching dirty Trareq instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Trareq instance) {
		log.debug("attaching clean Trareq instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Trareq persistentInstance) {
		log.debug("deleting Trareq instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Trareq merge(Trareq detachedInstance) {
		log.debug("merging Trareq instance");
		try {
			Trareq result = (Trareq) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Trareq findById(dao.TrareqId id) {
		log.debug("getting Trareq instance with id: " + id);
		try {
			Trareq instance = (Trareq) sessionFactory.getCurrentSession().get(
					"dao.Trareq", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Trareq instance) {
		log.debug("finding Trareq instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("dao.Trareq").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
