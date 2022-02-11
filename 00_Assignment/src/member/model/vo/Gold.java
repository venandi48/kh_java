package member.model.vo;

public class Gold {

	// 필드
	private String name;
	private String grade;
	private int point;

	// 생성자
	public Gold() {

	}

	public Gold(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	// setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 이자포인트
	public double getInterestPoint() {
		return point * 0.05;
	}
}
