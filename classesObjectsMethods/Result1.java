package classesObjectsMethods;

public class Result1 {
	public static void main(String[] args) {
		
		Result aceResult = new Result();
		
		// aceResult
		aceResult.setRollNo("051-30-2");
		aceResult.setName("Ace Delacrois");
		aceResult.setOopGrade(95);
		aceResult.setDsaGrade(93);
		aceResult.setMathGrade(96);
		
		aceResult.input();
		aceResult.show();
		aceResult.total();
		aceResult.avg();
	}

}
