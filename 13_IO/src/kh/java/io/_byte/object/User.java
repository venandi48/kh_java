package kh.java.io._byte.object;

import java.io.Serializable;

/**
 * 
 * 객체입출력 할 클래스는 반드시 Serializable인터페이스를 구현해야 함
 *
 */
public class User implements Serializable {
	
	/**
	 * 직렬화된 정보와 일치하는 클래스인지 비교하는 고유값 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	private String pw;
	private int point;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String pw, int point) {
		super();
		this.id = id;
		this.pw = pw;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", point=" + point + "]";
	}

}
