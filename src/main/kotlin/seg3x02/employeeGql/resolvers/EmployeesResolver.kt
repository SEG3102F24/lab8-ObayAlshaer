package seg3x02.employeeGql.resolvers

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Controller
import seg3x02.employeeGql.entity.Employee
import seg3x02.employeeGql.services.EmployeeService

@Controller
class EmployeesResolver(
    private val employeeService: EmployeeService
) : GraphQLQueryResolver, GraphQLMutationResolver {

    fun getAllEmployees(): List<Employee> {
        return employeeService.getAllEmployees()
    }

    fun getEmployeeById(id: String): Employee? {
        return employeeService.getEmployeeById(id)
    }

    fun addEmployee(
        name: String,
        dateOfBirth: String,
        city: String,
        salary: Float,
        gender: String?,
        email: String?
    ): Employee {
        val employee = Employee(
            name = name,
            dateOfBirth = dateOfBirth,
            city = city,
            salary = salary,
            gender = gender,
            email = email
        )
        return employeeService.saveEmployee(employee)
    }
}
