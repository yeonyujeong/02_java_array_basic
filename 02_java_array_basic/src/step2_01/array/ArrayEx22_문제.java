package step2_01.array;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  20번 21번 22번의 문제를 한 코드로 병합하여 보자.
 * 
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 * 
 *  정답 없음
 */


public class ArrayEx22_문제 {

	public static void main(String[] args) { //   2020.12.22   12:42 - 12:52
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			
			
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i] + " ");
			}
			
			System.out.println();
			System.out.println("\n1추가");
			System.out.println("2삭제");
			System.out.println("3삽입");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();
			
			if(selectMenu == 1) {
				
				if(elementCnt == 5) {
					System.out.println("더이상 추가할 수 없습니다.");
					continue;
				}	
				
				System.out.println("추가할 값을 입력해주세요 : ");
				int addData = scan.nextInt();
				
				arr[elementCnt] = addData;
				elementCnt++;
			}
			
			else if(selectMenu == 2) {
				
				if(elementCnt == 0) {
					System.out.println("더이상 삭제할 값이 없습니다.");
					continue;
				}
				
				System.out.println("삭제할 값을 입력해주세요 : ");
				int deleteData = scan.nextInt();
				
				int deleteIdx = -1;
				
				for (int i = 0; i < elementCnt; i++) {
					if(arr[i] == deleteData) {
						deleteIdx = i;
					}
				}
				
				if(deleteIdx == -1) {
					System.out.println("해당 값은 존재하지 않습니다.");
					continue;
				}
				else {
					for (int i = deleteIdx; i < elementCnt - 1; i++) {
						arr[i] = arr[i + 1];
					}
					elementCnt--;
				}
			
			}
			
			else if(selectMenu == 3) {
				
				if(elementCnt == 5) {
					System.out.println("더이상 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.println("삽입할 위치를 입력해주세요 : ");
				int insertIdx = scan.nextInt();
				
				if(insertIdx < 0 || insertIdx >elementCnt) {
					System.out.println("해당 위치엔 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.println("삽입할 값을 입력해주세요 : ");
				int insertData = scan.nextInt();
				
				for (int i = elementCnt; i > insertIdx; i--) {
					arr[i] = arr[i - 1];
				}
				arr[insertIdx] = insertData;
				elementCnt++;			
			}
			
			else if(selectMenu == 4) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			
			
			
			
			
			
		}
		scan.close();
	}
	
}
