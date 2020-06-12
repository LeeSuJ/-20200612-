package Calculation;


/**
 * DVD요금을 계산하는 프로그램
 * 
 * @author (2018315036 양유석,2018315003 최세원, 2018315022 이지연) 
 * @version (2020.06.10)
 */
public class DVDPriceCalculate
{
    /**
     * offThePrice - DVD요금을 할인하는 메소드
     * 
     * @param      price, age, old
     * @return     18세 이하 price*0.9 / 65세 이상 price*0.8 / 구작 price*0.5 
     */
    public double offThePrice(double price, int age, int old)
    {
        boolean oldDVD = false;
        if (old >= 6){
            oldDVD = true;}
        else{
            oldDVD = false;}

        if(oldDVD == true)
        {
            return price = price * 0.5;
        }
        else if( age <= 18)
        {
            return price = price * 0.9;
        }
        else if (age >= 65 )
        {
            return price = price * 0.8; 
        }
        else
        {
            return price;
        }
    }
}
