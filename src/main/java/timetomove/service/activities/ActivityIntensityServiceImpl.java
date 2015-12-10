package timetomove.service.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import timetomove.model.activities.ActivityIntensity;
import timetomove.model.activities.ActivityIntensityDao;

import java.util.List;

@Service("activityIntensityService")
@Transactional
public class ActivityIntensityServiceImpl implements ActivityIntensityService {

    private final ActivityIntensityDao activityIntensityDao;

    @Autowired
    public ActivityIntensityServiceImpl(ActivityIntensityDao activityIntensityDao) {
        this.activityIntensityDao = activityIntensityDao;
    }

    @Override
    public List<ActivityIntensity> findAllIntensities() {
        return activityIntensityDao.findAllIntensities();
    }
}
