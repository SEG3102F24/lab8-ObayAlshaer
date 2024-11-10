package seg3x02.employeeGql.services.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import seg3x02.employeeGql.entity.Employee
import seg3x02.employeeGql.repository.EmployeesRepository
import seg3x02.employeeGql.services.EmployeeService

@Service
class EmployeeServiceImpl @Autowired constructor(
    private val employeesRepository: EmployeesRepository
) : EmployeeService {

    override fun getAllEmployees(): List<Employee> {
        return employeesRepository.findAll()
    }

    override fun getEmployeeById(id: String): Employee? {
        return employeesRepository.findById(id).orElse(null)
    }

    override fun saveEmployee(employee: Employee): Employee {
        return employeesRepository.save(employee)
    }
}
