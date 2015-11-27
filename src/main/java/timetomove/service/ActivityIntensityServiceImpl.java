package timetomove.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import timetomove.model.ActivityIntensity;
import timetomove.model.ActivityIntensityDao;

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
