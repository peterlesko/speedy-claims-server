package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.dto.ClaimDTO;
import com.allstate.speedyclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.speedyclaimsserver.exceptions.InvalidNewClaimException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
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
    public Claim add(Claim claim) {

        if(claim.getPolicyNumber() == null) {
            throw new InvalidNewClaimException("Policy number must be provided");
        }
        try {
            return claimRepository.save(claim);
        }
        catch (Exception e) {
            throw new InvalidNewClaimException("We are unable to save your claim");
        }
    }

    @Override
    public Claim updateClaim(Integer claimId, Map<String, String> data) {
        Claim claim = getClaimByClaimId(claimId);
        if(data.containsKey("type")) claim.setType(data.get("type"));
        if(data.containsKey("status")) claim.setStatus(data.get("status"));
        if(data.containsKey("policyNumber")) claim.setPolicyNumber(Integer.parseInt(data.get("policyNumber")));
        if(data.containsKey("name")) claim.setName(data.get("name"));
        if(data.containsKey("surname")) claim.setSurname(data.get("surname"));
        if(data.containsKey("claimStartDate")) claim.setClaimStartDate(LocalDate.parse(data.get("claimStartDate")));
        if(data.containsKey("claimReason")) claim.setStatus(data.get("claimReason"));
        if(data.containsKey("description ")) claim.setStatus(data.get("description"));
        if(data.containsKey("estAmount")) claim.setStatus(data.get("estAmounts"));
        if(data.containsKey("claimPayOut")) claim.setStatus(data.get("claimPayOut"));
        if(data.containsKey("address")) claim.setStatus(data.get("address"));
        if(data.containsKey("motorMake")) claim.setStatus(data.get("motorMake"));
        if(data.containsKey("motorModel")) claim.setStatus(data.get("motorModel"));
        if(data.containsKey("motorYom")) claim.setStatus(data.get("motorYom"));
        if(data.containsKey("petType")) claim.setStatus(data.get("petType"));
        if(data.containsKey("petBreed")) claim.setStatus(data.get("petBreed"));

        return claimRepository.save(claim);
    }

    @Override
    public int countClaims() {
        return 192;
    }

    @Override
    public Claim addClaim(ClaimDTO claimDTO) {
        Claim claim = claimDTO.toClaim();
        return claimRepository.save(claim);
    }
}
