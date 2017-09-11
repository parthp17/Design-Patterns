package State;

public class Main {

	
	public static void main(String[] args) {
		int year = 0;
		StudentContext s = new StudentContext(++year);
		s.whoAmI();
		s.setCollegeYear(++year);
		s.whoAmI();
		s.setCollegeYear(++year);
		s.whoAmI();
		s.setCollegeYear(++year);
		s.whoAmI();
		s.setCollegeYear(year);
		s.whoAmI();
		s.setCollegeYear(--year);
		s.whoAmI();
		s.setCollegeYear(++year);
		s.whoAmI();
		s.setCollegeYear(++year);
		s.whoAmI();
		s.setCollegeYear(++year);
		s.whoAmI();
		s.setCollegeYear(++year);
		s.whoAmI();
		s.setCollegeYear(++year);
		s.whoAmI();
		
	}
}
