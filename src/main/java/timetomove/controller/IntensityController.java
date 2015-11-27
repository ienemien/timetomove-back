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
import timetomove.model.ActivityIntensity;
import timetomove.service.ActivityIntensityService;
import timetomove.service.ActivityService;

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
