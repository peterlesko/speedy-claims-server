package com.allstate.speedyclaimsserver.service;
import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class  BootstrapService {

    @Autowired
    ClaimRepository claimRepository;

    @PostConstruct
    public void initializeData() {
        if (claimRepository.findAll().size() == 0) {

            Claim claim1 = new Claim(null, 12, "Barr", "open", "moto", LocalDate.now());
            Claim claim2 = new Claim(null, 34, "Lee", "closed", "property", LocalDate.now());
            Claim claim3 = new Claim(null, 56, "Joe", "new", "moto", LocalDate.now());
            Claim claim4 = new Claim(null, 78, "Ray", "progress", "auto", LocalDate.now());
            Claim claim5 = new Claim(null, 91, "Cook", "new", "pet", LocalDate.now());

            claimRepository.save(claim1);
            claimRepository.save(claim2);
            claimRepository.save(claim3);
            claimRepository.save(claim4);
            claimRepository.save(claim5);
        }
    }
}
