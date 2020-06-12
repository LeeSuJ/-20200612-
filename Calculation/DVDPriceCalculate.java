package Calculation;


/**
 * DVD?š”ê¸ˆì„ ê³„ì‚°?•˜?Š” ?”„ë¡œê·¸?ž¨
 * 
 * @author (2018315036 ?–‘?œ ?„,2018315003 ìµœì„¸?›, 2018315022 ?´ì§??—°) 
 * @version (2020.06.10)
 */
public class DVDPriceCalculate
{
    /**
     * offThePrice - DVD?š”ê¸ˆì„ ?• ?¸?•˜?Š” ë©”ì†Œ?“œ
     * 
     * @param      price, age, old
     * @return     18?„¸ ?´?•˜ price*0.9 / 65?„¸ ?´?ƒ price*0.8 / êµ¬ìž‘ price*0.5 
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
