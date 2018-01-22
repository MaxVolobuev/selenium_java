import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Parameterization {

    private long number;
    private long expected;

    public  Parameterized(long number, long expected){

        this.number = number;
        this.expected = expected;
    }

   @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{{1,1},{2,2}{3,6}{4,24}{5,120}});
   }

   @Test
    public void test_factorial (){

       Assert.assertEquals("factorial function works wrong", expected, Factorial.factorial(number));
   }


}
