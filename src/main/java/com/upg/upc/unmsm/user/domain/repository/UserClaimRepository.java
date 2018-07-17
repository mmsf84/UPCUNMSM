package com.upg.upc.unmsm.user.domain.repository;

import java.util.List;

import com.upg.upc.unmsm.user.domain.entity.UserClaim;
 
public interface UserClaimRepository {
	public List<UserClaim> findByUserId(Long userId) throws Exception;
}
