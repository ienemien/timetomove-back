package timetomove.model;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name = "ACTIVITY")
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "START", nullable = false)
	private DateTime start;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "END", nullable = true)
	private DateTime end;

	@ManyToOne(optional = false)
	@JoinColumn(name = "INTENSITY_CODE", referencedColumnName = "CODE")
	private ActivityIntensity intensity;

	@Column(name = "TYPE")
	private String type;

	public int getId() {
		return id;
	}

	public DateTime getStart() {
		return start;
	}

	public DateTime getEnd() {
		return end;
	}

	public ActivityIntensity getIntensity() {
		return intensity;
	}

	public String getType() {
		return type;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public void setStart(final DateTime start) {
		this.start = start;
	}

	public void setEnd(final DateTime end) {
		this.end = end;
	}

	public void setIntensity(final ActivityIntensity intensity) {
		this.intensity = intensity;
	}

	public void setType(final String type) {
		this.type = type;
	}
}
