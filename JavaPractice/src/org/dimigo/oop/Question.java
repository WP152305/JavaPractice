/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *     |_  Question
 *
 * 1.  개요 :
 * 2.  작성일 :  2017. 3. 31.
 * <pre>
 * 
 * @author  :  김동현
 * @version  : 1.0
 */
public class Question {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	String[] questions = {"1.가장 좋아하는 가수는?","2.가장 좋아하는 배우는?","3.가장 좋아하는 과목은?"};
	String[] answers = {"빅뱅","원빈","응용 프로그래밍"};
	for(int i=0; i<3; i++){
		System.out.println(questions[i]);
		
		String answer = scanner.nextLine();
		
		if(answer!= null&&answer.equals(answers[i])){
			System.out.println("정답입니다!");
		}
		else System.out.println("틀렸습니다!");
		
	}
	scanner.close();
	StringBuilder result = new StringBuilder("<<결과 출력>>");
	StringBuilder result1 = new StringBuilder("가장 좋아하는 가수는?").append(" "+answers[0]).append("입니다.");
	StringBuilder result2 = new StringBuilder("가장 좋아하는 배우는?").append(" "+answers[1]).append("입니다.");
	StringBuilder result3= new StringBuilder("가장 좋아하는 과목은?").append(" "+answers[2]).append("입니다.");
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	

	}

}
