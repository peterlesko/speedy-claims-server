package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.domain.Claim;
import java.util.List;

public interface ClaimsService {

    public List<Claim> getAllClaims();
    public List<Claim> getAllClaimsForClaimId(Integer claimId);
    public List<Claim> getAllClaimsForPolicyNumber(Integer policyNumber);
    public List<Claim> getAllClaimsForSurname(String surname);
    public Claim getClaimByClaimId(Integer claimId);


    public int countClaims();
}
