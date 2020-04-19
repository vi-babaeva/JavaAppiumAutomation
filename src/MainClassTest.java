import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
/*
    @Test
    public void testGetClassNumber() {
        int a = this.getClassNumber();

        if (a > 45) {
            System.out.println("True: the number more than 45");
        } else {
            System.out.println("False: the number less or equal to 45");
        }
    }
*/
    @Test
    public void testGetClassString() {
        String s = getClassString();

        boolean word1 = s.contains("Hello");
        boolean word2 = s.contains("hello");

        Assert.assertTrue("This line does not contain the words \"Hello\" or \"hello\" ", word1 || word2);
    }
}
