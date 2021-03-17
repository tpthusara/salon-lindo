package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "employee_attendance", schema = "schedular1", catalog = "")
public class EmployeeAttendanceEntity {
    private Long id;
    private Timestamp createdDate;
    private Integer inTime;
    private Integer outTime;
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
    @Column(name = "CREATED_DATE", nullable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "IN_TIME", nullable = true)
    public Integer getInTime() {
        return inTime;
    }

    public void setInTime(Integer inTime) {
        this.inTime = inTime;
    }

    @Basic
    @Column(name = "OUT_TIME", nullable = true)
    public Integer getOutTime() {
        return outTime;
    }

    public void setOutTime(Integer outTime) {
        this.outTime = outTime;
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
        EmployeeAttendanceEntity that = (EmployeeAttendanceEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(inTime, that.inTime) &&
                Objects.equals(outTime, that.outTime) &&
                Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdDate, inTime, outTime, employeeId);
    }
}
