package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.domain.Claim;
import java.util.List;

public interface ClaimsService {

    public List<Claim> getAllClaims();
    public List<Claim> getAllTransactionsForClaimId(Integer claimId);
    public List<Claim> getAllTransactionsForPolicyNumber(Integer policyNumber);
    public List<Claim> getAllTransactionsForSurname(String surname);
    public int countClaims();

}
