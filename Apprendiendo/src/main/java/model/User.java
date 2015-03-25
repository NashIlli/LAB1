package model;

import org.hibernate.annotations.*;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by Nash on 24/03/15
 */
@DynamicUpdate
@Table(appliesTo = "User")
public class User {
    @Column(name= "LASTAME", nullable = false)
    private String lastName;
    @Column(name= "NAME", nullable = false)
    private String name;
    @Column(name= "EMAIL", nullable = false, unique=true)
    private String email;
    @Column(name ="PASSWORD", nullable = false)
    private String password;
    @Column(name ="BORNDATE", nullable = false)
    private Date bornDate; // TODO -> Ver
    @Column(name ="DOCTYPE", nullable = false)
    private int documentType;
    @Column(name ="DOCNUMBER", nullable = false, unique = true)
    private int documentNumber;
    @Column(name ="COUNTRY",nullable = false)
    private String country;
    @Column(name ="PROVINCE",nullable = false)
    private String province;
    @Column(name ="CITY",nullable = false)
    private String city;
    @Column(name ="DESCRPTION",nullable = false)
    private String description;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "courses")  // TODO -> Ver
    private List<Course> currentCourses;

    public User(String province, String description, String city, String country, int documentNumber, int documentType, Date bornDate, String password, String email, String name, String lastName) {
        this.province = province;
        this.description = description;
        this.city = city;
        this.country = country;
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.bornDate = bornDate;
        this.password = password;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
    }
    public User(){
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
