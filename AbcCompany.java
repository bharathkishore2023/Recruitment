public class AbcCompany {
RecruitingTeam recruitingTeam;
HRTeam hrTeam;
Candidate candidate;
public AbcCompany(Candidate candidate) {
	this.candidate=candidate;
	recruitingTeam=new RecruitingTeam();
	hrTeam=new HRTeam();
}
public void printResult() {
	
	hrTeam.Result(candidate);
}
}