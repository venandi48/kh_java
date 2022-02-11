package kh.java.object.array.student;

/**
 * VO 클래스
 * - 학생번호
 * - 학생이름
 * - 자바점수
 *
 */
public class Student {
	private int idNum;
	private String name;
	private int javaScore;
	
	public Student() {
		
	}
	
	public Student(int idNum, String name, int javaScore) {
		this.idNum = idNum;
		this.name = name;
		this.javaScore = javaScore;
	}
	
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	
}
