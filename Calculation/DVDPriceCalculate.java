package Calculation;


/**
 * DVD?��금을 계산?��?�� ?��로그?��
 * 
 * @author (2018315036 ?��?��?��,2018315003 최세?��, 2018315022 ?���??��) 
 * @version (2020.06.10)
 */
public class DVDPriceCalculate
{
    /**
     * offThePrice - DVD?��금을 ?��?��?��?�� 메소?��
     * 
     * @param      price, age, old
     * @return     18?�� ?��?�� price*0.9 / 65?�� ?��?�� price*0.8 / 구작 price*0.5 
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
