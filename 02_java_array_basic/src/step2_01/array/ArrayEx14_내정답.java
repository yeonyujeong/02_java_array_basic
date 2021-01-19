package step2_01.array;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_내정답 { //  2020.12.21   12:19 -

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;
		
		for (int i=0; i<7; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		
		boolean isRun = true;
		
		while(isRun) {
			
			for (int i = 0; i < game.length; i++) {
				if(game[i] == 2) {
					System.out.print("옷 " );
				}
				else {
				System.out.print(game[i] +" ");
				}
			}
			System.out.println();
			System.out.println("숫자(1) 왼쪽이동  , 숫자(2) 오른쪽 이동");
			System.out.println("입력 : ");
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
				for (int i = 0; i < game.length; i++) {
					if(game[i] == 2) {
						if(i > 0) {
						game[i-1] = 2;
						game[i] = 0;
						}						
					}
				}		
			}
			
			else if(choice == 2) {
				for (int i = 0; i < game.length; i++) {
					if(game[i] == 2) {
						if(i < 6) {
							game[i+1] = 2;
							game[i] = 0;
							break;
						}
					}
				}
			}
			
			
			
		}
		
				
	}
	
}
