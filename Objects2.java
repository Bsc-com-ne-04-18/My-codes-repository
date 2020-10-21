 class Objects2{
 	private String name;
 	private double[] grades;
 	private int totalNumberOfStudent = 1;
 	public Objects2() {

 	}
 	public void setName (String name){
 		this.name = name;
 	}
 	public String getName () {
 		return name;
 	}

 	public void setGrades (double[] grades){
 		this.grades = grades;

 	}
 	public double[] getGrades () {
 		return this.grades;
 	}
 	public double grades() {
 		double sum = 0;
  		for (int x = 0;x < grades.length ; x++ ) {
 			sum += grades[x] ;
 			
 		}
 			double average = sum/grades.length;
 			return average;
 		}


    public int getTotalNumberOfStudent() {
    	return this.totalNumberOfStudent ++;
    }

 	public void printStudentDetails () {
 		System.out.println("name of student is:" +this.name);
 		System.out.println("average is:" +this.grades());
 		System.out.println("number of students is:" +this.totalNumberOfStudent);
 	}



 	
 
}