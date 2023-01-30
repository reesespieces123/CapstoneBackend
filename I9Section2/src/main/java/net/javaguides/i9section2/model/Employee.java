package net.javaguides.i9section2.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import javax.persistence.*;

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

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

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
	@Column(name = "preparestatus" )
	private String preparestatus;
	@Column (name = "preparersig")
	private String preparesig;
	@Column (name = "preparerdate")
	private String preparerdate;
	@Column (name= "preparerlast")
	private String preparerlast;
	@Column(name = "preparerfirst")
	private String preparerfirst;
	@Column(name = "prepareraddress")
	private String prepareraddress;
	@Column(name = "preparercity")
	private String preparercity;
	@Column(name = "preparerstate")
	private String preparerstate;
	@Column(name = "preparerzip")
	private String preparerzip;

	public String getPreparerstatus() {
		return preparestatus;
	}
	public void setPreparerstatus(String preparerstatus) {
		this.preparestatus = preparerstatus;
	}
	public String getPreparersig() {
		return preparesig;
	}
	public void setPreparersig(String preparersig) {
		this.preparesig = preparersig;
	}
	public String getPreparerdate() {
		return preparerdate;
	}
	public void setPreparerdate(String preparerdate) {
		this.preparerdate = preparerdate;
	}
	public String getPreparerlast() {
		return preparerlast;
	}
	public void setPreparerlast(String preparerlast) {
		this.preparerlast = preparerlast;
	}
	public String getPreparerfirst() {
		return preparerfirst;
	}
	public void setPreparerfirst(String preparerfirst) {
		this.preparerfirst = preparerfirst;
	}
	public String getPrepareraddress() {
		return prepareraddress;
	}
	public void setPrepareraddress(String prepareraddress) {
		this.prepareraddress = prepareraddress;
	}
	public String getPreparercity() {
		return preparercity;
	}
	public void setPreparercity(String preparercity) {
		this.preparercity = preparercity;
	}
	public String getPreparerstate() {
		return preparerstate;
	}
	public void setPreparerstate(String preparerstate) {
		this.preparerstate = preparerstate;}

	public String getPreparerzip() {
		return preparerzip;
	}

	public void setPreparerzip(String preparerzip) {
		this.preparerzip = preparerzip;
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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