package q614;



/* "학교명", "학년"을 저장할 수 있는 구조체로 2개의 변수를 선언한 후,

한 개의 변수는 학교명에 "Jejuelementary", 학년에 "6"으로 각각 초기화하고 

다른 변수에는 새로운 학교와 학년을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오.

학교명은 20자 이하의 영문자이다.

예제1
입력
Seogwipomiddle  1

출력
6 grade in Jejuelementary School
1 grade in Seogwipomiddle School

*/

import java.util.Scanner;

class Student {
	private String schoolName;
	private int grade;
	
	public Student(String schoolName, int grade) {
		this.schoolName = schoolName;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(grade + " grade in " + schoolName + " School");
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student st1 = new Student("Jejuelementary", 6);
		
		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student st2 = new Student(schoolName, grade);
		
		st1.print();
		st2.print();

	}

}
