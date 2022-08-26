package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClaimsServiceImpl implements ClaimsService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    @Override
    public int countClaims() {
        return 192;
    }

    @Override
    public List<Claim> getAllTransactionsForClaimId(Integer claimId) {
        return claimRepository.findByClaimId(claimId);
    }

    @Override
    public List<Claim> getAllTransactionsForPolicyNumber(Integer policyNumber) {
        return claimRepository.findByPolicyNumber(policyNumber);
    }

    @Override
    public List<Claim> getAllTransactionsForSurname(String surname) {
        return claimRepository.findBySurname(surname);
    }

}
