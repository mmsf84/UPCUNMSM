package com.upg.upc.unmsm.user.infrastructure.hibernate.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.upg.upc.unmsm.comon.infrastructure.hibernate.repository.BaseHibernateRepository;
import com.upg.upc.unmsm.user.domain.entity.UserClaim;
import com.upg.upc.unmsm.user.domain.repository.UserClaimRepository;

public class UserClaimHibernateRepository extends BaseHibernateRepository<UserClaim> implements UserClaimRepository{
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserClaim> findByUserId(Long userId) throws Exception {
		List<UserClaim> userClaims = null;
		Criteria criteria = getSession().createCriteria(UserClaim.class, "uc");
		criteria.createAlias("uc.user", "u");
		//criteria.setFetchMode("user", FetchMode.SELECT); 
		criteria.add(Restrictions.eq("u.id", userId));
		userClaims = criteria.list();
		return userClaims;
	}

}
