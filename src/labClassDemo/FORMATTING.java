package labClassDemo;

public enum FORMATTING {
	
	ID_LENGTH			(String.valueOf(StudentDemo.ID_LENGTH)),
	STUDENT_TABLE_HEADER("%-" + ID_LENGTH.VALUE + "s %-15s %-15s %-25s %-20s"),
	//%04d adds leading zeros necessary to create a 4 digit number
	STUDENT_TABLE_ROW	("%0" + ID_LENGTH.VALUE + "d %-15s %-15s %-25s %-20s")
	;
	
	public String VALUE;
	
	FORMATTING(String VALUE) {
		this.VALUE = VALUE;
	}
}
