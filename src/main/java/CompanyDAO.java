import java.util.List;

public interface CompanyDAO {

	//create
	void add(Company company);

	//read
	List<Company> getAll();
	Company getById(Long id);

	//update
	void update(Company company);

	//delete
	void remove(Company company);
}
