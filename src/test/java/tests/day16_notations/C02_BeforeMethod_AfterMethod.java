package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeMethod_AfterMethod extends TestBase {
    //Junit'te @BeforeClass ve @AfterClass notasyonuna sahip methodlar
    // static olmak zorundaydi
    //testNG bu zorunluluktan bizi kurtariyor
    /*
     TestNg bize daha fazla before ve after notasyonlari sunar
     diger before/after notasyonlari tanimlayacagimiz
     grup, test veya sut'den once ve sonra calisirlar
     ileride xml dosyalari ile birlikte bunu gorecegiz
     */

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }


    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");

    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");

    }
    @Test
    public void techproTesti() {
        driver.get("https://www.techproeducation.com");

    }
}
