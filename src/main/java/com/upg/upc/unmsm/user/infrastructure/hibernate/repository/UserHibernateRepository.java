package com.upg.upc.unmsm.user.infrastructure.hibernate.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.stereotype.Repository;

import com.upg.upc.unmsm.comon.infrastructure.hibernate.repository.BaseHibernateRepository;
import com.upg.upc.unmsm.user.domain.entity.User;
import com.upg.upc.unmsm.user.domain.repository.UserRepository;

@Transactional
@Repository
public class UserHibernateRepository extends BaseHibernateRepository<User>
implements UserRepository
{

	@Override
	public User getById(long userId) {
		User user = null;
		Criteria criteria = getSession().createCriteria(User.class, "u");
		criteria.createAlias("u.claims", "c", JoinType.LEFT_OUTER_JOIN);
		criteria.add(Restrictions.eq("u.id", userId));
		user = (User) criteria.uniqueResult();
		return user;
	}

	@Override
	public User getByName(String name) {
		User user = null;
		Criteria criteria = getSession().createCriteria(User.class, "u");
		criteria.createAlias("u.claims", "c");
		criteria.add(Restrictions.eq("u.name", name));
		user = (User) criteria.uniqueResult();
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getPaginated(int page, int pageSize) {
		List<User> users = null;
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.setFirstResult(page);
		criteria.setMaxResults(pageSize);
		users = criteria.list();
		return users;
	}
	public User save(User user) {
		return super.save(user);
	}
}
