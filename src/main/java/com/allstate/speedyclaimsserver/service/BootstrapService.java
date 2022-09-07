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

            Claim claim1 = new Claim(null, "pet", "open", 12, "Barr", LocalDate.now(),
                    "leg injury","fall from height", 250);

            Claim claim2 = new Claim(null, "property", "closed",  34, "Lee", LocalDate.now(), "fire", "elect fault", 25000);

            Claim claim3 = new Claim(null, "motor", "new", 56, "Joe", LocalDate.now(),
                    "cracked windscreen", "car vandalism", 120);

            Claim claim4 = new Claim(null, "property", "in progress",78, "Ray", LocalDate.now(),
                    "burst pipe", "frozen pipe", 800);

            Claim claim5 = new Claim(null, "pet", "new", 91, "Cook",  LocalDate.now(),
                    "stomach illness", "unknown", 75 );

            claimRepository.save(claim1);
            claimRepository.save(claim2);
            claimRepository.save(claim3);
            claimRepository.save(claim4);
            claimRepository.save(claim5);
        }
    }
}
