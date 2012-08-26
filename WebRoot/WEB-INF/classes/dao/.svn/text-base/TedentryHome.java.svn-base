package dao;

// Generated 2011-3-12 17:33:56 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Iterator;
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
 * Home object for domain model class Tedentry.
 * @see dao.Tedentry
 * @author Hibernate Tools
 */
public class TedentryHome {

	private static final Log log = LogFactory.getLog(TedentryHome.class);

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

	public void persist(Tedentry transientInstance) {
		log.debug("persisting Tedentry instance");
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

	public void attachDirty(Tedentry instance) {
		log.debug("attaching dirty Tedentry instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tedentry instance) {
		log.debug("attaching clean Tedentry instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tedentry persistentInstance) {
		log.debug("deleting Tedentry instance");
		try {
//			sessionFactory.getCurrentSession().delete(persistentInstance);
			Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction(); 		    
			session.delete(persistentInstance);
			tx.commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tedentry merge(Tedentry detachedInstance) {
		log.debug("merging Tedentry instance");
		try {
			Tedentry result = (Tedentry) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tedentry findById(dao.TedentryId id) {
		log.debug("getting Tedentry instance with id: " + id);
		try {
			Tedentry instance = (Tedentry) sessionFactory.getCurrentSession()
			.get("dao.Tedentry", id);
//	Session session = sessionFactory.openSession();//先加入import org.hibernate.Session;
//    //Tb1 instance = (Tb1) session.load("com.sss.commmon.Tb1", id);这句也可以
//       Tedentry instance = (Tedentry) session.get("dao.Tedentry", id);
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
	
	public List<Tedentry> findByUserName(String userName) {
		log.debug("getting Tedentry instance whth username:" + userName);
		try {
			
			List<Tedentry> tedentry = new ArrayList<Tedentry>();
			Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();
			List instance = session.createQuery("from Tedentry").list();
			for(Iterator it = instance.iterator();it.hasNext();) {
				Tedentry te = (Tedentry) it.next();
				if(te.getId().getUsername().equals(userName)) {
					tedentry.add(te);
				}				
//				System.out.println(te.getId().getTeRouterId());
			}
			tx.commit();
			if (tedentry == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return tedentry;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tedentry instance) {
		log.debug("finding Tedentry instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("dao.Tedentry")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
