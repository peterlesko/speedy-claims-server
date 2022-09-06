package com.allstate.speedyclaimsserver.service;
import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class  BootstrapService {

    @Autowired
    ClaimRepository claimRepository;

    @PostConstruct
    public void initializeData() {
        if (claimRepository.findAll().size() == 0) {

//            Claim claim1 = new Claim(null, 12, "Barr");
//            Claim claim2 = new Claim(null, 34, "Lee");
//            Claim claim3 = new Claim(null, 56, "Joe");
//            Claim claim4 = new Claim(null, 78, "Ray");

            Claim claim1 = new Claim(null, 12, "Barr", "open", "auto");
            Claim claim2 = new Claim(null, 34, "Lee", "closed", "property");
            Claim claim3 = new Claim(null, 56, "Joe", "", "pet");
            Claim claim4 = new Claim(null, 78, "Ray", "progress", "auto");

            claimRepository.save(claim1);
            claimRepository.save(claim2);
            claimRepository.save(claim3);
            claimRepository.save(claim4);
        }
    }
}
