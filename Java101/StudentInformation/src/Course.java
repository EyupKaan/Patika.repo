
public class Course {
	
	Teacher courseTeacher;
	String name, code, prefix;
	int note;
	public Course(String name, String code, String prefix) {
		super();
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
	}
	
	public void addTeacher(Teacher t) {
		if(this.prefix.equals(t.branch)) {
			this.courseTeacher = t;
			System.out.println("��lem ba�ar�l� ");
		}
		else {
			System.out.println(t.name+" bu dersi veremez. ");
		}
	}
	
	public void printTeacher() {
		if (courseTeacher != null) {
			System.out.println(this.name+" Dersin Akademisyeni => "+ courseTeacher.name);
		}
		else {
			System.out.println(this.name+" dersine akademsiyen atanmam��t�r.");
		}
	}
}
