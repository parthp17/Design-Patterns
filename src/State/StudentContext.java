package State;

public class StudentContext {
	
	State state;
	int collegeYear;
	
	public StudentContext(int year){
		this.collegeYear = year;
		this.state = currentState(year);
	}
	
	public int getCollegeYear() {
		return collegeYear;
	}
	public void setCollegeYear(int collegeYear) {
		this.collegeYear = collegeYear;
		this.state = currentState(collegeYear);
	}
	
	public void whoAmI()
	{
		state.collegeState();
	}
	
	static State currentState(int year){
		switch(year)
		{
			case 1: return new Freshman();
			case 2: return new Sophomore();
			case 3: return new Junior();
			case 4: return new Senior();
			default: return new Graduate();
		}
	}
	
}
