package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClaimsServiceImpl implements ClaimsService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<Claim> getAllClaims() {
//        List<Claim> claimList = new ArrayList<>();
//
//        Claim claim1 = new Claim(1, "motor", 3281, "Smith");
//        claimList.add(claim1);
//        Claim claim2 = new Claim(2, "property", 4761, "Thomas");
//        claimList.add(claim1);
//        return claimList;

        return claimRepository.findAll();
    }

    @Override
    public int countClaims() {
        return 192;
    }

}
