import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEightBall {
    private EightBall eightBall;

    @Before
    public void before() {
        eightBall = new EightBall();
    }

    @Test
    public void hasAnswers(){
        assertEquals(0, eightBall.getCount());
    }

    @Test
    public void hasAnotherAnswer(){
        eightBall.addResult("Maybe!");
        assertEquals(1, eightBall.getCount());
    }

    @Test
    public void canReturnResults(){
        eightBall.addResult("Yes!");
        eightBall.addResult("No!");
        eightBall.addResult("Go Away!");
        eightBall.addResult("Get Out!");
        System.out.println(eightBall.shake());
        assertNotNull(eightBall.shake());
    }



}
