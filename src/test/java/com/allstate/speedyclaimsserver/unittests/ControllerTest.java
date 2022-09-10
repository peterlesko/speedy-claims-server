package com.allstate.speedyclaimsserver.unittests;

import com.allstate.speedyclaimsserver.control.ClaimsController;
import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.service.BootstrapService;
import com.allstate.speedyclaimsserver.service.ClaimsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class ControllerTest {

    @Autowired
    ClaimsController claimsController;

    @MockBean
    ClaimsService claimsService;

    @MockBean
    BootstrapService bootstrapService;

    @BeforeEach
    public void runFirst() {
        Mockito.when(claimsService.countClaims())
                .thenReturn(6);
        Mockito.when(claimsService.getClaimByClaimId(1))
                .thenReturn(new Claim());
    }

    @Test
    public void checkThatNumberOfClaimsIsAMapWithAKeyOfVolume() {
        Map<String,String> result = claimsController.getNumberOfClaims();
        assertEquals("6", result.get("volume"));
    }

}
