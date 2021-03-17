package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "service_employee_map", schema = "schedular1", catalog = "")
public class ServiceEmployeeMapEntity {
    private Long id;
    private Timestamp createDate;
    private Integer deleteStatus;
    private Long servicesId;
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
    @Column(name = "CREATE_DATE", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
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
    @Column(name = "SERVICES_ID", nullable = false)
    public Long getServicesId() {
        return servicesId;
    }

    public void setServicesId(Long servicesId) {
        this.servicesId = servicesId;
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
        ServiceEmployeeMapEntity that = (ServiceEmployeeMapEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(deleteStatus, that.deleteStatus) &&
                Objects.equals(servicesId, that.servicesId) &&
                Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, deleteStatus, servicesId, employeeId);
    }
}
