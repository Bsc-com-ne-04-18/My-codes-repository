import java.util.Scanner;
public class Objects{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Objects2 nomsa = new Objects2();
		System.out.println("Enter name");
		String name = input.next();
		double grades [] = new double[3];
		double sum = 0;
		System.out.println("Enter grades " );
		for (int x = 0; x < grades.length; x++ ) {	
			grades[x] = input.nextDouble();
		}
		nomsa.setName(name);
		nomsa.setGrades(grades);
		nomsa.printStudentDetails();


	}
}