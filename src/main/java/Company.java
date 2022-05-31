import javax.persistence.*;

@Entity
@Table(name="COMPANIES")
public class Company {

	public Company() {}
	// Если установить значения полей в конструкторе, а не в сеттерах, то при создании связанных таблиц выбросится исключение:
	//StaleObjectStateException: Row was updated or deleted by another transaction (or unsaved-value mapping was incorrect)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="COMPANY_NAME")
	private String companyName;

	public void setId(Integer id) {this.id = id;}
	public Integer getId() {return id;}

	public void setCompanyName(String companyName) {this.companyName = companyName;}
	public String getCompanyName() {return companyName;}



	@Override
	public String toString() {
		return "Company{" +
		"id=" + id +
		", companyName=\'" + companyName + "\'" +
		"}";
    }
}