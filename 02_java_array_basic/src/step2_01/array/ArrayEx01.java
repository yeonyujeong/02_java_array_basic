package step2_01.array;
/*
 * 
 * 배열 ( array ) 
 * 
 *  [ 형식 ]
 *  
 *  1) 자료형[] 배열명 = new 자료형[방의개수];
 *  2) 자료형 배열명[] = new 자료형[방의개수];
 * 
 * 	- '같은 자료형'의 데이터를 '여러개' 저장하기 위한 자료구조
 *  - 인덱스 (index) : 0부터 시작하는 방 번호가 부여된다.
 *  - 배열은 주소변수이다.
 * 
 **/


import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) { //syntax

		
		// 1. 일반 변수 ( 값 저장 )
		int nVar = 0;
		nVar = 10;
		System.out.println(nVar);
		
		// 2. 배열 ( 주소 저장 )
		int [] arr = null;
		arr = new int[5];
		System.out.println(arr);
		
		System.out.println(arr[0]); //배열은 초깃값이 자동으로 생성이 되
		System.out.println(arr[1]); //정수형태의 초깃값은 0이다. 나머진 직접확인~
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		//System.out.println(arr[5]);
		//Thread [main] (Suspended (uncaught exception ArrayIndexOutOfBoundsException))	
		//ArrayEx01.main(String[]) line: 25  에러 메세지 암기
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// 1) 원시적인 방법
		System.out.println(arr[0]);
		System.out.println(arr[1]); 
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println();
		
		// 2) for문을 이용하여 출력
		for (int i = 0; i < arr.length; i++) { //arr.length : 배열의 길이
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// 3) Arrays.toString(배열의 이름) 이용하여 출력
		System.out.println(Arrays.toString(arr));
		
		
	}

}
