package hibernate.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import org.hibernate.annotations.Parameter;

@Entity
public class Employee {

    @Id
    @GeneratedValue(generator = "user-emplo")
    @GenericGenerator(name = "user-emplo" ,strategy = "foreign" ,
    parameters = @Parameter(name = "property" , value = "user"))

    private int id;
    private String nationalcode;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;

    public Employee(String nationalcode) {
        this.nationalcode = nationalcode;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalcode() {
        return nationalcode;
    }

    public void setNationalcode(String nationalcode) {
        this.nationalcode = nationalcode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
