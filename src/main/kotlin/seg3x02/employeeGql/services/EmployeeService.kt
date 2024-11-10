package seg3x02.employeeGql.services

import seg3x02.employeeGql.entity.Employee

interface EmployeeService {
    fun getAllEmployees(): List<Employee>
    fun getEmployeeById(id: String): Employee?
    fun saveEmployee(employee: Employee): Employee
}
