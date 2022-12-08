package labClassDemo;

public class StudentDemo {
	private final static String TABLE_HEADER = 
			String.format(FORMATTING.STUDENT_TABLE_HEADER.VALUE, 
					"Id", "First Name", "Last Name", "Email", "Phone\n");
	
	private static Long ID = 100L;
	private static Student[] studentArray = new Student[0];
	public final static int ID_LENGTH = 4;
	
	public static void main(String[] args) {
		
		Student student_01 = new Student("Paul","Dante", "pd@mail.com", "918-900-1020");
		Student student_02 = new Student("Ashley","Gomez", "agomez2@mail.com", "555-330-7771");
		Student student_03 = new Student("Luis","Mazda", "lmaz2010@us.com", "856-112-4950");
		Student student_04 = new Student("Jane","Thompson", "jane_toO@nz.nz", "45-64-3040-939");
		
		addStudent(student_01);
		addStudent(student_02);
		addStudent(student_03);
		showStudentTable();
		removeStudentById(101L);
		showStudentTable();
		removeStudentById(105L);
		showStudentTable();
		addStudent(student_01);
		showStudentTable();
	}
	
	public static Student[] addStudent(Student newStudent) {
		System.out.println("Adding " + newStudent.getFirstName() + "(" + newStudent.getEmail() + ") to Student array.");
		Student[] newStudentArray = new Student[studentArray.length + 1];
		
		for (int i = 0; i < newStudentArray.length; i++) {
			if(i < studentArray.length) {
				newStudentArray[i] = studentArray[i];
			} else {
				newStudent.setId(++ID);
				newStudentArray[i] = newStudent;
			}
		}	
		studentArray = newStudentArray;
		return newStudentArray;
	}
	
	public static Student[] removeStudentById(Long studentId) {
		String removedFirstName = null;
		Student[] newStudentArray = new Student[studentArray.length - 1];
		int newIndex = 0;
		int studentIdCount = 0;
		
		for(Student student: studentArray) {
			if(studentId.equals(student.getId())) {
				studentIdCount++;
			}
		}
		if(studentIdCount > 0) {
			for (int i = 0; i < studentArray.length; i++) {
				
					if(!studentArray[i].getId().equals(studentId)) {
						newStudentArray[newIndex] = studentArray[i];
						newIndex++;
					} else {
						removedFirstName = studentArray[i].getFirstName();
					}
			}
			
			System.out.println("Removing " + removedFirstName + "(Id:" + studentId + ") from Student array.");
		} else {
			System.out.println("Removing student failed. Could not find student with id " + studentId);
			return studentArray;
		}
		
		studentArray = newStudentArray;
		return newStudentArray;
	}
	
	
	public static void showStudentTable() {
		System.out.println("\nPrinting Student table...");
		
		System.out.println(TABLE_HEADER);	
		
		for (Student student : studentArray) System.out.println(student);
		
		System.out.println("----------------------------------------------------------------------------");
	}
}
