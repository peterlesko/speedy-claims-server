package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.dto.ClaimDTO;

import java.util.List;
import java.util.Map;

public interface ClaimsService {

    public List<Claim> getAllClaims();
    public List<Claim> getAllClaimsForClaimId(Integer claimId);
    public List<Claim> getAllClaimsForPolicyNumber(Integer policyNumber);
    public List<Claim> getAllClaimsForSurname(String surname);
    public Claim getClaimByClaimId(Integer claimId);
    public Claim add(Claim claim);
    public Claim updateClaim(Integer claimId, Map<String, String> data);
    public int countClaims();
    public Claim addClaim(ClaimDTO newClaim);
}
