package com.bootcamp.exercise;

import java.util.Arrays;

public class Exercise {

	/*public static void main(String[] args) {
		int [] arr1 = {1,1,2,2,1};
		int [] arr2 = {1,1,2,2,2,1};
		int [] arr3 = {1,1,1,2,2,2,1};
		System.out.println(redTicket(2,2,2));
		System.out.println(redTicket(2,2,1));
		System.out.println(redTicket(0,0,0));
		System.out.println(stringE("Helleee"));
	}*/
	
	public boolean noTriples(int [] arr) {
		boolean result = true;
		int size = arr.length;
		int row = 4;
		int count = 0;
		
		for(int i = 0; i < size - row ; i++) {
			
			for(int j = i + 1 ; j <= i + row ; j++) {
				
				if(arr [i] == arr [j]) {
					count++;	
				}
			}
			
			if (count == 2) {
				result = false;
				break;
			}
			
			count = 0;
			
		}
			
		return result;
	}
	
	public int redTicket(int a, int b, int c) {
		int result = 0;
		if( a == 2 && b == 2 && c == 2) {
			result = 10;
		}
		else if(a != b || a != c ){
			result = 0;
		}
		else{
			result = 5;
		}
		return result;
	}
	
	public int stringE(String str) {
		
		int count = 0;
		if(str.length() > 15) {
			throw new IndexOutOfBoundsException();
		}else {
		
	   for(char c : str.toCharArray()) {
			if(c == 'e') {
				count++;
			}
		}
		}
		return count;
		
	}
}
