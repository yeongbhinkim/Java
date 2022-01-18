package com.home;

import java.util.HashMap;
import java.util.Map;

import com.work.LoginChk;

public class Account implements AccountIf {

	private Map<String,String> map = new HashMap<>();
	
	public Account() {
		
	}
	@Override
	public void joinMember(String id) {
		if(map.containsKey(id)) {
			throw new IllegalStateException("회원 아이디로 사용할수 없습니다!");
		}
		map.put(id, null);
	}

	@Override
	public LoginChk isMember(String id) {
LoginChk loginChk = null;
		
		//찾고자 하는 아이디가 없는경우
		if(map.get(id) == null) {
			loginChk = LoginChk.FAIL;
			return LoginChk.FAIL;
	
		//일반회원
		}else if(map.get(id).equals(id)) {
			loginChk = LoginChk.MEMBER;
		}
		
		return loginChk;
	}
	@Override
	public boolean outMember(String id) {
		boolean result = false;
		//회원존재하면
		if(map.get(id).equals(id)) {
			map.remove(id);
			result = true;
		}
		return result;
	}

}
