package com.work3;

public interface AccountIf {

//  //신규
//  public void createNewAccount(String name);
//
//  // 폐지
//  public void deleteAccount(String accountNumber);

  // 입금
  int deposit(int anount) throws Exception;//deposit 입금

  // 출금
  int withdraw(int anount) throws Exception;//withdraw 출금

//  // 조회
//  public void printAccount(String accountNumber);
//
//  // 전체 조회
//  public void printAllAccount();

}