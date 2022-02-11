package member.model.vo;

public class Silver {

	// 필드
	private String name;
	private String grade;
	private int point;

	// 생성자
	public Silver() {

	}

	public Silver(String name, String grade, int point) {
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
		return point * 0.02;
	}

}
