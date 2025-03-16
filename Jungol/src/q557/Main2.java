package q557;
//"이름", "학교명", "학년"을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오.
//(이름과 학교명은 각각 20자 이하이다.)
//입력 Songjunhyuk Beolmal 6
//출력 
//Name : Songjunhyuk 
//School : Beolmal 
//Grade : 6

import java.util.Scanner;

class Person {
	private String name;
	private String school;
	private String ban;
	private int grade;

	public Person(String name, String school, String ban, int grade) {
		this.name = name;
		this.school = school;
		this.ban = ban;
		this.grade = grade;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("ban : " + ban);
		System.out.println("Grade : " + grade);
	}
}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String school = sc.next();
		String ban = sc.next();
		int grade = sc.nextInt();
		sc.close();

//		System.out.println("Name : " + name);
//		System.out.println("School : " + school);
//		System.out.println("Grade : " + grade);
		
		Person p1 = new Person(name, school, ban, grade);
		
		name = sc.next();
		school = sc.next();
		ban = sc.next();
		grade = sc.nextInt();
		
		Person p2 = new Person(name, school, ban, grade);
		
		p1.print();
		p2.print();
	}
}
