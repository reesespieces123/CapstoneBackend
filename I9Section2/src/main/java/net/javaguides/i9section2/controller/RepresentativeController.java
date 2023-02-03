package net.javaguides.i9section2.controller;

import net.javaguides.i9section2.exception.ResourceNotFoundException;
import net.javaguides.i9section2.model.Representative;
import net.javaguides.i9section2.repository.RepresentativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/testrep")
public class RepresentativeController {
    @Autowired
    private RepresentativeRepository RepresentativeRepository;


    @GetMapping("/representative")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<Representative> getAllRepresentative() {
        return RepresentativeRepository.findAll();
    }
    // build create representative REST API


    @PostMapping
    public Representative createRepresentative(@RequestBody Representative representative) {
        return RepresentativeRepository.save(representative);
    }
    // build get representative by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Representative> getRepresentativeById(@PathVariable long id) {
        Representative representative = RepresentativeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Representative not exist with id:" + id));
        return ResponseEntity.ok(representative);
    }
    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Representative> updateRepresentative(@PathVariable long id, @RequestBody Representative representativeDetails) {
        Representative updateRepresentative = RepresentativeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
        //Using this area for LIST 1A -- duplicate naming conventions used... Identity and Employment Authorization
        updateRepresentative.setDocumenttitle_a1(representativeDetails.getDocumenttitle_a1());
        updateRepresentative.setIssuingauthority_a1(representativeDetails.getIssuingauthority_a1());
        updateRepresentative.setDocumentnumber_a1(representativeDetails.getDocumentnumber_a1());
        updateRepresentative.setExpirationdate_a1(representativeDetails.getExpirationdate_a1());
        //Using this area for LIST 1B -- duplicate naming conventions used... we need to distinguish between the different documents etc.
        updateRepresentative.setDocumenttitle_a2(representativeDetails.getDocumenttitle_a2());
        updateRepresentative.setIssuingauthority_a2(representativeDetails.getIssuingauthority_a2());
        updateRepresentative.setDocumentnumber_a2(representativeDetails.getDocumentnumber_a2());
        updateRepresentative.setExpirationdate_a2(representativeDetails.getExpirationdate_a2());
        //Using this area for LIST 1C -- duplicate naming conventions used... we need to distinguish between the different documents etc.
        updateRepresentative.setDocumenttitle_a3(representativeDetails.getDocumenttitle_a3());
        updateRepresentative.setIssuingauthority_a3(representativeDetails.getIssuingauthority_a3());
        updateRepresentative.setDocumentnumber_a3(representativeDetails.getDocumentnumber_a3());
        updateRepresentative.setExpirationdate_a3(representativeDetails.getExpirationdate_a3());
        // Using this area for LIST B -- Identity
        updateRepresentative.setDocumenttitle_b(representativeDetails.getDocumenttitle_b());
        updateRepresentative.setIssuingauthority_b(representativeDetails.getIssuingauthority_b());
        updateRepresentative.setDocumentnumber_b(representativeDetails.getDocumentnumber_b());
        updateRepresentative.setExpirationdate_b(representativeDetails.getExpirationdate_b());
        updateRepresentative.setAdditionalinfo_b(representativeDetails.getAdditionalinfo_b());
        // Using this area for LIST C -- Employment Authorization
        updateRepresentative.setDocumenttitle_c(representativeDetails.getDocumenttitle_c());
        updateRepresentative.setIssuingauthority_c(representativeDetails.getIssuingauthority_c());
        updateRepresentative.setDocumentnumber_c(representativeDetails.getDocumentnumber_c());
        updateRepresentative.setExpirationdate_c(representativeDetails.getExpirationdate_c());
        // Using this area for Certification Area
        updateRepresentative.setRepresentativesignature(representativeDetails.getRepresentativesignature());
        updateRepresentative.setRepresentativesigndate(representativeDetails.getRepresentativesigndate());
        updateRepresentative.setRepresentativetitle(representativeDetails.getRepresentativetitle());
        updateRepresentative.setRepresentativefirstname(representativeDetails.getRepresentativefirstname());
        updateRepresentative.setRepresentativelastname(representativeDetails.getRepresentativelastname());
        updateRepresentative.setOrganizationname(representativeDetails.getOrganizationname());
        updateRepresentative.setOrganizationaddress(representativeDetails.getOrganizationaddress());
        updateRepresentative.setOrganizationcity(representativeDetails.getOrganizationcity());
        updateRepresentative.setOrganizationstate(representativeDetails.getOrganizationstate());
        updateRepresentative.setOrganizationzipcode(representativeDetails.getOrganizationzipcode());
        updateRepresentative.setId(representativeDetails.getId());
        RepresentativeRepository.save(updateRepresentative);
        return ResponseEntity.ok(updateRepresentative);
    }
    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteRepresentative(@PathVariable long id) {
        Representative representative = RepresentativeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Representative not exist with id: " + id));
        RepresentativeRepository.delete(representative);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}