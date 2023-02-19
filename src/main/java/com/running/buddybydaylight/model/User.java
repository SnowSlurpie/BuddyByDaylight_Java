package com.running.buddybydaylight.model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {


    //    user model containing each column of the table here
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(nullable = false, unique = true,length =45)
    private String email;
    @Column(nullable = false, length = 15)
    private String password;
    @Column(nullable = false, unique = true,length =45)
    private String userName;

    public String getRole() {
        return role;
    }

    private String role;

    private boolean enabled;


    //    TODO: Link builds to users?


    public User(Integer id, String email, String password, String userName) {
        Id = id;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.role = role;
    }

    public User() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", role='" + role + '\''+
                '}';


    }
}
