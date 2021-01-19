package step2_01.array;

/*
 * # 배열 기본문제
 */

public class ArrayEx03_문제 {

	public static void main(String[] args) { //2020.12.17  12:35 - 12:43
		
		int[] arr = new int[5];
		
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		System.out.println();
		
		// 문제2) 4의 배수만 출력 [ 1번에서 생성한 배열 사용 ]
		// 정답2) 20 40
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println();
		// 문제3) 4의 배수의 합 출력 [ 1번에서 생성한 배열 사용 ]
		// 정답3) 60
		
		int total = 0;
		for (int i = 0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				total = total + arr[i];
			}
		}
		System.out.println("합 : " + total);
		System.out.println();
		
		// 문제4) 4의 배수의 개수 출력 [ 1번에서 생성한 배열 사용 ]
		// 정답4) 2
		
		int cnt = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println("개수 : " + cnt);
		System.out.println();
		
		// 문제5) 짝수의 개수 출력 [ 1번에서 생성한 배열 사용 ]
		// 정답5) 5
		
		cnt = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println("짝수의 개수 : " +  cnt);
		
	}
	
}
