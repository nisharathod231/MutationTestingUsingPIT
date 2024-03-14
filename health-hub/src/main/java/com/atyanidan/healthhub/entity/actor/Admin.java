package com.atyanidan.healthhub.entity.actor;

import com.atyanidan.healthhub.entity.District;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Admin")
@PrimaryKeyJoinColumn(name = "admin_id")
public class Admin extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "home_address")
    private String homeAddress;

    @Column(name = "office_address")
    private String officeAddress;

    @Column(name = "gender")
    private String gender;

    @OneToOne
    @JoinColumn(name = "district_id")
    private District district;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "blood_group")
    private String bloodGroup;

    public Admin() {
    }

    public Admin(String firstName, String middleName, String lastName, String homeAddress, String officeAddress, String gender, Date dob, String bloodGroup) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.officeAddress = officeAddress;
        this.gender = gender;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}