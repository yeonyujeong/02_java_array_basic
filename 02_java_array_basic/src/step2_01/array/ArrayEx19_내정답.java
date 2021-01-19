package step2_01.array;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 *
 * 프로그래밍에서 데이터의 추가는 마지막 데이터의 맨 마지막 뒤에 한다.
 * 데이터들 중간 사이에 새로운 데이터를 추가하는 것은 삽입이라고 한다.
 * 소스를 이해하고 동작해본뒤 정답에 코드를 작성해보자.
 * 
 */

public class ArrayEx19_내정답 {

	public static void main(String[] args) { // 2020.12.22  12:09 - 12:14
		
		
		
		Scanner scan =  new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while(true) {
			
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i] + " ");
			}
			
			System.out.println();
			System.out.println("[1] 추가");
			System.out.print("메뉴선택 : ");
			selectMenu = scan.nextInt();
			
			
			
			if(selectMenu == 1) {
				if(elementCnt == 5) {
					System.out.println("더이상 추가할 수 없습니다.");
					break;
				}
				else {
				System.out.println("추가할 값 입력 : ");
				int index = scan.nextInt();
				
				arr[elementCnt] = index;
				elementCnt++;
				}
				
			}
			
			
			
		}
		
		
		
		
		
	}
	
}
