package Calculation;


/**
 * DVD?κΈμ κ³μ°?? ?λ‘κ·Έ?¨
 * 
 * @author (2018315036 ?? ?,2018315003 μ΅μΈ?, 2018315022 ?΄μ§??°) 
 * @version (2020.06.10)
 */
public class DVDPriceCalculate
{
    /**
     * offThePrice - DVD?κΈμ ? ?Έ?? λ©μ?
     * 
     * @param      price, age, old
     * @return     18?Έ ?΄? price*0.9 / 65?Έ ?΄? price*0.8 / κ΅¬μ price*0.5 
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
