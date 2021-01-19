package step2_01.array;

import java.util.Scanner;

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ArrayEx17_내정답 { //  2020.12.21  1:24 - 

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		
		int[] game = new int[9];
		
		int turn = 1;
		
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("=== 틱택토 ===");
			System.out.println();
			for (int i = 0; i < game.length; i++) {
				System.out.print("[");
				if(game[i] == 1) {
					System.out.print("O");
				}
				else if(game[i] == 2) {
					System.out.print("X");
				}
				else if(game[i] == 0) {
					System.out.print(" ");
				}
				System.out.print("]");
				if((i+1) % 3 == 0) {
					System.out.println();
				}
			}
			
			if(turn % 2 == 1) {
				System.out.print("[p1] 인덱스 입력 : ");
				int choice1 = scan.nextInt();
				
				for (int i = 0; i < game.length; i++) {
					if(game[choice1] == 0) {
						game[choice1] = 1;
						turn++;
					}
				}
			}
			
			else if(turn % 2 == 0) {
				System.out.print("[p2] 인덱스 입력 : ");
				int choice2 = scan.nextInt();
				
				for (int i = 0; i < game.length; i++) {
					if(game[choice2] == 0) {
						game[choice2] = 2;
						turn++;
					}
				}
			}
			
			for (int i = 0; i < game.length; i++) {		
				if(i % 3 == 0) {
					if(game[i] == 1 && game[i+1] == 1 && game[i+3] == 1) {					
							System.out.println("p1 승리!");
							isRun = false;					
					}			
				}
				
				else if(i < 3) {
					if(game[i] == 1 && game[i+3] == 1 && game[i+6] == 1) {
						System.out.println("p1 승리!");
						isRun = false;
					}
				}
				
				else if(game[0] == 1 && game[4] == 1 && game[8] == 1) {
					System.out.println("p1 승리!");
					isRun = false;
				}
				else if(game[2] == 1 && game[4] == 1 && game[6] == 1) {
					System.out.println("p1 승리!");
					isRun = false;
				}
				
			}
		
			
			for (int i = 0; i < game.length; i++) {		
				if(i % 3 == 0) {
					if(game[i] == 2 && game[i+1] == 2 && game[i+3] == 2) {					
						System.out.println("p2 승리!");
						isRun = false;					
					}			
				}
				
				else if(i < 3) {
					if(game[i] == 2 && game[i+3] == 2 && game[i+6] == 2) {
						System.out.println("p2 승리!");
						isRun = false;
					}
				}
				
				else if(game[0] == 2 && game[4] == 2 && game[8] == 2) {
					System.out.println("p2 승리!");
					isRun = false;
				}
				else if(game[2] == 2 && game[4] == 2 && game[6] == 2) {
					System.out.println("p2 승리!");
					isRun = false;
				}
				
			}
			
			
			
		}
		scan.close();
		
	}
		
}
