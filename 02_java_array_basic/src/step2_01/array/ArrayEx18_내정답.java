package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

public class ArrayEx18_내정답 { // 2020.12.21  2:07 - 2:25

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		
		int win1 = 0;	int win2 = 0;					
		
		
		boolean isRun = true;
		
		while(isRun) {
			
			p1[idx1] = 1;	p2[idx2] = 2;

			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < p1.length; i++) {
				System.out.print(p1[i] + " ");
			}
			System.out.println("[" + win1 + "바퀴]");
		
			for (int i = 0; i < p2.length; i++) {
				System.out.print(p2[i] + " ");
			}
			System.out.println("[" +win2 + "바퀴]");
			
			System.out.println();
			
			if(turn % 2 == 0) {
				System.out.println("[p1사용자] 1~3 입력 : ");
				int n = scan.nextInt();
				p1[idx1] = 0;
				idx1 = idx1 + n;
				
				if(idx1 > 7) {
					win1++;
					idx1 = idx1 - 8;
				}
				
				if(idx1 == idx2) {
					System.out.println("[p1사용자] 가 [p2컴퓨터]를 잡았다!");
					p2[idx2] = 0;
					idx2 = 0;
				}
				
				if(win1 == 3) {
					System.out.println("[p1사용자] 승리!");
					isRun = false;
				}
				
				turn++;
			}
			
			else if(turn % 2 == 1) {
					System.out.print("[p2컴퓨터] : ");
					int n = ran.nextInt(3) + 1;
					System.out.println(n);
					p2[idx2] = 0;
					idx2 = idx2 + n;
					
					if(idx2 > 7) {
						win2++;
						idx2 = idx2 - 8;
					}
					
					if(idx2 == idx1) {
						System.out.println("[p2컴퓨터] 가 [p1사용자]를 잡았다!");
						p1[idx1] = 0;
						idx1 = 0;
					}
					
					if(win2 == 3) {
						System.out.println("[p2컴퓨터] 승리!");
						isRun = false;
					}
					
					turn++;
			}
			
			
			
		}
		
		
		
		
		
		
		
		scan.close();
		
	}
}
