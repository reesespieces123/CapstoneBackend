/*package net.javaguides.i9section2.model;

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
    @Table(name = "representative")

    public class Representative {

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

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getDocumentTitle_A1() {
            return DocumentTitle_A1;
        }

        public void setDocumentTitle_A1(String documentTitle_A1) {
            DocumentTitle_A1 = documentTitle_A1;
        }

        public String getIssuingAuthority_A1() {
            return IssuingAuthority_A1;
        }

        public void setIssuingAuthority_A1(String issuingAuthority_A1) {
            IssuingAuthority_A1 = issuingAuthority_A1;
        }

        public String getDocumentNumber_A1() {
            return DocumentNumber_A1;
        }

        public void setDocumentNumber_A1(String documentNumber_A1) {
            DocumentNumber_A1 = documentNumber_A1;
        }

        public String getExpirationDate_A1() {
            return ExpirationDate_A1;
        }

        public void setExpirationDate_A1(String expirationDate_A1) {
            ExpirationDate_A1 = expirationDate_A1;
        }

        public String getDocumentTitle_A2() {
            return DocumentTitle_A2;
        }

        public void setDocumentTitle_A2(String documentTitle_A2) {
            DocumentTitle_A2 = documentTitle_A2;
        }

        public String getIssuingAuthority_A2() {
            return IssuingAuthority_A2;
        }

        public void setIssuingAuthority_A2(String issuingAuthority_A2) {
            IssuingAuthority_A2 = issuingAuthority_A2;
        }

        public String getDocumentNumber_A2() {
            return DocumentNumber_A2;
        }

        public void setDocumentNumber_A2(String documentNumber_A2) {
            DocumentNumber_A2 = documentNumber_A2;
        }

        public String getExpirationDate_A2() {
            return ExpirationDate_A2;
        }

        public void setExpirationDate_A2(String expirationDate_A2) {
            ExpirationDate_A2 = expirationDate_A2;
        }

        public String getDocumentTitle_A3() {
            return DocumentTitle_A3;
        }

        public void setDocumentTitle_A3(String documentTitle_A3) {
            DocumentTitle_A3 = documentTitle_A3;
        }

        public String getIssuingAuthority_A3() {
            return IssuingAuthority_A3;
        }

        public void setIssuingAuthority_A3(String issuingAuthority_A3) {
            IssuingAuthority_A3 = issuingAuthority_A3;
        }

        public String getDocumentNumber_A3() {
            return DocumentNumber_A3;
        }

        public void setDocumentNumber_A3(String documentNumber_A3) {
            DocumentNumber_A3 = documentNumber_A3;
        }

        public String getExpirationDate_A3() {
            return ExpirationDate_A3;
        }

        public void setExpirationDate_A3(String expirationDate_A3) {
            ExpirationDate_A3 = expirationDate_A3;
        }

        public String getDocumentTitle_B() {
            return DocumentTitle_B;
        }

        public void setDocumentTitle_B(String documentTitle_B) {
            DocumentTitle_B = documentTitle_B;
        }

        public String getIssuingAuthority_B() {
            return IssuingAuthority_B;
        }

        public void setIssuingAuthority_B(String issuingAuthority_B) {
            IssuingAuthority_B = issuingAuthority_B;
        }

        public String getDocumentNumber_B() {
            return DocumentNumber_B;
        }

        public void setDocumentNumber_B(String documentNumber_B) {
            DocumentNumber_B = documentNumber_B;
        }

        public String getExpirationDate_B() {
            return ExpirationDate_B;
        }

        public void setExpirationDate_B(String expirationDate_B) {
            ExpirationDate_B = expirationDate_B;
        }

        public String getAdditionalInfo_B() {
            return AdditionalInfo_B;
        }

        public void setAdditionalInfo_B(String additionalInfo_B) {
            AdditionalInfo_B = additionalInfo_B;
        }

        public String getSetId() {
            return setId;
        }

        public void setSetId(String setId) {
            this.setId = setId;
        }

        public String getDocumentTitle_C() {
            return DocumentTitle_C;
        }

        public void setDocumentTitle_C(String documentTitle_C) {
            DocumentTitle_C = documentTitle_C;
        }

        public String getIssuingAuthority_C() {
            return IssuingAuthority_C;
        }

        public void setIssuingAuthority_C(String issuingAuthority_C) {
            IssuingAuthority_C = issuingAuthority_C;
        }

        public String getDocumentNumber_C() {
            return DocumentNumber_C;
        }

        public void setDocumentNumber_C(String documentNumber_C) {
            DocumentNumber_C = documentNumber_C;
        }

        public String getExpirationDate_C() {
            return ExpirationDate_C;
        }

        public void setExpirationDate_C(String expirationDate_C) {
            ExpirationDate_C = expirationDate_C;
        }

        public String getRepresentativeSignature() {
            return RepresentativeSignature;
        }

        public void setRepresentativeSignature(String representativeSignature) {
            RepresentativeSignature = representativeSignature;
        }

        public String getRepresentativeSignDate() {
            return RepresentativeSignDate;
        }

        public void setRepresentativeSignDate(String representativeSignDate) {
            RepresentativeSignDate = representativeSignDate;
        }

        public String getPreparerSignatureDate() {
            return PreparerSignatureDate;
        }

        public void setPreparerSignatureDate(String preparerSignatureDate) {
            PreparerSignatureDate = preparerSignatureDate;
        }

        public String getRepresentativeTitle() {
            return RepresentativeTitle;
        }

        public void setRepresentativeTitle(String representativeTitle) {
            RepresentativeTitle = representativeTitle;
        }

        public String getRepresentativeFirstName() {
            return RepresentativeFirstName;
        }

        public void setRepresentativeFirstName(String representativeFirstName) {
            RepresentativeFirstName = representativeFirstName;
        }

        public String getRepresentativeLastName() {
            return RepresentativeLastName;
        }

        public void setRepresentativeLastName(String representativeLastName) {
            RepresentativeLastName = representativeLastName;
        }

        public String getOrganizationName() {
            return OrganizationName;
        }

        public void setOrganizationName(String organizationName) {
            OrganizationName = organizationName;
        }

        public String getOrganizationAddress() {
            return OrganizationAddress;
        }

        public void setOrganizationAddress(String organizationAddress) {
            OrganizationAddress = organizationAddress;
        }

        public String getOrganizationCity() {
            return OrganizationCity;
        }

        public void setOrganizationCity(String organizationCity) {
            OrganizationCity = organizationCity;
        }

        public String getOrganizationState() {
            return OrganizationState;
        }

        public void setOrganizationState(String organizationState) {
            OrganizationState = organizationState;
        }

        public String getOrganizationZipCode() {
            return OrganizationZipCode;
        }

        public void setOrganizationZipCode(String organizationZipCode) {
            OrganizationZipCode = organizationZipCode;
        }
    }
*/


