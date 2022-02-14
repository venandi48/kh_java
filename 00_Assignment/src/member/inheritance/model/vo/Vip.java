package member.inheritance.model.vo;

public class Vip extends Member {

	public Vip() {
		super();
	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}

	// 이자포인트
	@Override
	public double getInterestPoint() {
		return super.getPoint() * 0.1;
	}

}
