package net.javaguides.i9section2.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import javax.persistence.entity;

//import javax.persistence.entity;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "representatives")
public class Representative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //_A1
    @Column(name = "documenttitle_a1")
    private String documenttitle_a1;
    @Column(name = "issuingauthority_a1")
    private String issuingauthority_a1;
    @Column(name = "documentnumber_a1")
    private String documentnumber_a1;
    @Column(name = "expirationdate_a1")
    private String expirationdate_a1;
    // _A2
    @Column(name = "documenttitle_a2")
    private String documenttitle_a2;
    @Column(name = "issuingauthority_a2")
    private String issuingauthority_a2;
    @Column(name = "documentnumber_a2")
    private String documentnumber_a2;
    @Column(name = "expirationdate_a2")
    private String expirationdate_a2;
    @Column(name = "documenttitle_a3")
    private String documenttitle_a3;
    @Column(name = "issuingauthority_a3")
    private String issuingauthority_a3;
    @Column(name = "documentnumber_a3")
    private String documentnumber_a3;
    @Column(name = "expirationdate_a3")
    private String expirationdate_a3;
    // Using this area for LIST B -- Identity
    @Column(name = "documenttitle_b")
    private String documenttitle_b;
    @Column(name = "issuingauthority_b")
    private String issuingauthority_b;
    @Column(name = "documentnumber_b")
    private String documentnumber_b;
    @Column(name = "expirationdate_b")
    private String expirationdate_b;
    @Column(name = "additionalinfo_b")
    private String additionalinfo_b;
    // Using this area for LIST C -- Employment Authorization
    @Column(name = "documenttitle_c")
    private String documenttitle_c;
    @Column(name = "issuingauthority_c")
    private String issuingauthority_c;
    @Column(name = "documentnumber_c")
    private String documentnumber_c;
    @Column(name = "expirationdate_c")
    private String expirationdate_c;
    // Using this area for Certification Area
    @Column(name = "representativesignature")
    private String representativesignature;
    @Column(name = "representativesigndate")
    private String representativesigndate;
    @Column(name = "representativetitle")
    private String representativetitle;
    @Column(name = "representativefirstname")
    private String representativefirstname;
    @Column(name = "representativelastname")
    private String representativelastname;
    @Column(name = "organizationname")
    private String organizationname;
    @Column(name = "organizationaddress")
    private String organizationaddress;
    @Column(name = "organizationcity")
    private String organizationcity;
    @Column(name = "organizationstate")
    private String organizationstate;
    @Column(name = "organizationzipcode")
    private String organizationzipcode;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDocumenttitle_a1() {
        return documenttitle_a1;
    }
    public void setDocumenttitle_a1(String documenttitle_a1) {
        this.documenttitle_a1 = documenttitle_a1;
    }
    public String getIssuingauthority_a1() {
        return issuingauthority_a1;
    }
    public void setIssuingauthority_a1(String issuingauthority_a1) {
        this.issuingauthority_a1 = issuingauthority_a1;
    }
    public String getDocumentnumber_a1() {
        return documentnumber_a1;
    }
    public void setDocumentnumber_a1(String documentnumber_a1) {
        this.documentnumber_a1 = documentnumber_a1;
    }
    public String getExpirationdate_a1() {
        return expirationdate_a1;
    }
    public void setExpirationdate_a1(String expirationdate_a1) {
        this.expirationdate_a1 = expirationdate_a1;
    }
    public String getDocumenttitle_a2() {
        return documenttitle_a2;
    }
    public void setDocumenttitle_a2(String documenttitle_a2) {
        this.documenttitle_a2 = documenttitle_a2;
    }
    public String getIssuingauthority_a2() {
        return issuingauthority_a2;
    }
    public void setIssuingauthority_a2(String issuingauthority_a2) {
        this.issuingauthority_a2 = issuingauthority_a2;
    }
    public String getDocumentnumber_a2() {
        return documentnumber_a2;
    }
    public void setDocumentnumber_a2(String documentnumber_a2) {
        this.documentnumber_a2 = documentnumber_a2;
    }
    public String getExpirationdate_a2() {
        return expirationdate_a2;
    }
    public void setExpirationdate_a2(String expirationDate_a2) {
        this.expirationdate_a2 = expirationdate_a2;
    }
    public String getDocumenttitle_a3() {
        return documenttitle_a3;
    }
    public void setDocumenttitle_a3(String documenttitle_a3) {
        this.documenttitle_a3 = documenttitle_a3;
    }
    public String getIssuingauthority_a3() {
        return issuingauthority_a3;
    }
    public void setIssuingauthority_a3(String issuingauthority_a3) {
        this.issuingauthority_a3 = issuingauthority_a3;
    }
    public String getDocumentnumber_a3() {
        return documentnumber_a3;
    }
    public void setDocumentnumber_a3(String documentnumber_a3) {
        this.documentnumber_a3 = documentnumber_a3;
    }
    public String getExpirationdate_a3() {
        return expirationdate_a3;
    }
    public void setExpirationdate_a3(String expirationdate_a3) {
        this.expirationdate_a3 = expirationdate_a3;
    }
    public String getDocumenttitle_b() {
        return documenttitle_b;
    }
    public void setDocumenttitle_b(String documenttitle_b) {
        this.documenttitle_b = documenttitle_b;
    }
    public String getIssuingauthority_b() {
        return issuingauthority_b;
    }
    public void setIssuingauthority_b(String issuingauthority_b) {
        this.issuingauthority_b = issuingauthority_b;
    }
    public String getDocumentnumber_b() {
        return documentnumber_b;
    }
    public void setDocumentnumber_b(String documentnumber_b) {
        this.documentnumber_b = documentnumber_b;
    }
    public String getExpirationdate_b() {
        return expirationdate_b;
    }
    public void setExpirationdate_b(String expirationdate_b) {
        this.expirationdate_b = expirationdate_b;
    }
    public String getAdditionalinfo_b() {
        return additionalinfo_b;
    }
    public void setAdditionalinfo_b(String additionalinfo_b) {
        this.additionalinfo_b = additionalinfo_b;
    }
    public String getDocumenttitle_c() {
        return documenttitle_c;
    }
    public void setDocumenttitle_c(String documenttitle_c) {
        this.documenttitle_c = documenttitle_c;
    }
    public String getIssuingauthority_c() {
        return issuingauthority_c;
    }
    public void setIssuingauthority_c(String issuingauthority_c) {
        this.issuingauthority_c = issuingauthority_c;
    }
    public String getDocumentnumber_c() {
        return documentnumber_c;
    }
    public void setDocumentnumber_c(String documentnumber_c) {
        this.documentnumber_c = documentnumber_c;
    }
    public String getExpirationdate_c() {
        return expirationdate_c;
    }
    public void setExpirationdate_c(String expirationdate_c) {
        this.expirationdate_c = expirationdate_c;
    }
    public String getRepresentativesignature() {
        return representativesignature;
    }
    public void setRepresentativesignature(String representativesignature) {
        this.representativesignature = representativesignature;
    }
    public String getRepresentativesigndate() {
        return representativesigndate;
    }
    public void setRepresentativesigndate(String representativesigndate) {
        this.representativesigndate = representativesigndate;
    }
    public String getRepresentativetitle() {
        return representativetitle;
    }
    public void setRepresentativetitle(String representativetitle) {
        this.representativetitle = representativetitle;
    }
    public String getRepresentativefirstname() {
        return representativefirstname;
    }
    public void setRepresentativefirstname(String representativefirstname) {
        this.representativefirstname = representativefirstname;
    }
    public String getRepresentativelastname() {
        return representativelastname;
    }
    public void setRepresentativelastname(String representativelastname) {
        this.representativelastname = representativelastname;
    }
    public String getOrganizationname() {
        return organizationname;
    }
    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname;
    }
    public String getOrganizationaddress() {
        return organizationaddress;
    }
    public void setOrganizationaddress(String organizationAddress) {
        this.organizationaddress = organizationaddress;
    }
    public String getOrganizationcity() {
        return organizationcity;
    }
    public void setOrganizationcity(String organizationcity) {
        this.organizationcity = organizationcity;
    }
    public String getOrganizationstate() {
        return organizationstate;
    }
    public void setOrganizationstate(String organizationstate) {
        this.organizationstate = organizationstate;
    }
    public String getOrganizationzipcode() {
        return organizationzipcode;
    }
    public void setOrganizationzipcode(String organizationzipcode) {
        this.organizationzipcode = organizationzipcode;
    }
}