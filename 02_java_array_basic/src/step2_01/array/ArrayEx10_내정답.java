package step2_01.array;

import java.util.Scanner;

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */


public class ArrayEx10_내정답 { // 2020.12.17  2:34 - 2:41

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
			while (true) {
						
				System.out.println("\n[1]번복권 결과확인");
				System.out.println("[2]번복권 결과확인");
				System.out.println("[3]번복권 결과확인");
				System.out.println("[0]종료");
				System.out.print("메뉴 선택 : ");
				sel = scan.nextInt();
				System.out.println();
				
				if(sel == 1) {
					for(int i = 0; i<lotto1.length; i++) {
						if(lotto1[i] == 7 && lotto1[i+1] == 7 && lotto1[i+2] == 7) {
						 cnt1++;
						}
					}
					if(cnt1 >= 1) {
						System.out.println("1번복권 당첨!!");
					}
					else {
						System.out.println("1번복권 꽝~!");
					}
					
				}
				else if(sel == 2) {
					for(int i = 0; i<lotto2.length; i++) {
						if(lotto2[i] == 7 && lotto2[i+1] == 7 && lotto2[i+2] == 7) {
						 cnt2++;
						}
					}
					if(cnt2 >= 1) {
						System.out.println("2번복권 당첨!!");
					}
					else {
						System.out.println("2번복권 꽝~!");
					}
					
				}
				else if(sel == 3) {
					for(int i = 0; i<lotto3.length; i++) {
						if(lotto3[i] == 7 && lotto3[i+1] == 7 && lotto3[i+2] == 7) {
						 cnt3++;
						}
					}
					if(cnt3 >= 1) {
						System.out.println("3번복권 당첨!!");
					}
					else {
						System.out.println("3번복권 꽝~!");
					}
						
				}
				else if(sel == 0) {
					break;
					
				}
				
			}
	}
}
	
