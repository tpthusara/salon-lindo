package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user_customer", schema = "schedular1", catalog = "")
public class UserCustomerEntity {
    private Long id;
    private Timestamp createDate;
    private String userName;
    private String password;
    private String userType;
    private String verificationStatus;
    private Timestamp passwordChangedDate;
    private Integer deleteStatus;
    private Long customerId;

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
    @Column(name = "CREATE_DATE", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = true, length = 45)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "USER_TYPE", nullable = true, length = 45)
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "VERIFICATION_STATUS", nullable = true, length = 45)
    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    @Basic
    @Column(name = "PASSWORD_CHANGED_DATE", nullable = true)
    public Timestamp getPasswordChangedDate() {
        return passwordChangedDate;
    }

    public void setPasswordChangedDate(Timestamp passwordChangedDate) {
        this.passwordChangedDate = passwordChangedDate;
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
    @Column(name = "CUSTOMER_ID", nullable = false)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCustomerEntity that = (UserCustomerEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(userType, that.userType) &&
                Objects.equals(verificationStatus, that.verificationStatus) &&
                Objects.equals(passwordChangedDate, that.passwordChangedDate) &&
                Objects.equals(deleteStatus, that.deleteStatus) &&
                Objects.equals(customerId, that.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, userName, password, userType, verificationStatus, passwordChangedDate, deleteStatus, customerId);
    }
}
