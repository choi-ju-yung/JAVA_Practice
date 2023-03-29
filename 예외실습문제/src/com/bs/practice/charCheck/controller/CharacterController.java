package com.bs.practice.charCheck.controller;
import com.bs.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
		public CharacterController() {}
		

		public int countAlpha(String s) throws CharCheckException { // 예외던지기
			int cnt =0;
			try{
				for(int i=0; i<s.length(); i++) {
					if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
						|| (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
						cnt++;
					}
					
					if(s.charAt(i) == ' ') { // 문자열에 공백 있을시 강제로 예외발생
						throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
					}
				}
				
			}catch(CharCheckException e){ // 예외발생시
				e.printStackTrace(); // 해당 문구 출력
				return 0;
			}
//			finally {
//				return cnt;
//			}
			return cnt;	
		}
}

