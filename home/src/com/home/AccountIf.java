package com.home;

import com.work.LoginChk;

public interface AccountIf {

	/**
	 * ȸ�� ����
	 * @param id ȸ�� ���̵�
	 * @param pw ȸ�� ��й�ȣ
	 */
	void joinMember(String id);

	/**
	 * ȸ�� ����
	 * @param id ���̵�
	 * @param pw ��й�ȣ
	 * @return ȸ������(��������,������,�Ϲ�ȸ��)
	 */
	LoginChk isMember(String id);

	/**
	 * ȸ�� Ż��
	 * @param id ���̵�
	 * @param pw ��й�ȣ
	 * @return Ż�𼺰�����
	 */
	boolean outMember(String id);
}
