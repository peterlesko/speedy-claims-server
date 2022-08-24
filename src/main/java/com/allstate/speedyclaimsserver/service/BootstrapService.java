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

                Claim claim1 = new Claim(null, 1234, "Barr");
                Claim claim2 = new Claim(null, 5678, "Joe");

                claimRepository.save(claim1);
                claimRepository.save(claim2);
            }
        }
}
