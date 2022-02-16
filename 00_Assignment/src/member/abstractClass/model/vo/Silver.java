package member.abstractClass.model.vo;

public class Silver extends Member {

	public Silver() {
		super();
	}

	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}

	// 이자포인트
	@Override
	public double getInterestPoint() {
		return super.getPoint() * 0.02;
	}

	// 할인가
	@Override
	public int buy(int price) {
		return (int) (price - price * 0.02);
	}
}
