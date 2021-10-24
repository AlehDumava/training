package beans;

public class Grades {

	public Integer id;
	public float subject_first;
	public float subject_second;
	public float subject_third;
	public float sertificate_score;
	public float id_users;
	
	public Grades() {
		super();
	}

	public void setUserID(Integer id) {
		this.id = id;
	}

	public void setSubjectFirst(float subject_first) {
		this.subject_first = subject_first;
	}

	public void setSubjectSecond(float subject_second) {
		this.subject_second = subject_second;
	}

	public void setSubjectThird(float subject_third) {
		this.subject_third = subject_third;
	}

	public void setSertificateScore(float sertificate_score) {
		this.sertificate_score = sertificate_score;
	}

	public void setTotalScore(float id_users) {
		this.id_users = id_users;
	}
	
	
}
