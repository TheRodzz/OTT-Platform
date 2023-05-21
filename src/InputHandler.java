import java.sql.Date;
import java.util.Scanner;

public class InputHandler {

    public static Media getMediaInput(Scanner scanner) {

        System.out.println("Enter the media duration:");
        int duration = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the media title:");
        String title = scanner.nextLine();

        System.out.println("Enter the media release date in yyyy-MM-dd format:");
        String releaseDate = scanner.nextLine();

        System.out.println("Enter the media poster URL:");
        String posterUrl = scanner.nextLine();

        System.out.println("Enter the media trailer URL:");
        String trailerUrl = scanner.nextLine();

        return new Media(0, duration, title, releaseDate, posterUrl, trailerUrl);
    }

    public static String pwdInputAndConfirm(Scanner sc) {
        String pass, pass1;
        while (true) {
            System.out.println("Enter new password");
            pass = sc.nextLine();
            System.out.println("Re-enter password");
            pass1 = sc.nextLine();
            if (!pass.equals(pass1)) {
                System.out.println("Password mismatch. Try again");
            } else
                break;
        }
        return pass;
    }
}
