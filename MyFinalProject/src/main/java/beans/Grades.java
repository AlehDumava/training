package beans;

public class Grades {

	public Integer userID;
	public float subjectFirst;
	public float subjectSecond;
	public float subjectThird;
	public float sertificateScore;
	public float totalScore;
	
	public Grades() {
		super();
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public void setSubjectFirst(float subjectFirst) {
		this.subjectFirst = subjectFirst;
	}

	public void setSubjectSecond(float subjectSecond) {
		this.subjectSecond = subjectSecond;
	}

	public void setSubjectThird(float subjectThird) {
		this.subjectThird = subjectThird;
	}

	public void setSertificateScore(float sertificateScore) {
		this.sertificateScore = sertificateScore;
	}

	public void setTotalScore(float totalScore) {
		this.totalScore = totalScore;
	}
	
	
}
