package net.javaguides.i9section2.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/NewEmployee")
    @PreAuthorize("hasRole('ROLE_EMPLOYEE') ")
//    or hasRole('ROLE_MODERATOR') or hasRole('ROLE_ADMIN')
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/reviewer")
    @PreAuthorize("hasRole('ROLE_REVIEWER')")
    public String reviewerAccess() {
        return "Reviewer Board.";
    }

    @GetMapping("/employer")
    @PreAuthorize("hasRole('ROLE_EMPLOYER')")
    public String employerAccess() {
        return "Employer Board.";
    }

    @GetMapping("/auditor")
    @PreAuthorize("hasRole('ROLE_AUDITOR')")
    public String auditorAccess() {
        return "Auditor Board.";
    }

//    @GetMapping("/admin")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    public String adminAccess() {
//        return "Admin Board.";
//    }
}
