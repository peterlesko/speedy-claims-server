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

            Claim claim1 = new Claim(null, "pet", "rejected", 10, "Lewis", "Barr",
                    LocalDate.now(), "leg injury","fall from height", 250, 260,
                    null, null, null, null, "Dog", "Husky");

            Claim claim2 = new Claim(null, "motor", "new", 30, "Joe", "Owen" ,
                    LocalDate.now(), "cracked windscreen", "car vandalism", 120, null,
                    null, "Tesla", "X", 2020, null, null);

            Claim claim3 = new Claim(null, "property", "awaitingPayment",  20, "Bob", "Lee",
                    LocalDate.now(), "fire", "elect fault", 490, 460,
                    "Lower st 2, Mason", null, null, null, null, null);

            Claim claim4 = new Claim(null, "pet", "new", 11, "Ellis", "Cook",
                    LocalDate.now(), "stomach illness", "N/A", 75, null, null,
                    null, null, null,"Cat", "Coon");

            Claim claim5 = new Claim(null, "motor", "in progress", 31, "Dany", "Cole",
                    LocalDate.now(), "crashed back bumper", "reversed into gate", 375,null, null,
                    "BMW", "M3", 2019,null, null);

            Claim claim6 = new Claim(null, "property", "new",21, "Jack", "Ray",
                    LocalDate.now(), "burst pipe", "frozen pipe", 450, null,
                    "High st 4, Austin", null, null, null, null, null);

            claimRepository.save(claim1);
            claimRepository.save(claim2);
            claimRepository.save(claim3);
            claimRepository.save(claim4);
            claimRepository.save(claim5);
            claimRepository.save(claim6);
        }
    }
}
