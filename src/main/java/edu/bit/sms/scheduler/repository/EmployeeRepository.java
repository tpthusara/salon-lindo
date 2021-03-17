package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    /**
     * findEmployeeById
     * @param employeeId
     * @return
     */
    EmployeeEntity findEmployeeById(Long employeeId);

    @Query(value = "select emp.* from employee emp INNER JOIN service_employee_map sem on sem.EMPLOYEE_ID = emp.ID WHERE sem.ID = ?1  GROUP BY emp.ID",
    nativeQuery = true)
    List<EmployeeEntity> getEmployeefroservice(Long id);

}
