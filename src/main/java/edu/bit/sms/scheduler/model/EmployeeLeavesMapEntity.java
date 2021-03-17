package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "employee_leaves_map", schema = "schedular1", catalog = "")
public class EmployeeLeavesMapEntity {
    private Long id;
    private Long employeeLeavesId;
    private Timestamp createDate;
    private String status;
    private Timestamp fromDate;
    private Timestamp toDate;
    private Long employeeId;

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
    @Column(name = "EMPLOYEE_LEAVES_ID", nullable = false)
    public Long getEmployeeLeavesId() {
        return employeeLeavesId;
    }

    public void setEmployeeLeavesId(Long employeeLeavesId) {
        this.employeeLeavesId = employeeLeavesId;
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
    @Column(name = "STATUS", nullable = true, length = 45)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "FROM_DATE", nullable = true)
    public Timestamp getFromDate() {
        return fromDate;
    }

    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "TO_DATE", nullable = true)
    public Timestamp getToDate() {
        return toDate;
    }

    public void setToDate(Timestamp toDate) {
        this.toDate = toDate;
    }

    @Basic
    @Column(name = "EMPLOYEE_ID", nullable = false)
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeLeavesMapEntity that = (EmployeeLeavesMapEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(employeeLeavesId, that.employeeLeavesId) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(status, that.status) &&
                Objects.equals(fromDate, that.fromDate) &&
                Objects.equals(toDate, that.toDate) &&
                Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeLeavesId, createDate, status, fromDate, toDate, employeeId);
    }
}
