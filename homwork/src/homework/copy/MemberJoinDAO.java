package homework.copy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
 
public class MemberJoinDAO {
 
    Scanner sc = new Scanner(System.in);
    List<MemberDTO> members = new ArrayList<>();
    
    public MemberJoinDAO() {
        members.add(new MemberDTO("Superman", "1234", "New York"));
        members.add(new MemberDTO("Batman", "1234", "Boston"));
        members.add(new MemberDTO("Pororo", "1234", "Seoul"));
    }
 
    public void run() {
        
        int key = 0;
        while ((key = menu()) != 0) {
            switch (key) {
                case 1:
                    Login();
                    break;
                case 2:
                    MemberJoin();
                    break;
                case 3:
                    SelectMember();
            }
        }
    }
 
    private void SelectMember() {
        Iterator<MemberDTO> ite = members.iterator();
        
        while(ite.hasNext()) {
            System.out.println(ite.next() + " ");
        }
        
    }
 
    private void MemberJoin() {
        sc.nextLine();
        String id = getStrInput("               ID : ");
        String pw = getStrInput("         PassWord : ");
        String pw2 = getStrInput("Password Confirm : ");
        String name = getStrInput("           Name : ");
        
        if(idCheck(id)) {
            System.out.println("�ߺ��� ID�Դϴ�.");
        }else if(pw.equals(pw2)) {
            members.add(new MemberDTO(id, pw, name));
            System.out.println(id + "�� ������ ���ϵ帳�ϴ�.");
        }else {
            System.out.println("��й�ȣ�� Ȯ�����ּ���.");
        }
        
    }
 
    private boolean idCheck(String id) {
        boolean check = true;
        MemberDTO member = FindById(id);
        if(member == null)
            check = false;
        return check;
    }
 
    private void Login() {
        sc.nextLine();
        String id = getStrInput("      ID : ");
        String pw = getStrInput("PassWord : ");
        
        MemberDTO member = FindById(id);
        if(member == null){
            System.out.println("��ϵ��� ���� ID�Դϴ�.");
        }else if(member.getPW().equals(pw)) {
            System.out.println("[" + member.getID() + "]�Բ��� �α��� �ϼ̽��ϴ�.");
        }else {
            System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
        }
    }
 
    private MemberDTO FindById(String id) {
        for(MemberDTO memberDTO : members) {
            if(memberDTO.getID().equals(id)) {
                return memberDTO;
            }
        }
        return null;
    }
 
    private String getStrInput(String msg) {
        System.out.println(msg);
        return sc.nextLine();        
    }
 
    private int menu() {
        System.out.println("Welcome YouTube");
        return getNumInput("[1]�α��� [2]ȸ������ [3]��ü ȸ�� ���� [0]����");
    }
 
    private int getNumInput(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
 
}
