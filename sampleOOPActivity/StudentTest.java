package sampleOOPActivity;

public class StudentTest {
    public static void main(String[] args) {
        //public maaaccess basta magcreate ng object outside the class

        //create three objects for student record
        Student annaRecord = new Student();
        Student beahRecord = new Student();
        Student crisRecord = new Student();
        
        // For annaRecord
        annaRecord.setName("Anna Clarisse Dela Cruz");
        // Two setName methods
        annaRecord.setName("Anna", 19);
        annaRecord.setAddress("Lagman");
        annaRecord.setAge(19);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishhGrade(95.5);
        annaRecord.setScienceGrade(100);
        
        // Overloaded methods
        annaRecord.print(annaRecord.getName());
        annaRecord.print(annaRecord.getEnglishGrade(),annaRecord.getMathGrade(),annaRecord.getScienceGrade());
        
        System.out.println("Name of student: " + annaRecord.getName());
        //Overloading
        System.out.println("Age of Anna: " + annaRecord.getAge());
        System.out.println("Address of student: " + annaRecord.getAddress());
        
        // Print number of students
        System.out.println("Student Count = " + Student.getStudentCount());
       
        // For beahRecord
        beahRecord.setName("Beah");
        System.out.println("Name of student: " + beahRecord.getName());
        
        // For crisRecord
        crisRecord.setName("Cris");
        System.out.println("Name of student: " + crisRecord.getName());
        
        //Method overloading: System.out.p
        System.out.println(annaRecord.getName());
        System.out.println(annaRecord.getAverage());
        
        annaRecord.print("Anna");
        annaRecord.print(89,90,95);
        beahRecord.print("Beah");
        
        
        //accessor return doesnt mean na piniprint, inaout mo lang value doesnt mean dinidisplay or piniprint
        // nireturn niya lang saka pinrint

        //accesor method may return value public String yung String yung return type

        //mutator naflalagay ng value, walang return type
        //pag set void (mutator) may parameter inside, pag get may return, getAge nirereturn age dapat may return type
        //nirereturn name dapat return type ay string
        // parseint cinoconvert sa number
        //Alert alert 3 mag increment increment text cinoconvert sa integer
        	
        
    }
}
