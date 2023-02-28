import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomStringGenerator {

    private static String randomString;

    public static void main(String[] args) throws InterruptedException {
        generateRandomString();
        while (true) {
            outputRandomStringWithTimestamp();
            TimeUnit.SECONDS.sleep(5);
        }
    }

    private static void generateRandomString() {
        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        randomString = sb.toString();
    }

    private static void outputRandomStringWithTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String timestamp = now.format(formatter);
        System.out.println(timestamp + " " + randomString);
    }
}