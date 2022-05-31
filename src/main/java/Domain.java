import java.sql.*;
import java.util.*;

public class Domain {
	void go() {

		Company company = new Company();
		company.setCompanyName("VAZ");

		CompanyService companyService = new CompanyService();
		companyService.add(company);

		HibernateUtil.shutdown();
	}



	public static void main(String[] args) {
		new Domain().go();
	}
}