package net.javaguides.i9section2.controller;

import net.javaguides.i9section2.exception.ResourceNotFoundException;
import net.javaguides.i9section2.model.Representative;
import net.javaguides.i9section2.repository.RepresentativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/representative")
public class RepresentativeController {

    @Autowired
    private RepresentativeRepository representativeRepository;

    @GetMapping
    public List<Representative> getAllRepresentative() {
        return representativeRepository.findAll();
    }

    // build create representative REST API
    @PostMapping
    public Representative createRepresentative(@RequestBody Representative representative) {
        return representativeRepository.save(representative);
    }

    // build get representative by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Representative> getRepresentativeById(@PathVariable long id) {
        Representative representative = representativeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Representative does not exist with id:" + id));
        return ResponseEntity.ok(representative);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Representative> updateRepresentative(@PathVariable long id, @RequestBody Representative representativeDetails) {
        Representative updateRepresentative = representativeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id: " + id));
        //Using this area for LIST 1A -- duplicate naming conventions used... Identity and Employment Authorization

        updateRepresentative.setDocumentTitle_A1(representativeDetails.getDocumentTitle_A1()!= null ? representativeDetails.getDocumentTitle_A1() : updateRepresentative.getDocumentTitle_A1());
        updateRepresentative.setIssuingAuthority_A1(representativeDetails.getIssuingAuthority_A1()!= null ? representativeDetails.getIssuingAuthority_A1() : updateRepresentative.getIssuingAuthority_A1());
        updateRepresentative.setDocumentNumber_A1(representativeDetails.getDocumentNumber_A1()!= null ? representativeDetails.getDocumentNumber_A1() : updateRepresentative.getDocumentNumber_A1());
        updateRepresentative.setExpirationDate_A1(representativeDetails.getExpirationDate_A1()!= null ? representativeDetails.getExpirationDate_A1() : updateRepresentative.getExpirationDate_A1());

        //Using this area for LIST 1B -- duplicate naming conventions used... we need to distinguish between the different documents etc.
        updateRepresentative.setDocumentTitle_A2(representativeDetails.getDocumentTitle_A2()!= null ? representativeDetails.getDocumentTitle_A2() : updateRepresentative.getDocumentTitle_A2());
        updateRepresentative.setIssuingAuthority_A2(representativeDetails.getIssuingAuthority_A2()!= null ? representativeDetails.getIssuingAuthority_A2() : updateRepresentative.getIssuingAuthority_A2());
        updateRepresentative.setDocumentNumber_A2(representativeDetails.getDocumentNumber_A2()!= null ? representativeDetails.getDocumentNumber_A2() : updateRepresentative.getDocumentNumber_A2());
        updateRepresentative.setExpirationDate_A2(representativeDetails.getExpirationDate_A2()!= null ? representativeDetails.getExpirationDate_A2() : updateRepresentative.getExpirationDate_A2());

        //Using this area for LIST 1C -- duplicate naming conventions used... we need to distinguish between the different documents etc.
        updateRepresentative.setDocumentTitle_A3(representativeDetails.getDocumentTitle_A3()!= null ? representativeDetails.getDocumentTitle_A3() : updateRepresentative.getDocumentTitle_A3());
        updateRepresentative.setIssuingAuthority_A3(representativeDetails.getIssuingAuthority_A3()!= null ? representativeDetails.getIssuingAuthority_A3() : updateRepresentative.getIssuingAuthority_A3());
        updateRepresentative.setDocumentNumber_A3(representativeDetails.getDocumentNumber_A3()!= null ? representativeDetails.getDocumentNumber_A3() : updateRepresentative.getDocumentNumber_A3());
        updateRepresentative.setExpirationDate_A3(representativeDetails.getExpirationDate_A3()!= null ? representativeDetails.getExpirationDate_A3() : updateRepresentative.getExpirationDate_A3());

        // Using this area for LIST B -- Identity
        updateRepresentative.setDocumentTitle_B(representativeDetails.getDocumentTitle_B()!= null ? representativeDetails.getDocumentTitle_B() : updateRepresentative.getDocumentTitle_B());
        updateRepresentative.setIssuingAuthority_B(representativeDetails.getIssuingAuthority_B()!= null ? representativeDetails.getIssuingAuthority_B() : updateRepresentative.getIssuingAuthority_B());
        updateRepresentative.setDocumentNumber_B(representativeDetails.getDocumentNumber_B()!= null ? representativeDetails.getDocumentNumber_B() : updateRepresentative.getDocumentNumber_B());
        updateRepresentative.setExpirationDate_B(representativeDetails.getExpirationDate_B()!= null ? representativeDetails.getExpirationDate_B() : updateRepresentative.getExpirationDate_B());
        updateRepresentative.setAdditionalInfo_B(representativeDetails.getAdditionalInfo_B()!= null ? representativeDetails.getAdditionalInfo_B() : updateRepresentative.getAdditionalInfo_B());

        // Using this area for LIST C -- Employment Authorization
        updateRepresentative.setDocumentTitle_C(representativeDetails.getDocumentTitle_C()!= null ? representativeDetails.getDocumentTitle_C() : updateRepresentative.getDocumentTitle_C());
        updateRepresentative.setIssuingAuthority_C(representativeDetails.getIssuingAuthority_C()!= null ? representativeDetails.getIssuingAuthority_C() : updateRepresentative.getIssuingAuthority_C());
        updateRepresentative.setDocumentNumber_C(representativeDetails.getDocumentNumber_C()!= null ? representativeDetails.getDocumentNumber_C() : updateRepresentative.getDocumentNumber_C());
        updateRepresentative.setExpirationDate_C(representativeDetails.getExpirationDate_C()!= null ? representativeDetails.getExpirationDate_C() : updateRepresentative.getExpirationDate_C());

        // Using this area for Certification Area
        updateRepresentative.setRepresentativeSignature(representativeDetails.getRepresentativeSignature()!= null ? representativeDetails.getRepresentativeSignature() : updateRepresentative.getRepresentativeSignature());
        updateRepresentative.setRepresentativeSignDate(representativeDetails.getRepresentativeSignDate()!= null ? representativeDetails.getRepresentativeSignDate() : updateRepresentative.getRepresentativeSignDate());
        updateRepresentative.setRepresentativeTitle(representativeDetails.getRepresentativeTitle()!= null ? representativeDetails.getRepresentativeTitle() : updateRepresentative.getRepresentativeTitle());
        updateRepresentative.setRepresentativeFirstName(representativeDetails.getRepresentativeFirstName()!= null ? representativeDetails.getRepresentativeFirstName() : updateRepresentative.getRepresentativeFirstName());
        updateRepresentative.setRepresentativeLastName(representativeDetails.getRepresentativeLastName()!= null ? representativeDetails.getRepresentativeLastName() : updateRepresentative.getRepresentativeLastName());
        updateRepresentative.setOrganizationName(representativeDetails.getOrganizationName()!= null ? representativeDetails.getOrganizationName() : updateRepresentative.getOrganizationName());
        updateRepresentative.setOrganizationAddress(representativeDetails.getOrganizationAddress()!= null ? representativeDetails.getOrganizationAddress() : updateRepresentative.getOrganizationAddress());
        updateRepresentative.setOrganizationCity(representativeDetails.getOrganizationCity()!= null ? representativeDetails.getOrganizationCity() : updateRepresentative.getOrganizationCity());
        updateRepresentative.setOrganizationState(representativeDetails.getOrganizationState()!= null ? representativeDetails.getOrganizationState() : updateRepresentative.getOrganizationState());
        updateRepresentative.setOrganizationZipCode(representativeDetails.getOrganizationZipCode()!= null ? representativeDetails.getOrganizationZipCode() : updateRepresentative.getOrganizationZipCode());
        updateRepresentative.setId(representativeDetails.getId());
        if(representativeDetails.getId() != 0) updateRepresentative.setId(representativeDetails.getId());

        representativeRepository.save(updateRepresentative);

        return ResponseEntity.ok(updateRepresentative);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteRepresentative(@PathVariable long id) {

        Representative representative = representativeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Representative does not exist with id: " + id));

        representativeRepository.delete(representative);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}