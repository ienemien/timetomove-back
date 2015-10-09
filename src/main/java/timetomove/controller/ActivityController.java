package timetomove.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import timetomove.model.Activity;
import timetomove.service.ActivityService;

@RestController
@RequestMapping(value = "/api/activity")
public class ActivityController {

	private final ActivityService activityService;

	@Autowired
	public ActivityController(final ActivityService activityService) {
		this.activityService = activityService;
	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Activity> findAllActivities() {
		return activityService.findAllActivities();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Activity getById(@PathVariable final int id) {
		return activityService.findById(id);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public void createActivity(@RequestBody final Activity activity) {
		activityService.createActivity(activity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json")
	public void updateActivity(@RequestBody final Activity activity) {
		activityService.updateActivity(activity);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json")
	public void deleteActivity(@RequestBody final Activity activity) {
		activityService.deleteActivity(activity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteActivityById(@PathVariable final int id) {
		activityService.deleteById(id);
	}
}
