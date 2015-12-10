package timetomove.service.activities;

import java.util.List;

import timetomove.model.activities.Activity;

public interface ActivityService {

	List<Activity> findAllActivities();

	Activity findById(int id);

	void createActivity(Activity activity);

	void updateActivity(Activity activity);

	void deleteActivity(Activity activity);

	void deleteById(int id);

}
