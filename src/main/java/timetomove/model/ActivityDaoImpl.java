package timetomove.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository("activityDao")
public class ActivityDaoImpl extends AbstractDao<Integer, Activity> implements ActivityDao {

	@SuppressWarnings("unchecked")
	public List<Activity> findAllActivities() {
		Criteria criteria = createEntityCriteria();
		return (List<Activity>) criteria.list();
	}

	public Activity findById(final int id) {
		return getByKey(id);
	}

	public void createActivity(final Activity activity) {
		persist(activity);
	}

	public void deleteActivity(final Activity activity) {
		delete(activity);
	}

	public void deleteById(final int id) {
		Query query = getSession().createSQLQuery("delete from Activity where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}
}
