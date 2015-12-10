package timetomove.controller.activities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import timetomove.model.activities.ActivityIntensity;
import timetomove.service.activities.ActivityIntensityService;

@RestController
@RequestMapping(value = "/api/intensity")
public class IntensityController {

    private final ActivityIntensityService intensityService;

    @Autowired
    public IntensityController(final ActivityIntensityService intensityService) {
        this.intensityService = intensityService;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<ActivityIntensity> findAllIntensities() {
        return intensityService.findAllIntensities();
    }

}
