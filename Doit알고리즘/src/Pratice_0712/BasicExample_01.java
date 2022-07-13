package Pratice_0712;

import java.util.Scanner;

public class BasicExample_01 {

	public static void main(String[] args) {
		// 1. 숫자의 합 구하기
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		
		for(int i =0; i < cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		System.out.println(sum);
		
	}

}
