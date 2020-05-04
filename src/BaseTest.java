import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract class BaseTest {

    @BeforeTest
    public void setup(){

    }

    abstract void startTest();

    @AfterTest
    void tearDown(){

    }
}
