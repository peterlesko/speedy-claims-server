package com.allstate.speedyclaimsserver.control;

import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimsController {

    @Autowired
    private ClaimsService claimsService;

    // DI
//    public ClaimsController(ClaimsService claimsService) {
//        this.claimsService = claimsService;
//    }

    @GetMapping()
    public List<Claim> getAllClaims() {
//        List<Claim> claimList = new ArrayList<>();
//
//        Claim claim1 = new Claim(1, "motor", 3281, "Smith");
//        claimList.add(claim1);
//        Claim claim2 = new Claim(2, "property", 4761, "Thomas");
//        claimList.add(claim1);
//
//        return claimList
        return  claimsService.getAllClaims();
    }

    @GetMapping("/volume")
    public Map<String, String> getNumberOfClaims() {
        Integer volume = claimsService.countClaims();
        Map<String, String> results = new HashMap<>();
        results.put("volume", volume.toString());
        return results;
    }
}
