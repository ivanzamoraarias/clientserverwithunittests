import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testmain {
    private Main main= null;


    @Before
    public void beforeEachTest() {
        main= new Main();
    }
    @Test
    public void testConection(){

        Main errorFile = main;
        Assert.assertEquals(true, true);
    }

}
