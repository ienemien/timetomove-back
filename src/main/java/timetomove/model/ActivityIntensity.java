package timetomove.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACTIVITY_INTENSITY")
public class ActivityIntensity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Enumerated(EnumType.STRING)
	@Column(name = "CODE", nullable = false)
	private IntensityCode code;

	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	public int getId() {
		return id;
	}

	public IntensityCode getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public void setCode(final IntensityCode code) {
		this.code = code;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
}
