package com.kh;

public class Array5 {

	public static void main(String[] args) {
		
		int[] values = {3,5,4,7,6};
		
		int max = values[0];
		for(int i=1; i<values.length; i++) {
			if(values[i]>max) {
				max = values[i];
			}
		}
		System.out.println("최대값="+max);
		
		int mix = values[0];
		for(int i=1; i<values.length; i++) {
			if(values[i]<mix) {
				max = values[i];
			}
		}
		System.out.println("최소값="+mix);
	}

}
