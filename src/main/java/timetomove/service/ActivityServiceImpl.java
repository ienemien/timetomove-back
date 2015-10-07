package timetomove.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import timetomove.model.Activity;
import timetomove.model.ActivityDao;

@Service("activityService")
@Transactional
public class ActivityServiceImpl implements ActivityService {

	private final ActivityDao activityDao;

	@Autowired
	public ActivityServiceImpl(final ActivityDao activityDao) {
		this.activityDao = activityDao;
	}

	public List<Activity> findAllActivities() {
		return activityDao.findAllActivities();
	}

	public Activity findById(final int id) {
		return activityDao.findById(id);
	}

	public void createActivity(final Activity activity) {
		activityDao.createActivity(activity);
	}

	public void updateActivity(final Activity activity) {
		Activity entity = activityDao.findById(activity.getId());
		if(entity!=null){
			entity.setStart(activity.getStart());
			entity.setEnd(activity.getEnd());
			entity.setIntensity(activity.getIntensity());
			entity.setType(activity.getType());
		}
	}

	public void deleteActivity(final Activity activity) {
		activityDao.deleteActivity(activity);
	}

	public void deleteById(final int id) {
		activityDao.deleteById(id);
	}
}
