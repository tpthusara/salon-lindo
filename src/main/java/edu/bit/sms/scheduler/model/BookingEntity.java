package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "booking", schema = "schedular1", catalog = "")
public class BookingEntity {
    private Long id;
    private Timestamp createDate;
    private Integer bookingStatus;
    private Long userId;
    private Long guestDetailsId;
    private Long userCustomerId;

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
    @Column(name = "BOOKING_STATUS", nullable = true)
    public Integer getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(Integer bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Basic
    @Column(name = "USER_ID", nullable = false)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "GUEST_DETAILS_ID", nullable = false)
    public Long getGuestDetailsId() {
        return guestDetailsId;
    }

    public void setGuestDetailsId(Long guestDetailsId) {
        this.guestDetailsId = guestDetailsId;
    }

    @Basic
    @Column(name = "USER_Customer_ID", nullable = false)
    public Long getUserCustomerId() {
        return userCustomerId;
    }

    public void setUserCustomerId(Long userCustomerId) {
        this.userCustomerId = userCustomerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingEntity that = (BookingEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(bookingStatus, that.bookingStatus) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(guestDetailsId, that.guestDetailsId) &&
                Objects.equals(userCustomerId, that.userCustomerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, bookingStatus, userId, guestDetailsId, userCustomerId);
    }
}
