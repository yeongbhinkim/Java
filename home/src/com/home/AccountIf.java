package com.home;

import com.work.LoginChk;

public interface AccountIf {

	/**
	 * 회원 가입
	 * @param id 회원 아이디
	 * @param pw 회원 비밀번호
	 */
	void joinMember(String id);

	/**
	 * 회원 인증
	 * @param id 아이디
	 * @param pw 비밀번호
	 * @return 회원인증(인증실패,관리자,일반회원)
	 */
	LoginChk isMember(String id);

	/**
	 * 회원 탈퇴
	 * @param id 아이디
	 * @param pw 비밀번호
	 * @return 탈퇴성공유무
	 */
	boolean outMember(String id);
}
