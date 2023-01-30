/*package net.javaguides.i9section2.controller;

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
                .orElseThrow(() -> new ResourceNotFoundException("Representative not exist with id:" + id));
        return ResponseEntity.ok(representative);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Representative> updateRepresentative(@PathVariable long id, @RequestBody Representative representativeDetails) {
        Representative updateRepresentative = representativeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
        //Using this area for LIST 1A -- duplicate naming conventions used... Identity and Employment Authorization

        updateRepresentative.setDocumentTitle_A1(representativeDetails.getDocumentTitle_A1());
        updateRepresentative.setIssuingAuthority_A1(representativeDetails.getIssuingAuthority_A1());
        updateRepresentative.setDocumentNumber_A1(representativeDetails.getDocumentNumber_A1());
        updateRepresentative.setExpirationDate_A1(representativeDetails.getExpirationDate_A1());

        //Using this area for LIST 1B -- duplicate naming conventions used... we need to distinguish between the different documents etc.
        updateRepresentative.setDocumentTitle_A2(representativeDetails.getDocumentTitle_A2());
        updateRepresentative.setIssuingAuthority_A2(representativeDetails.getIssuingAuthority_A2());
        updateRepresentative.setDocumentNumber_A2(representativeDetails.getDocumentNumber_A2());
        updateRepresentative.setExpirationDate_A2(representativeDetails.getExpirationDate_A2());

        //Using this area for LIST 1C -- duplicate naming conventions used... we need to distinguish between the different documents etc.
        updateRepresentative.setDocumentTitle_A3(representativeDetails.getDocumentTitle_A3());
        updateRepresentative.setIssuingAuthority_A3(representativeDetails.getIssuingAuthority_A3());
        updateRepresentative.setDocumentNumber_A3(representativeDetails.getDocumentNumber_A3());
        updateRepresentative.setExpirationDate_A3(representativeDetails.getExpirationDate_A3());

        // Using this area for LIST B -- Identity
        updateRepresentative.setDocumentTitle_B(representativeDetails.getDocumentTitle_B());
        updateRepresentative.setIssuingAuthority_B(representativeDetails.getIssuingAuthority_B());
        updateRepresentative.setDocumentNumber_B(representativeDetails.getDocumentNumber_B());
        updateRepresentative.setExpirationDate_B(representativeDetails.getExpirationDate_B());
        updateRepresentative.setAdditionalInfo_B(representativeDetails.getAdditionalInfo_B());

        // Using this area for LIST C -- Employment Authorization
        updateRepresentative.setDocumentTitle_C(representativeDetails.getDocumentTitle_C());
        updateRepresentative.setIssuingAuthority_C(representativeDetails.getIssuingAuthority_C());
        updateRepresentative.setDocumentNumber_C(representativeDetails.getDocumentNumber_C());
        updateRepresentative.setExpirationDate_C(representativeDetails.getExpirationDate_C());

        // Using this area for Certification Area
        updateRepresentative.setRepresentativeSignature(representativeDetails.getRepresentativeSignature());
        updateRepresentative.setRepresentativeSignDate(representativeDetails.getRepresentativeSignDate());
        updateRepresentative.setRepresentativeTitle(representativeDetails.getRepresentativeTitle());
        updateRepresentative.setRepresentativeFirstName(representativeDetails.getRepresentativeFirstName());
        updateRepresentative.setRepresentativeLastName(representativeDetails.getRepresentativeLastName());
        updateRepresentative.setOrganizationName(representativeDetails.getOrganizationName());
        updateRepresentative.setOrganizationAddress(representativeDetails.getOrganizationAddress());
        updateRepresentative.setOrganizationCity(representativeDetails.getOrganizationCity());
        updateRepresentative.setOrganizationState(representativeDetails.getOrganizationState());
        updateRepresentative.setOrganizationZipCode(representativeDetails.getOrganizationZipCode());
        updateRepresentative.setId(representativeDetails.getId());


        representativeRepository.save(updateRepresentative);

        return ResponseEntity.ok(updateRepresentative);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteRepresentative(@PathVariable long id) {

        Representative representative = representativeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Representative not exist with id: " + id));

        representativeRepository.delete(representative);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}*/