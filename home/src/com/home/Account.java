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
			throw new IllegalStateException("ȸ�� ���̵�� ����Ҽ� �����ϴ�!");
		}
		map.put(id, null);
	}

	@Override
	public LoginChk isMember(String id) {
LoginChk loginChk = null;
		
		//ã���� �ϴ� ���̵� ���°��
		if(map.get(id) == null) {
			loginChk = LoginChk.FAIL;
			return LoginChk.FAIL;
	
		//�Ϲ�ȸ��
		}else if(map.get(id).equals(id)) {
			loginChk = LoginChk.MEMBER;
		}
		
		return loginChk;
	}
	@Override
	public boolean outMember(String id) {
		boolean result = false;
		//ȸ�������ϸ�
		if(map.get(id).equals(id)) {
			map.remove(id);
			result = true;
		}
		return result;
	}

}
