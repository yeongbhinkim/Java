package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class a {

	public static void main(String[] args) {
		String str = "??????,???翵,????ǥ,???翵,?ڹ?ȣ,??????,???翵,??????,?ֽ???,?̼???,?ڿ???,?ڹ?ȣ,??????,????ȯ,???缺,??????,??????";
		String[] name = str.split(",");
		int l = 0;
		int k = 0;
		int ljy = 0;
	
		HashSet<String> hashSet = new HashSet<>();
	
	
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '??') {
				k++;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '??') {
				l++;
			}
		}
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals("???翵")) {
				ljy++;
			}
		}
		for(String data : name){
	    hashSet.add(data);
	 
	}
		System.out.println("?达?? " + k + ", " + "?̾??? " + l);
		System.out.println("???翵???? " + ljy);
		System.out.println(hashSet); 
		
		List<String> list = new ArrayList<>(hashSet);
		Collections.sort(list);
		System.out.print("\n???????? : ");
		for(String a : list) System.out.print(a + " ");

	}
}
