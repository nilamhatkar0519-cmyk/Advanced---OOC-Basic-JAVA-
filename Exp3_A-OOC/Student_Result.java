class Student{

	int roll_no;
	void setRollNo(int roll_no){
		this.roll_no = roll_no;
	}
}

class Test extends Student{
	float sub1, sub2;
	void setMarks(float sub1, float sub2){
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
}

class Result extends Test{
	void displayResult(){
		float total = (sub1 + sub2 )/2;
		System.out.println("Roll No : " +roll_no);
		System.out.println("marks of Subject 1  : " +sub1);
		System.out.println("marks of Subject 2 : " +sub2);
		System.out.println(" Total is  : " +total+ " %");		
	}	

}

class Student_Result{
	public static void main( String[] args ){

		Result r = new Result();
		r.setRollNo(101);
		r.setMarks(75,80);
		r.displayResult();
	}
}