package step2_01.array;

import java.util.Scanner;

public class ArrayEx24_테스트문제1_2 { // 2020.12.22

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장  // 2:19 - 2:27
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] +" ");
		}
		System.out.println();
		System.out.println("제외할 값 입력 : ");
		int exceptData = scan.nextInt();
		int exceptIdx = -1;
		
		for (int i = 0; i < d.length; i++) {
			if(d[i] == exceptData) {
				exceptIdx = i;
			}
		}
		
		for (int i = 0; i < d.length; i++) {
			if(0 <= i && i < exceptIdx) {
				e[i] = d[i];
			}
			else if(exceptIdx < i ) {
				e[i-1] = d[i];
			}
				
		}
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");
		}
		
		
		System.out.println();
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 //2:28 - 2:35
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		System.out.println();
		
		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i] + " ");
		}
		System.out.println();
		System.out.print("제외할 번호나 값 입력 : ");
		exceptData = scan.nextInt();
		exceptIdx = -1;
		
		for (int i = 0; i < f.length; i++) {
			if(f[i] == exceptData) {
				exceptIdx = i;				
			}	
		}
		
		if(exceptIdx % 2 == 0) {
			for (int i = 0; i < f.length; i++) {
				if(i >=0 && i < exceptIdx) {
					g[i] = f[i];
				}
				else if( i > exceptIdx +1 ) {
					g[i-2] = f[i];
				}				
			}
		}
		
		else if(exceptIdx % 2 == 1) {
			for (int i = 0; i < f.length; i++) {
				if(i >=0 && i < exceptIdx - 1) {
					g[i] = f[i];
				}
				else if( i > exceptIdx ) {
					g[i-2] = f[i];
				}				
			}
		}
		for (int i = 0; i < g.length; i++) {
			System.out.print(g[i] + " ");
		}
		
		System.out.println();
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장 // 2:37 - 2:40
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		System.out.println();
		for (int i = 0; i < h.length; i++) {
			System.out.print(h[i] + " ");
		}
		System.out.println();
		System.out.println("추가할 숫자 입력 : ");
		int addData = scan.nextInt();
		int cnt = 5;
		
		for (int i = 0; i < cnt - 1; i++) {
			h[i] = h[i+1];
		}
		
		h[cnt -1] = addData;
		
		for (int i = 0; i < h.length; i++) {
			System.out.print(h[i] + " ");
		}
		System.out.println();
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 // 2:40 - 2:48
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		System.out.println();
		
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j] + " ");
		}
		System.out.println();
		System.out.println("추가할 숫자 입력 : ");
		addData = scan.nextInt();
		
		for (int j = i.length - 1; j > 0; j--) {
			i[j] = i[j-1];
		}
		
		i[0] = addData;
		
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j] + " ");
		}
		
		System.out.println();
		
		// 문제 12) 아래배열을 거꾸로 저장 // 2:52 - 2:55
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};
		System.out.println();
		int cntK = 4;
		System.out.print("j = ");
		for (int k2 = 0; k2 < j.length; k2++) {
			System.out.print(j[k2] + " ");
		}
		
		
		for (int k2 = 0; k2 < j.length; k2++) {
			k[cntK] = j[k2];
			cntK--;
		}
		
		System.out.println();
		System.out.print("k = ");
		for (int k2 = 0; k2 < k.length; k2++) {
			System.out.print(k[k2] + " ");
		}
	
		scan.close();
	}

}
