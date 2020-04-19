import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber() {
        int a = this.getClassNumber();

        if (a > 45) {
            System.out.println("True: the number more than 45");
        } else {
            System.out.println("False: the number less or equal to 45");
        }
    }
}
