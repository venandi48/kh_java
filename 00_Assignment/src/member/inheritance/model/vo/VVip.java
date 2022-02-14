package member.inheritance.model.vo;

public class VVip extends Member {

	public VVip() {
		super();
	}

	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}

	// 이자포인트
	@Override
	public double getInterestPoint() {
		return super.getPoint() * 0.15;
	}
}
