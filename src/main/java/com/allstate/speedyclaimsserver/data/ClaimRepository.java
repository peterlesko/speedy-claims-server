package com.allstate.speedyclaimsserver.data;

import com.allstate.speedyclaimsserver.domain.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

//    public List<Claim> findAllByclaimId(Integer claimId);
//    public List<Claim> findAllById(Integer id);
    public List<Claim> findByClaimId(Integer claimId);
    public List<Claim> findByPolicyNumber(Integer policyNumber);
    public List<Claim> findBySurname(String surname);

}
