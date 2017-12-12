package yuchia.com;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Student {
	String name;//(屬性)
	int english;//(屬性)
	int math;//(屬性)
	int chinese;//(屬性)

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public Student(String name, int english, int math, int chinese) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}
}
