package com.allstate.speedyclaimsserver.control;

import com.allstate.speedyclaimsserver.domain.Claim;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ClaimsController {

    @GetMapping("/api/claim")
    public List<Claim> getAllClaims() {

        List<Claim> claimList = new ArrayList<>();

        Claim claim1 = new Claim(1, "motor", 3281, "Smith");
        claimList.add(claim1);
        Claim claim2 = new Claim(2, "property", 4761, "Thomas");
        claimList.add(claim1);

        return claimList;

    }
}
