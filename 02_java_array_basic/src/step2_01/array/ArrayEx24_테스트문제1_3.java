package step2_01.array;

import java.util.Scanner;

public class ArrayEx24_테스트문제1_3 {  	// 2020.12.23  

	public static void main(String[] args) {
	Scanner scan =  new Scanner(System.in);
		
		// 문제 13) 아래 배열 l과 m을 비교해서 둘의 합이 짝수 일때만 n에 저장 // 2:48 - 2:52
		// 예) n = {74,82,0,0,0}
		System.out.println("//문제13");
		int[] l = { 10, 20, 30, 40, 50 };
		int[] m = { 13, 54, 17, 42, 1 };
		int[] n = { 0,0,0,0,0};
			
		int cnt = 0;
		
			for (int i = 0; i < l.length; i++) {
				if((l[i] + m[i]) % 2 == 0 ) {
					n[cnt] = l[i] + m[i];
					cnt++;
				}	
			}
			
			System.out.print("n = ");
			for (int i = 0; i < n.length; i++) {
				System.out.print(n[i] + " ");
			}
			System.out.println();
				
		// 문제 14) 아래는 시험결과 이다. 시험에 합격한 사람의 번호만 win에 저장 (60점이상 합격) //2:52 - 2:54
		int[] num = { 1001, 1002, 1003 };
		int[] score = { 50, 83, 78 };
		int[] win = { 0,0,0 };
		// 예) win[3]= {1002, 1003, 0};
	
			System.out.println();
			System.out.println("//문제14");
			cnt = 0;
			for (int i = 0; i < score.length; i++) {
				if(score[i] >= 60) {
					win[cnt] = num[i];
					cnt++;
				}
			}

			System.out.print("win = ");
			for (int i = 0; i < win.length; i++) {
				System.out.print(win[i] + " ");
			}
			System.out.println();
		
		// 문제 15) 아래는 시험결과 이다 시험에 합격한 사람의 번호만 win2에 저장 (60점이상 합격) // 2:54 - 2:57
		int[] data = { 1001, 80 , 1002, 23, 1003 , 78 };
		int[] win2 = { 0,0,0 };
		// 예) win2[3] = {1001, 1003, 0};
		
			System.out.println();
			System.out.println("//문제15");
			cnt = 0;
			for (int i = 0; i < data.length; i++) {
				if(i % 2 == 1) {
					if(data[i] >= 60) {
						win2[cnt] = data[i-1];
						cnt++;
					}
				}
			}
		
			System.out.print("win2 = ");
			for (int i = 0; i < win2.length; i++) {
				System.out.print(win2[i] + " ");
			}
		
			System.out.println();
	
		// 문제 16) 아래 배열 o 에서 내가 입력한 값만 빼고p 에 저장 //2:57 - 3:02
		int[] o = { 10,20,30,40,50 };
		int[] p = { 0,0,0,0,0 };
		// 예) 30 ==> p = {10,20,40,50,0};
		
		System.out.println();
		System.out.println("//문제16");
		for (int i = 0; i < o.length; i++) {
			System.out.print(o[i] + " ");
		}
		System.out.println();
		System.out.print("제외할 값 입력 : ");
		int except = scan.nextInt();
		
		int exceptIdx = -1;
		
		for (int i = 0; i < o.length; i++) {
			if(o[i] == except) {
				exceptIdx = i;
			}
		}
		
		if(exceptIdx == -1) {
			System.out.println("입력하신 값은 존재하지 않습니다.");
		}
		else {
			for (int i = 0; i < o.length; i++) {
				if(i >= 0 && i< exceptIdx ) {
					p[i] = o[i];
				}
				else if(i > exceptIdx) {
					p[i-1] = o[i];
				}
			}
			System.out.print("p = ");
			for (int i = 0; i < p.length; i++) {
				System.out.print(p[i] + " ");
			}
		}
		
		
		System.out.println();
		// 문제 17) 아래 배열 q에서 내가 입력한 번호만 빼고 다른 번호와 값을 r 에 저장  // 3:04 - 3:09
		int[] q = { 1001, 40, 1002, 65, 1003,  70 };
		int[] r = { 0,0,0,0,0,0 };
		// 예) 1002 ==> r = {1001, 40, 1003, 70 , 0, 0};
		System.out.println();
		System.out.println("//문제17");
		
		System.out.print("q = ");
		for (int i = 0; i < q.length; i++) {
			System.out.print(q[i] + " ");
		}
		System.out.println();
		System.out.print("제외할 번호 입력 : ");
		int exceptNumber = scan.nextInt();
		exceptIdx = -1;
		
		for (int i = 0; i < q.length; i++) {
			if(q[i] == exceptNumber) {
				exceptIdx = i;
			}
		}
		
		if(exceptIdx == -1) {
			System.out.println("입력하신 값은 존재하지 않습니다.");
		}
		else {
			for (int i = 0; i < q.length; i++) {
				if(i >= 0 && i < exceptIdx) {
					r[i] = q[i];
				}
				else if(i > exceptIdx +1) {
					r[i-2] = q[i];
				}
			}
			System.out.print("r = ");
			for (int i = 0; i < r.length; i++) {
				System.out.print(r[i] + " ");
			}
		}
		
		
		System.out.println();
		
		
		
		// 문제 18)   // 3:12 - 3:29
		int[] arr = {10,20,30,40,50};
		int[] s = new int[5];
		
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다 
		// s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다. 
		// 조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장 
		
		// 예) 10, 20, 10, 1, 50
		//  s = { 0, 1, 0, -1, 4}
		
		// 예)  30, 40, 1, 10, 2
		// s = { 2, 3, -1, 0, -1}
				
		
		System.out.println();
		System.out.println("//문제18");
		
		cnt = 0;
		
		while(cnt<5) {
			System.out.print("숫자 입력 : ");
			int number =scan.nextInt();
			int idx = -1;

			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == number) {
					idx = i;
				}
			}
			s[cnt] = idx;
			cnt++;
		}
		
		System.out.print("s = ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		
		
		scan.close();
	}

}
