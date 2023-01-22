package net.javaguides.springbootbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "socialsecurity")
	private String SocialSecurity;

	@Column(name = "address")
	private String address;

	@Column(name = "alienauthorizationnumber")
	private String alienauthorizationnumber;

	@Column(name = "aptnumber")
	private String aptnumber;

	@Column(name = "citizenshipstatus")
	private String citizenshipstatus;




	@Column(name = "formadmissionnumber")
	private String formadmissionnumber;

	@Column(name = "foreignpassportnumber")
	private String foreignpassportnumber;

	@Column(name = "countryofissuance")
	private String countryofissuance;

	@Column(name = "expirationdate")
	private String expirationdate;

	@Column(name = "city")
	private String city;

	@Column(name = "dateofbirth")
	private String dateofbirth;

	@Column(name = "employee_email")
	private String employee_email;

	@Column(name = "employeesignature")
	private String employeesignature;

	@Column(name = "employeesignaturedate")
	private String employeesignaturedate;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "middleinitial")
	private String middleinitial;

	@Column(name = "otherlastname")
	private String otherlastname;

	@Column(name = "state")
	private String state;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "zipcode")
	private String zipcode;

	//Adding Preparer Info

	@Column(name = "PreparerStatus")
	private String PreparerStatus;

	@Column(name = "PreparerSignature")
	private String PreparerSignature;

	@Column(name = "PreparerSignatureDate")
	private String PreparerSignatureDate;

	@Column(name = "PreparerFirstName")
	private String PreparerFirstName;

	@Column(name = "PreparerLastName")
	private String PreparerLastName;

	@Column(name = "PreparerAddress")
	private String PreparerAddress;

	@Column(name = "PreparerCity")
	private String PreparerCity;

	@Column(name = "PreparerState")
	private String PreparerState;

	@Column(name = "PreparerZipCode")
	private String PreparerZipCode;

	public String getPreparerFirstName() {
		return PreparerFirstName;
	}

	public void setPreparerFirstName(String preparerFirstName) {
		PreparerFirstName = preparerFirstName;
	}

	public String getPreparerLastName() {
		return PreparerLastName;
	}

	public void setPreparerLastName(String preparerLastName) {
		PreparerLastName = preparerLastName;
	}

	public String getPreparerAddress() {
		return PreparerAddress;
	}

	public void setPreparerAddress(String preparerAddress) {
		PreparerAddress = preparerAddress;
	}

	public String getPreparerCity() {
		return PreparerCity;
	}

	public void setPreparerCity(String preparerCity) {
		PreparerCity = preparerCity;
	}

	public String getPreparerState() {
		return PreparerState;
	}

	public void setPreparerState(String preparerState) {
		PreparerState = preparerState;
	}

	public String getPreparerZipCode() {
		return PreparerZipCode;
	}

	public void setPreparerZipCode(String preparerZipCode) {
		PreparerZipCode = preparerZipCode;
	}

	public String getPreparerStatus() {
		return PreparerStatus;
	}

	public void setPreparerStatus(String preparerStatus) {
		PreparerStatus = preparerStatus;
	}

	public String getPreparerSignature() {
		return PreparerSignature;
	}

	public void setPreparerSignature(String preparerSignature) {
		PreparerSignature = preparerSignature;
	}

	public String getPreparerSignatureDate() {
		return PreparerSignatureDate;
	}

	public void setPreparerSignatureDate(String preparerSignatureDate) {
		PreparerSignatureDate = preparerSignatureDate;
	}



	public String getFormadmissionnumber() {
		return formadmissionnumber;
	}

	public void setFormadmissionnumber(String formadmissionnumber) {
		this.formadmissionnumber = formadmissionnumber;
	}

	public String getForeignpassportnumber() {
		return foreignpassportnumber;
	}

	public void setForeignpassportnumber(String foreignpassportnumber) {
		this.foreignpassportnumber = foreignpassportnumber;
	}

	public String getCountryofissuance() {
		return countryofissuance;
	}

	public void setCountryofissuance(String countryofissuance) {
		this.countryofissuance = countryofissuance;
	}

	public String getExpirationdate() {
		return expirationdate;
	}

	public void setExpirationdate(String expirationdate) {
		this.expirationdate = expirationdate;
	}

	public String getSocialSecurity() {
		return SocialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.SocialSecurity = socialSecurity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlienauthorizationnumber() {
		return alienauthorizationnumber;
	}

	public void setAlienauthorizationnumber(String alienauthorizationnumber) {
		this.alienauthorizationnumber = alienauthorizationnumber;
	}

	public String getAptnumber() {
		return aptnumber;
	}

	public void setAptnumber(String aptnumber) {
		this.aptnumber = aptnumber;
	}



	public String getCitizenshipstatus() {
		return citizenshipstatus;
	}

	public void setCitizenshipstatus(String citizenshipstatus) {
		this.citizenshipstatus = citizenshipstatus;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public String getEmployeesignature() {
		return employeesignature;
	}

	public void setEmployeesignature(String employeesignature) {
		this.employeesignature = employeesignature;
	}

	public String getEmployeesignaturedate() {
		return employeesignaturedate;
	}

	public void setEmployeesignaturedate(String employeesignaturedate) {
		this.employeesignaturedate = employeesignaturedate;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddleinitial() {
		return middleinitial;
	}

	public void setMiddleinitial(String middleinitial) {
		this.middleinitial = middleinitial;
	}

	public String getOtherlastname() {
		return otherlastname;
	}

	public void setOtherlastname(String otherlastname) {
		this.otherlastname = otherlastname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}