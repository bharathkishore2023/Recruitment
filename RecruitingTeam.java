
import java.util.Map.Entry;
public class RecruitingTeam {
	public boolean  validateCandidateDetails(Candidate candidate) {
		if(checkDob(candidate) && checkHscMarks(candidate) && candidate.getUG_CGPA()>=8 &&
				candidate.getCourseType().equals(candidate.FULLTIME)
			 && candidate.getCitizenship().equals(candidate.INDIAN)
				&& candidate.getPG_CGPA()>=8 && candidate.getNoOfProjects()>=2 ) return true;
		
		else return false;

	}
	
	public boolean  checkDob(Candidate candidate) {
		int month=Integer.parseInt(candidate.getDob()[1]);
		int year=Integer.parseInt(candidate.getDob()[2]);
		if(year==1999 && month>=7) {
			return true;
		}
		else if(year>1999) return true;
		else return false;
	}
	public boolean checkHscMarks(Candidate candidate) {
		int physics=0;
		int mathOrBio=0;
		int chemistry=0;
		for(Entry<String,Integer>entry:candidate.getHSC().entrySet()) {
			if(entry.getKey().equals("physics")) physics=entry.getValue();
			if(entry.getKey().equals("mathOrBio")) mathOrBio=entry.getValue();
			if(entry.getKey().equals("chemistry")) chemistry=entry.getValue();
		}
		if(candidate.getCommunity().equals("SC")
				||candidate.getCommunity().equals("ST")) {
		if(physics>=50 && mathOrBio>=50 && chemistry>=50) return true;
		}
		if(physics>=60 && mathOrBio>=60 && chemistry>=60) return true;
		else  return false;
	}
}

