package com.sh.test.array.sort;

import java.util.Arrays;

public class Test {
	
	
	
	
	public static void main(String[] args) {
	
		Test t = new Test();
		t.exercise1();
		
	}
	/*
		int[] arr = new int[10];
		
		// 값대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		// 출력하기 전 조건 정하고 + 출력 
		int tmp=0;
		for(int i=0; i<(arr.length-1); i++ ) {       // arr.length-1 = 9; 
			for(int j=(i+1); j<(arr.length); j++) {   // i=1, j =2, j<10
				if( arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}//if 끝
			} // end 안쪽 for 문 		
		}// end 바깥 for문 
		
		System.out.println( Arrays.toString( arr )); // 출력 
*/
		
		private void exercise1() {
			
			int[][] arr = new int[3][5];
			
			//값쓰기 및 5의 배수 검사
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (int)(Math.random()*100)+1;

					if(arr[i][j] % 5 == 0){
							System.out.printf("%d(%d, %d)%n", arr[i][j], i, j);
					}
				}
			}
		}
	}



/*
com.sh.test.array.sort.Test
- 1 ~ 100사이의 난수 10개를 생성해 배열에 대입하고, 오름차순 정렬하세요.
- ex) 12345 ; 
*/
