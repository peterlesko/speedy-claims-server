package com.allstate.speedyclaimsserver.unittests;

import com.allstate.speedyclaimsserver.domain.Claim;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DomainClassTests {

    @Test
    public void testEqualityForClaim() {
        Claim claim1 = new Claim();
        Claim claim2 = new Claim();

        claim1.setClaimId(56);
        claim2.setClaimId(56);

        assertEquals(claim1, claim2);
    }
}
