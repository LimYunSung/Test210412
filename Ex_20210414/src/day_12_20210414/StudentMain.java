package day_12_20210414;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student();

		stu.name = "�л�1";
		stu.stuNum = 12345;

		System.out.println(stu.name);
		System.out.println(stu.stuNum);

		Student stu1 = new Student("�л�2", 67890);
		System.out.println(stu1.name);
		System.out.println(stu1.stuNum);

	}

}
