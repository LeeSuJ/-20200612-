package Main;
import Calculation.*;
import java.util.Scanner;


/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("가격을 입력해 주세요. >> ");
        double price = scanner.nextDouble();
        System.out.print("나온 지 몇 개월 된 작품인지 숫자만 입력해 주세요. (Ex: 6) >> ");
        int old = scanner.nextInt();
        System.out.print("나이를 입력해 주세요. >> ");
        int age = scanner.nextInt();
        scanner.close();
        double fee = DVDPriceCalculate.offThePrice(price, old, age);
        System.out.println("할인 요금은 " + fee + "원입니다.");
    }
}
