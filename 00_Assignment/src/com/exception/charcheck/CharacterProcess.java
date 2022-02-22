package com.exception.charcheck;

public class CharacterProcess {

	public CharacterProcess() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * checked 예외 : 예외처리 강제화
	 * unchecked 예외 : 예외처리 강제화X
	 * 
	 */
	public int countAlpha(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");

			else if (Character.isAlphabetic(s.charAt(i)))
				count++;

		}

		return count;
	}
}
