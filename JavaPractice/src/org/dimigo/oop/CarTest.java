/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_  CarTest
 *
 * 1.  개요 :
 * 2.  작성일 :  2017. 3. 23.
 * <pre>
 * 
 * @author  :  김동현
 * @version  : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("<<자동차 목록>>");
		System.out.printf("제조사명 : ");
		System.out.println(car.getCompany());
		System.out.printf("모델명 : ");
		System.out.println(car.getModel());
		System.out.printf("색상 : ");
		System.out.println(car.getColor());
		System.out.printf("최대속도 : ");
		System.out.print(car.getMaxSpeed());
		System.out.println("km");
		System.out.printf("가격 : ");
		System.out.printf(String.format("%,d",car.getPrice()));
		System.out.println("원");
		System.out.println();
		Car car2 = new Car();
		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);
		System.out.printf("제조사명 : ");
		System.out.println(car2.getCompany());
		System.out.printf("모델명 : ");
		System.out.println(car2.getModel());
		System.out.printf("색상 : ");
		System.out.println(car2.getColor());
		System.out.printf("최대속도 : ");
		System.out.print(car2.getMaxSpeed());
		System.out.println("km");
		System.out.printf("가격 : ");
		System.out.printf(String.format("%,d",car2.getPrice()));
		System.out.println("원");
		Car car3 = new Car();
		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);
		System.out.println();
		System.out.printf("제조사명 : ");
		System.out.println(car3.getCompany());
		System.out.printf("모델명 : ");
		System.out.println(car3.getModel());
		System.out.printf("색상 : ");
		System.out.println(car3.getColor());
		System.out.printf("최대속도 : ");
		System.out.print(car3.getMaxSpeed());
		System.out.println("km");
		System.out.printf("가격 : ");
		System.out.printf(String.format("%,d",car3.getPrice()));
		System.out.println("원");
		
		
		

	}

}
