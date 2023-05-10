
import java.util.HashMap;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of candidate");
		String name = sc.nextLine();
		System.out.println("Enter the dob || format=> (01-01-2023)");
		String str = sc.nextLine();
		System.out.println("Enter the physics mark \n should be within 1 to 100 ");
		int physics = sc.nextInt();
		System.out.println("Enter the chemistry mark \n should be within 1 to 100");
		int chemistry = sc.nextInt();
		System.out.println("Enter the math/Bio mark \n should be within 1 to 100");
		int mathOrBio = sc.nextInt();
		System.out.println("Enter the community \n BC || MBC || SC || ST ");
		String community = sc.next();
		System.out.println("Enter the UG-CGPA \n should be within 1 to 10 ");
		float UG_CGPA = sc.nextFloat();
		System.out.println("Enter the PG-CGPA \n should be within 1 to 10");
		float PG_CGPA = sc.nextFloat();
		System.out.println("Enter the number of Projects have done");
		int noOfProjects = sc.nextInt();
		System.out.println("Enter the course Type \n 0.fulltime || 1.others ");
		int courseType = sc.nextInt();
		System.out.println("Enter the citizenship \n  0.indian || 1.others ");
		int citizenship = sc.nextInt();
		System.out.println("Enter the candidate score: ");
		int score = sc.nextInt();
		String[] dob = str.split("-");
		HashMap<String, Integer> HSC = new HashMap<>();
		HSC.put("physics", physics);
		HSC.put("chemistry", chemistry);
		HSC.put("mathOrBio", mathOrBio);
		Candidate candidate = new Candidate(name, dob, HSC, UG_CGPA, PG_CGPA, noOfProjects, courseType, score,
				citizenship, community);
		AbcCompany abcCompany = new AbcCompany(candidate);
		abcCompany.printResult();
	}

}
