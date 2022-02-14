package member.inheritance.model.vo;

public class Gold extends Member {

	public Gold() {
		super();
	}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}

	// 이자포인트
	@Override
	public double getInterestPoint() {
		return super.getPoint() * 0.05;
	}
}
