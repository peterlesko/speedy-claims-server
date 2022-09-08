package com.allstate.speedyclaimsserver.unittests;

import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.service.ClaimsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class ServiceTests {

    @Autowired
    ClaimsService claimsService;

    @MockBean
    ClaimRepository claimRepository;

    @Test
    public void testNumberOfTransaction() {
        List<Claim> claims = new ArrayList<>();
        claims.add(new Claim(null, "pet", "new", 11, "Ellis", "Cook",
                LocalDate.now(), "stomach illness", "N/A", 75, null, null,
                null, null, null,"Cat", "Coon"));

        claims.add(new Claim(null, "motor", "in progress", 31, "Dany", "Cole",
            LocalDate.now(), "crashed back bumper", "reversed into gate", 600,null, null,
            "BMW", "M3", 2019,null, null));

        Mockito.when(claimRepository.findAll()).thenReturn(claims);

        int result = claimsService.countClaims();
        assertEquals(2, result);

    }
}
