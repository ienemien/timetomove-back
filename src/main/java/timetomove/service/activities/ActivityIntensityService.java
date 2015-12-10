package timetomove.service.activities;

import timetomove.model.activities.ActivityIntensity;

import java.util.List;

public interface ActivityIntensityService {
    List<ActivityIntensity> findAllIntensities();
}
