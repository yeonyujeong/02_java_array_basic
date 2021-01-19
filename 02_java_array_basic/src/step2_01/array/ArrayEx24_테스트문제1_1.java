package step2_01.array;

import java.util.Scanner;

public class ArrayEx24_테스트문제1_1 { // 2020.12.22  

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = { 10, 4, 5, 3, 1 };
		
		// 문제 1) 위 배열를 이용해서 전체 요소의 합출력 //2:04 - 2:05
		
			int total = 0;
			for (int i = 0; i < a.length; i++) {
				total = total + a[i];
			}
			System.out.println("합 : "+ total);
		
		// 문제 2) 값을 입력하면 인덱스 출력 // 2:05 - 2:08
		// 예) 5 ==> 2  ,  1 ==> 4
		
			System.out.println("값 입력 : ");
			int data = scan.nextInt();
			int idx = -1;
			for (int i = 0; i < a.length; i++) {
				if(a[i] == data) {
					idx = i;
				}
			}
			if(idx == -1) {
				System.out.println("해당 값은 존재하지 않습니다.");
			}
			else {
			System.out.println("값" + data + "에 해당하는 인덱스 : " +idx);
			}
			
			
			
		// 문제 3)  인덱스를 입력하면 값 출력  // 2:08 - 2:09
		// 예) 2 ==> 5  , 4 ==> 1
			System.out.println();
			System.out.println("인덱스를 입력하세요 : ");
			idx = scan.nextInt();
					
			System.out.println("인덱스" +idx +"에 해당하는 값 : " + a[idx]);			
			
			
		// 문제 4) 위 배열중 가장 큰 값 출력 // 2:10 - 2:11
		// 예) 10
			System.out.println();
			int maxData = 0;
			for (int i = 0; i < a.length; i++) {
				if(a[i] > maxData) {
					maxData = a[i];
				}
			}
			System.out.println("가장 큰 값 : " + maxData);
			
			
		// 문제 5) 위 배열중 홀수의 개수 출력 // 2:11 - 2:13
		// 예) 홀수의 개수 : 3
			int oddCnt = 0;
			
			for (int i = 0; i < a.length; i++) {
				if(a[i] % 2 == 1) {
					oddCnt++;
				}
			}			
			
			System.out.println("홀수의 개수 : " + oddCnt);
			
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)  // 2:13 - 2:14
		// 예) b => {0, 0, 5, 3, 1}
			
			System.out.println();
			int[] b = {0, 0, 0, 0, 0};
			
			for (int i = 0; i < a.length; i++) {
				if(a[i] % 2 == 1) {
					b[i] = a[i];
				}
			}
			
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			
			System.out.println();
		
		// 문제 7) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장(저장위치는 앞에서부터  저장 , 3번 문제와 다름)
		// 예) c => {5, 3, 1, 0, 0}    // 2:15 - 2:18
			int[] c = { 0,0,0,0,0 };
			int cnt = 0;
			
			
			for (int i = 0; i < a.length; i++) {
				if(a[i] % 2 == 1) {
					c[cnt] = a[i];
					cnt++;
				}
			}
			
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i] + " ");
			}
	
			
			scan.close();
	}

}
