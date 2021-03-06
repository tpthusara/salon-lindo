package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "services", schema = "schedular1", catalog = "")
public class ServicesEntity {
    private Long id;
    private String service;
    private Timestamp createDate;
    private Integer deleteStatus;
    private Double rate;

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
    @Column(name = "SERVICE", nullable = true, length = 45)
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
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
    @Column(name = "RATE", nullable = true, precision = 0)
    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicesEntity that = (ServicesEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(service, that.service) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(deleteStatus, that.deleteStatus) &&
                Objects.equals(rate, that.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, service, createDate, deleteStatus, rate);
    }
}
