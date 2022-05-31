import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompanyService implements CompanyDAO {
	public void add(Company company) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();

			session.save(company);

			transaction.commit();
			session.close();
	}

	public List<Company> getAll() {
		List<Company> companyList = null;
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();

			String sql = "SELECT * FROM COMPANY";
			Query query = session.createNativeQuery(sql).addEntity(Company.class);
			companyList = query.list();

			transaction.commit();
			session.close();
		return companyList;
	}

	public Company getById(Long id) {
		Company company = null;
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();

			String sql = "SELECT * FROM COMPANY WHERE ID = :id";
			Query query = session.createNativeQuery(sql).addEntity(Company.class);
			query.setParameter("id", id);
			company = (Company) query.getSingleResult();

			transaction.commit();
			session.close();
		return company;
	}

	public void update(Company company) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();

			session.update(company);

			transaction.commit();
			session.close();
	}

	public void remove(Company company) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();

			session.remove(company);

			transaction.commit();
			session.close();
	}
}