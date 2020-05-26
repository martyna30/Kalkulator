package com.kodilla.hibernate.manyTomany;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name="Company.retrieveCompanyWithStringCharacter",
        query = "FROM Company WHERE name LIKE :NAME"
)

@NamedNativeQuery(
        name ="Company.retrieveCompanyWithName",
        query ="SELECT COMPANY_ID, COMPANY_NAME, SUBSTRING(COMPANY_NAME, 1,3) AS COMPANY_FIRST_CHARS " +
                "FROM COMPANIES" +
                " WHERE SUBSTRING(COMPANY_NAME, 1,3) = 'Sof'",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {}

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")

    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
