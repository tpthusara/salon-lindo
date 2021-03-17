package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "employee", schema = "schedular1", catalog = "")
public class EmployeeEntity {
    private Long id;
    private Timestamp createdDate;
    private String firstName;
    private String lastName;
    private String unitNo;
    private String street;
    private String suburb;
    private String state;
    private String postalCode;
    private String country;
    private String phone;
    private String mobile;
    private String email;
    private Integer deleteStatus;
    private String employeeInTime;
    private String emplyeeOutTime;
    private String employeeRate;
    private String birthday;
    private String maritalStatus;
    private String gender;
    private String nic;
    private String passport;
    private String image;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CREATED_DATE", nullable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = true, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = true, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "UNIT_NO", nullable = true, length = 45)
    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    @Basic
    @Column(name = "STREET", nullable = true, length = 45)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "SUBURB", nullable = true, length = 45)
    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    @Basic
    @Column(name = "STATE", nullable = true, length = 45)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "POSTAL_CODE", nullable = true, length = 45)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "COUNTRY", nullable = true, length = 45)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "PHONE", nullable = true, length = 45)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "MOBILE", nullable = true, length = 45)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "DELETE_STATUS", nullable = true)
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Basic
    @Column(name = "EMPLOYEE_IN_TIME", nullable = true)
    public String getEmployeeInTime() {
        return employeeInTime;
    }

    public void setEmployeeInTime(String employeeInTime) {
        this.employeeInTime = employeeInTime;
    }

    @Basic
    @Column(name = "EMPLYEE_OUT_TIME", nullable = true)
    public String getEmplyeeOutTime() {
        return emplyeeOutTime;
    }

    public void setEmplyeeOutTime(String emplyeeOutTime) {
        this.emplyeeOutTime = emplyeeOutTime;
    }

    @Basic
    @Column(name = "EMPLOYEE_RATE", nullable = true, precision = 0)
    public String getEmployeeRate() {
        return employeeRate;
    }

    public void setEmployeeRate(String employeeRate) {
        this.employeeRate = employeeRate;
    }

    @Basic
    @Column(name = "BIRTHDAY", nullable = true)
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "MARITAL_STATUS", nullable = true, length = 20)
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "GENDER", nullable = true, length = 20)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "NIC", nullable = true, length = 45)
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Basic
    @Column(name = "PASSPORT", nullable = true, length = 45)
    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(unitNo, that.unitNo) &&
                Objects.equals(street, that.street) &&
                Objects.equals(suburb, that.suburb) &&
                Objects.equals(state, that.state) &&
                Objects.equals(postalCode, that.postalCode) &&
                Objects.equals(country, that.country) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(email, that.email) &&
                Objects.equals(deleteStatus, that.deleteStatus) &&
                Objects.equals(employeeInTime, that.employeeInTime) &&
                Objects.equals(emplyeeOutTime, that.emplyeeOutTime) &&
                Objects.equals(employeeRate, that.employeeRate) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(maritalStatus, that.maritalStatus) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(nic, that.nic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdDate, firstName, lastName, unitNo, street, suburb, state, postalCode, country, phone, email, deleteStatus, employeeInTime, emplyeeOutTime, employeeRate, birthday, maritalStatus, gender, nic);
    }
}
