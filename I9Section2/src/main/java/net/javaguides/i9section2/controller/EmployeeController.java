package net.javaguides.i9section2.controller;


import net.javaguides.i9section2.exception.ResourceNotFoundException;
import net.javaguides.i9section2.model.Employee;
import net.javaguides.i9section2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/test")
public class EmployeeController {
	@Autowired
	private EmployeeRepository EmployeeRepository;


	@GetMapping("/admin")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public List<Employee> getAllEmployees() {
		return EmployeeRepository.findAll();
	}


	// build create employee REST API
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return EmployeeRepository.save(employee);
	}


	// build get employee by id REST API
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
		Employee employee = EmployeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id:" + id));
		return ResponseEntity.ok(employee);
	}


	// build update employee REST API
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails) {
		Employee updateEmployee = EmployeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id: " + id));
		updateEmployee.setSocialSecurity(employeeDetails.getSocialSecurity() != null ? employeeDetails.getSocialSecurity() : updateEmployee.getSocialSecurity());
		updateEmployee.setAddress(employeeDetails.getAddress() != null ? employeeDetails.getAddress() : updateEmployee.getAddress());
		updateEmployee.setAlienauthorizationnumber(employeeDetails.getAlienauthorizationnumber() != null ? employeeDetails.getAlienauthorizationnumber() : updateEmployee.getAlienauthorizationnumber());
		updateEmployee.setAptnumber(employeeDetails.getAptnumber() != null ? employeeDetails.getAptnumber() : updateEmployee.getAptnumber());
		updateEmployee.setCitizenshipstatus(employeeDetails.getCitizenshipstatus() != null ? employeeDetails.getCitizenshipstatus() : updateEmployee.getCitizenshipstatus());
		updateEmployee.setFormadmissionnumber(employeeDetails.getFormadmissionnumber() != null ? employeeDetails.getFormadmissionnumber() : updateEmployee.getFormadmissionnumber());
		updateEmployee.setForeignpassportnumber(employeeDetails.getForeignpassportnumber() != null ? employeeDetails.getForeignpassportnumber() : updateEmployee.getForeignpassportnumber());
		updateEmployee.setCountryofissuance(employeeDetails.getCountryofissuance() != null ? employeeDetails.getCountryofissuance() : updateEmployee.getCountryofissuance());
		updateEmployee.setExpirationdate(employeeDetails.getExpirationdate() != null ? employeeDetails.getExpirationdate() : updateEmployee.getExpirationdate());
		updateEmployee.setCity(employeeDetails.getCity() != null ? employeeDetails.getCity() : updateEmployee.getCity());
		updateEmployee.setDateofbirth(employeeDetails.getDateofbirth() != null ? employeeDetails.getDateofbirth() : updateEmployee.getDateofbirth());
		updateEmployee.setEmployee_email(employeeDetails.getEmployee_email() != null ? employeeDetails.getEmployee_email() : updateEmployee.getEmployee_email());
		updateEmployee.setEmployeesignature(employeeDetails.getEmployeesignature() != null ? employeeDetails.getEmployeesignature(): updateEmployee.getEmployeesignature());
		updateEmployee.setEmployeesignaturedate(employeeDetails.getEmployeesignaturedate() != null ? employeeDetails.getEmployeesignaturedate():updateEmployee.getEmployeesignaturedate());
		updateEmployee.setFirst_name(employeeDetails.getFirst_name() != null ? employeeDetails.getFirst_name():updateEmployee.getFirst_name());
		updateEmployee.setLast_name(employeeDetails.getLast_name() != null ? employeeDetails.getLast_name():updateEmployee.getLast_name());
		updateEmployee.setMiddleinitial(employeeDetails.getMiddleinitial() != null ? employeeDetails.getMiddleinitial():updateEmployee.getMiddleinitial());
		updateEmployee.setOtherlastname(employeeDetails.getOtherlastname() != null ? employeeDetails.getOtherlastname():updateEmployee.getOtherlastname());
		updateEmployee.setState(employeeDetails.getState()!= null ? employeeDetails.getState():updateEmployee.getState());
		updateEmployee.setTelephone(employeeDetails.getTelephone()!= null ? employeeDetails.getTelephone():updateEmployee.getTelephone());
		updateEmployee.setZipcode(employeeDetails.getZipcode()!= null ? employeeDetails.getZipcode():updateEmployee.getZipcode());
		if(employeeDetails.getId() != 0) updateEmployee.setId(employeeDetails.getId());
		updateEmployee.setPreparerstatus(employeeDetails.getPreparerstatus() != null ? employeeDetails.getPreparerstatus():updateEmployee.getPreparerstatus());
		updateEmployee.setPreparersig(employeeDetails.getPreparersig() != null ? employeeDetails.getPreparersig(): updateEmployee.getPreparersig());
		updateEmployee.setPreparerdate(employeeDetails.getPreparerdate()  != null ? employeeDetails.getPreparerdate(): updateEmployee.getPreparerdate());
		updateEmployee.setPreparerlast(employeeDetails.getPreparerlast()  != null ? employeeDetails.getPreparerlast(): updateEmployee.getPreparerlast());
		updateEmployee.setPreparerfirst(employeeDetails.getPreparerfirst()  != null ? employeeDetails.getPreparerfirst(): updateEmployee.getPreparerfirst());
		updateEmployee.setPrepareraddress(employeeDetails.getPrepareraddress()  != null ? employeeDetails.getPrepareraddress(): updateEmployee.getPrepareraddress());
		updateEmployee.setPreparercity(employeeDetails.getPreparercity()  != null ? employeeDetails.getPreparercity(): updateEmployee.getPreparercity());
		updateEmployee.setPreparerstate(employeeDetails.getPreparerstate()  != null ? employeeDetails.getPreparerstate(): updateEmployee.getPreparerstate());
		updateEmployee.setPreparerzip(employeeDetails.getPreparerzip() != null ? employeeDetails.getPreparerzip() : updateEmployee.getPreparerzip());
		updateEmployee.setI9status(employeeDetails.getI9status() != null ? employeeDetails.getI9status() : updateEmployee.getI9status());
		updateEmployee.setBlacklist(employeeDetails.getBlacklist() != null ? employeeDetails.getBlacklist() : updateEmployee.getBlacklist());
		EmployeeRepository.save(updateEmployee);
		return ResponseEntity.ok(updateEmployee);
	}
	// build delete employee REST API
	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {
		Employee employee = EmployeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id: " + id));
		EmployeeRepository.delete(employee);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}