package genric;

public class Student implements printInterface {
 int rollNumber;
 public Student(int rollNumber) {
	 this.rollNumber=rollNumber;
 }
@Override
public void print() {
	// TODO Auto-generated method stub
	System.out.println(rollNumber);
	
}
}
