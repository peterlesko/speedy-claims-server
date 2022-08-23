package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.domain.Claim;

import java.util.List;

public interface ClaimsService {

    public List<Claim> getAllClaims();
    public int countClaims();

}
