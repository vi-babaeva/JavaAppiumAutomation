import org.junit.Test;

public class MainClass {
    public int getLocalNumber() {
        return 14;
    }

    @Test
    public void testGetLocalNumber() {
        int a = this.getLocalNumber();

        if (a == 14) {
            System.out.println("getLocalNumber return 14 - it's true");
        } else {
            System.out.println("Number is not equal to 14");
        }
    }
}
