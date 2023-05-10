import java.util.HashMap;
public class Candidate {
private String name;
private String[] dob;
private  HashMap<String,Integer>HSC;
private float UG_CGPA;
private float PG_CGPA;
private int noOfProjects;
private String courseType;
private String citizenship;
private int score;
private String community;
public static final String FULLTIME="fulltime";
public  static final String INDIAN="indian";
private String[] courseTypes= {"fulltime","others"};
private String[] citizen= {"indian","others"};
public Candidate(String name,String[] dob,HashMap<String,Integer>HSC,float UG_CGPA,
		float PG_CGPA,int noOfProjects,int courseIndex,int score,int citizenIndex,String community) {
	this.name=name;
	this.dob=dob;
	this.HSC=HSC;
	this.UG_CGPA=UG_CGPA;
	this.PG_CGPA=PG_CGPA;
	this.noOfProjects=noOfProjects;
	this.courseType=courseTypes[courseIndex];
	this.score=score;
	this.citizenship=citizen[citizenIndex];	
	this.community=community;
}
public String getName() {
	return name;
}

public String[] getDob() {
	return dob;
}

public HashMap<String, Integer> getHSC() {
	return HSC;
}
public String getCommunity() {
	return community;
}

public float getUG_CGPA() {
	return UG_CGPA;
}

public float getPG_CGPA() {
	return PG_CGPA;
}

public int getNoOfProjects() {
	return noOfProjects;
}

public String getCourseType() {
	return courseType;
}

public String getCitizenship() {
	return citizenship;
}
public int getScore() {
	return score;
}

}

