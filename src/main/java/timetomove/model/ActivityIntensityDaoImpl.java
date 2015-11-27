package timetomove.model;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("activityIntensityDao")
public class ActivityIntensityDaoImpl extends AbstractDao<Integer, ActivityIntensity> implements ActivityIntensityDao {

	@Override
	public ActivityIntensity findByCode(final IntensityCode code) {
		Criteria criteria = createEntityCriteria();
		return (ActivityIntensity) criteria.add(Restrictions.eq("code", code)).uniqueResult();
	}

	@Override
	public List<ActivityIntensity> findAllIntensities() {
		Criteria criteria = createEntityCriteria();
		return (List<ActivityIntensity>) criteria.list();
	}
}
