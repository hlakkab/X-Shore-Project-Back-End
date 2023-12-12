package com.devglan.userportal.models;

import com.devglan.userportal.models.Cab;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;

@EnableAspectJAutoProxy(proxyTargetClass = false)
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String email;
    @Column
    private String psw;
    @Column
    private String emp_id;
    @Column
    private String mobile;
    @Column
    private String location;
    @OneToMany(fetch = EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Cab> Cab = new ArrayList<>();

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return psw;
    }

    public void setPassword(String psw) {
        this.psw = psw;
    }
    
    public String getEmployeeId() {
        return emp_id;
    }

    public void setEmployeeId(String empId) {
        this.emp_id = empId;
    }

    public Collection<com.devglan.userportal.models.Cab> getCab() {
        return Cab;
    }

    public void setCab(Collection<com.devglan.userportal.models.Cab> cab) {
        Cab = cab;
    }
}
