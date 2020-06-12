package Main;
import Calculation.*;
import java.util.Scanner;


/**
 * 가격과 구작, 나이를 입력받고 할인 가격을 출력해 주는 메인 메소드
 * 
 * 
 * @author (2017315002 김아름, 2017315038 이수정, 2018315051  야마모토 요시카) 
 * @version (2020.6.12)
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
        DVDPriceCalculate calc = new DVDPriceCalculate();
        double fee = calc.offThePrice(price, old, age);
        System.out.println("할인 요금은 " + fee + "원입니다.");
    }
}
