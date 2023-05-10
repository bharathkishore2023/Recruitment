public class HRTeam extends RecruitingTeam{
public void Result(Candidate candidate) {
	if(candidate.getScore()>=35 &&  validateCandidateDetails(candidate))
		System.out.print("congratulations! "+candidate.getName()+" you have selected");
	else 
		System.out.print("Sorry "+candidate.getName()+" you have rejected");
}
}

