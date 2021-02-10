import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountdownTimer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a first value for countdown timer:");
        int value = Integer.parseInt(reader.readLine());
        Timer countdownTimer1 = Timer.getInstance(value);

        for (int i = countdownTimer1.value; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

        System.out.println("Enter a second value for countdown timer:");
        int value2 = Integer.parseInt(reader.readLine());
        Timer countdownTimer2 = Timer.getInstance(value2);

        if (countdownTimer1.value == countdownTimer2.value) {
            System.out.println("Sorry, but your timer is for one value only!");
        }
    }
}
