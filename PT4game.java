
//CHRISTINE ANGELINE FULE
//BSCS 2-1
//PT4 *FINALS*
import java.util.Scanner;

public class PT4game {

        private static Scanner in;

        // Function that implements the
        // number guessing game
        public static void guessingNumberGame() {
                // Scanner Class
                Scanner sc = new Scanner(System.in);

                // Generate the numbers
                int number = 1 + (int) (15 * Math.random());

                // Given A trials
                int A = 6;
                int i, guess;

                System.out.println("\n`````````````````````````````````````````````````````````````````");
                System.out.println("`\t\t\t\t\t\t\t\t`");
                System.out.println("`\t\t\tWELCOME TO GUESSING GAME!\t\t`");
                System.out.println("`\t\t\tby:Christine Fule\t\t\t`");
                System.out.println("`\t\t\tInspired in: Among Us\t\t\t`");
                System.out.println("`\t\t\t\t\t\t\t\t`");
                System.out.println("`````````````````````````````````````````````````````````````````");
                System.out.println(
                                "Among Us is an online multiplayer murder mystery game similar to the popular party game Mafia."
                                                +
                                                "\nIn each battle, a team of players must determine out which of them is a killer extraterrestrial disguised as a human.");
                System.out.println("\nInstruction:");
                System.out.println(
                                "Pretend thatyou are a crewmate and need to find the Impostor of the game to be able to win the game.");
                System.out.println(
                                "Think wisely because this game will test your mind. Goodluck User and Enjoy!");
                System.out.println(
                                "Pick a number from 1 to 15. Guess the number within 6 trials Only to catch the impostor.");
                System.out.println(
                                "\nTASK CARD:\nLocation = Computer Laboratory\nTask = Upload Data\n" +
                                                "*The impostor use the secret decoder to upload the Test Questionnaires in Goupchats of the students and uploaded Online.*"
                                                + "\n\nWho do you think is the Impostor?");
                System.out.println("\n\nAre you ready to play?\n In...3...2...1\n\nSTART!!");
                System.out.println(
                                "SUSPECT LIST:\n[1] Richard\t[2] Juan\t[3] Claudia \n[4] Alexia\t[5] Van\t\t[6] Ciara" +
                                                "\n[7] Mark\t[8] John\t[9] Albert \n[10] Jonas\t[11] Ian \t[12] Tine\n[13] JK\t\t[14] MJ\t\t[15] CK");

                // Iterate over A Trials
                for (i = 0; i < A; i++) {
                        System.out.print("\n\nGuess the number: ");

                        // Take input for guessing
                        guess = sc.nextInt();

                        // If the number is guessed
                        if (number == guess) {
                                System.out.println(
                                                "\nCongratulations! You found the Impostor. Now the Impostor will be reported to the Guidance Office.");
                                break;
                        } else if (number > guess
                                        && i != A - 1) {
                                System.out.println("Oppss your number (" + guess + ") is too LOW. Guess Again. ");
                        } else if (number < guess
                                        && i != A - 1) {
                                System.out.println("Oppss your number (" + guess + ") is too HIGH. Guess Again. ");
                        }
                }
                if (i == A) {
                        System.out.println(
                                        "\nGame Over. You run out of Trial for this round.\nThat was Close yet so Far!!\nThe impostor is "
                                                        + number + "!!");
                }
                System.out.println(
                                "Victims\n[1] Richard\t[2] Juan\t[3] Claudia \n[4] Alexia\t[5] Van\t\t[6] Ciara"
                                                + "\n[7] Mark\t[8] John\t[9] Albert \n[10] Jonas\t[11] Ian \t[12] Tine\n[13] JK\t\t[14] MJ\t\t[15] CK");
        }

        public static void main(String arg[]) {
                // Function Call
                guessingNumberGame();
        }
}