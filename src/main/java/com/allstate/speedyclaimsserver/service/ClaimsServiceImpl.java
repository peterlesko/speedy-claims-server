package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClaimsServiceImpl implements ClaimsService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    @Override
    public List<Claim> getAllClaimsForClaimId(Integer claimId) {
        return claimRepository.findByClaimId(claimId);
    }

    @Override
    public List<Claim> getAllClaimsForPolicyNumber(Integer policyNumber) {
        return claimRepository.findByPolicyNumber(policyNumber);
    }

    @Override
    public List<Claim> getAllClaimsForSurname(String surname) {
        return claimRepository.findBySurname(surname);
    }

    @Override
    public Claim getClaimByClaimId(Integer claimId) {
        Optional<Claim> optionalClaim = claimRepository.findById(claimId);
        if (optionalClaim.isPresent()) {
            return optionalClaim.get();
        }
        throw new ClaimNotFoundException("There is no claim with a claimId of " + claimId);
    }


    @Override
    public int countClaims() {
        return 192;
    }

}
