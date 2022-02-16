package member.abstractClass.model.vo;

public class Ruby extends Member {

	public Ruby() {
		super();
	}

	public Ruby(String name, String grade, int point) {
		super(name, grade, point);
	}

	// 이자포인트
	@Override
	public double getInterestPoint() {
		return super.getPoint() * 0.3;
	}

	// 할인가
	@Override
	public int buy(int price) {
		return (int) (price - price * 0.3);
	}
}
