package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.exception.ResourceNotFoundException;
import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// build create employee REST API
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	// build get employee by id REST API
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
		return ResponseEntity.ok(employee);
	}

	// build update employee REST API
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails) {
		Employee updateEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

		updateEmployee.setSocialSecurity(employeeDetails.getSocialSecurity());
		updateEmployee.setAddress(employeeDetails.getAddress());
		updateEmployee.setAlienauthorizationnumber(employeeDetails.getAlienauthorizationnumber());

		updateEmployee.setAptnumber(employeeDetails.getAptnumber());
		updateEmployee.setCitizenshipstatus(employeeDetails.getCitizenshipstatus());
		updateEmployee.setCity(employeeDetails.getCity());
		updateEmployee.setDateofbirth(employeeDetails.getDateofbirth());
		updateEmployee.setEmployee_email(employeeDetails.getEmployee_email());
		updateEmployee.setEmployeesignature(employeeDetails.getEmployeesignature());
		updateEmployee.setEmployeesignaturedate(employeeDetails.getEmployeesignaturedate());
		updateEmployee.setFirstname(employeeDetails.getFirstname());
		updateEmployee.setLastname(employeeDetails.getLastname());
		updateEmployee.setMiddleinitial(employeeDetails.getMiddleinitial());
		updateEmployee.setOtherlastname(employeeDetails.getOtherlastname());
		updateEmployee.setState(employeeDetails.getState());
		updateEmployee.setTelephone(employeeDetails.getTelephone());
		updateEmployee.setZipcode(employeeDetails.getZipcode());

		updateEmployee.setId(employeeDetails.getId());

		employeeRepository.save(updateEmployee);

		return ResponseEntity.ok(updateEmployee);
	}

	// build delete employee REST API
	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {

		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

		employeeRepository.delete(employee);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}
}