package timetomove.model;

import java.util.List;

/**
 * Dao for getting, creating, updating and deleting {@link Activity} objects
 */
public interface ActivityDao {

	List<Activity> findAllActivities();

	Activity findById(int id);

	void createActivity(Activity activity);

	void deleteActivity(Activity activity);

	void deleteById(int id);

}
