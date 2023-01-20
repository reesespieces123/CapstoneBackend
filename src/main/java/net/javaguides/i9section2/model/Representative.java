package net.javaguides.i9section2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

public class Representative {


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "representative")

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
//_A1
        @Column(name = "DocumentTitle_A1")
        private String DocumentTitle_A1;

        @Column(name = "IssuingAuthority_A1")
        private String IssuingAuthority_A1;

        @Column(name = "DocumentNumber_A1")
        private String DocumentNumber_A1;

        @Column(name = "ExpirationDate_A1")
        private String ExpirationDate_A1;
// _A2
        @Column(name = "DocumentTitle_A2")
        private String DocumentTitle_A2;




        @Column(name = "IssuingAuthority_A2")
        private String IssuingAuthority_A2;

        @Column(name = "DocumentNumber_A2")
        private String DocumentNumber_A2;

        @Column(name = "ExpirationDate_A2")
        private String ExpirationDate_A2;

        @Column(name = "DocumentTitle_A3")
        private String DocumentTitle_A3;

        @Column(name = "IssuingAuthority_A3")
        private String IssuingAuthority_A3;

        @Column(name = "DocumentNumber_A3")
        private String DocumentNumber_A3;

        @Column(name = "ExpirationDate_A3")
        private String ExpirationDate_A3;

// Using this area for LIST B -- Identity
        @Column(name = "DocumentTitle_B")
        private String DocumentTitle_B;

        @Column(name = "IssuingAuthority_B")
        private String IssuingAuthority_B;

        @Column(name = "DocumentNumber_B")
        private String DocumentNumber_B;

        @Column(name = "ExpirationDate_B")
        private String ExpirationDate_B;

        @Column(name = "AdditionalInfo_B")
        private String AdditionalInfo_B;

// Using this area for LIST C -- Employment Authorization
        @Column(name = "setId")
        private String setId;

        @Column(name = "DocumentTitle_C")
        private String DocumentTitle_C;

        @Column(name = "IssuingAuthority_C")
        private String IssuingAuthority_C;

        @Column(name = "DocumentNumber_C")
        private String DocumentNumber_C;

        @Column(name = "ExpirationDate_C")
        private String ExpirationDate_C;

        // Using this area for Certification Area

        @Column(name = "RepresentativeSignature")
        private String RepresentativeSignature;

        @Column(name = "RepresentativeSignDate")
        private String RepresentativeSignDate;

        @Column(name = "PreparerSignatureDate")
        private String PreparerSignatureDate;

        @Column(name = "RepresentativeTitle")
        private String RepresentativeTitle;

        @Column(name = "RepresentativeFirstName")
        private String RepresentativeFirstName;

        @Column(name = "RepresentativeLastName")
        private String RepresentativeLastName;

        @Column(name = "OrganizationName")
        private String OrganizationName;

        @Column(name = "OrganizationAddress")
        private String OrganizationAddress;

        @Column(name = "OrganizationCity")
        private String OrganizationCity;

        @Column(name = "OrganizationState")
        private String OrganizationState;

        @Column(name = "OrganizationZipCode")
        private String OrganizationZipCode;


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