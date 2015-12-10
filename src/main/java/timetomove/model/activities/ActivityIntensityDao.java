package timetomove.model.activities;

import java.util.List;

public interface ActivityIntensityDao {

    /**
     * Find an {@link ActivityIntensity} by its {@link IntensityCode}
     *
     * @param code The {@link IntensityCode}
     * @returns the ActivityIntensity belonging to this code
     */
    ActivityIntensity findByCode(IntensityCode code);

    List<ActivityIntensity> findAllIntensities();
}
