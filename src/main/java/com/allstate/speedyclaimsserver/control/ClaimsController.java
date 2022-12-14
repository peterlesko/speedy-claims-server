package com.allstate.speedyclaimsserver.control;

import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.dto.ClaimDTO;
import com.allstate.speedyclaimsserver.service.ClaimsService;
import com.allstate.speedyclaimsserver.service.ClaimsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimsController {

    @Autowired
    private ClaimsService claimsService;

    @GetMapping()
    public List<Claim> getAllClaims(@RequestParam(value="claimId", required=false) Integer claimId,
                                    @RequestParam(value="policyNumber", required=false) Integer policyNumber,
                                    @RequestParam(value="surname", required=false) String surname) {

        if (claimId != null) {
            return claimsService.getAllClaimsForClaimId(claimId);
       }
        else if (policyNumber != null) {
            return claimsService.getAllClaimsForPolicyNumber(policyNumber);
       }
        else if (surname != null){
            return claimsService.getAllClaimsForSurname(surname);
       }
       else {
           return claimsService.getAllClaims();
       }
    }

    @GetMapping(value = "/{claimId}", produces={MediaType.APPLICATION_JSON_VALUE})
    public Claim getClaimById(@PathVariable("claimId") Integer claimId) {
        System.out.println("Looking for claim " + claimId);
        return claimsService.getClaimByClaimId(claimId);
    }

    @PutMapping("/{claimId}")
    public Claim updateClaim(@PathVariable("claimId") Integer claimId,
                             @RequestBody Map<String, String> data) {
        System.out.print("<<<<<<<<   Put request executed");
        return claimsService.updateClaim(claimId, data);
    }

    @GetMapping("/volume")
    public Map<String, String> getNumberOfClaims() {
        Integer volume = claimsService.countClaims();
        Map<String, String> results = new HashMap<>();
        results.put("volume", volume.toString());
        return results;
    }

    @PostMapping
    public Claim newClaim(@RequestBody ClaimDTO claimDTO) {
        System.out.print("Post request executed");
        return claimsService.addClaim(claimDTO);
    }

}
