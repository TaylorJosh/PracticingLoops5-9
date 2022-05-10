import java.util.Scanner;
import java.util.ArrayList;


public class IndexOfInterger {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> playerNumber = new ArrayList<Integer>();

        System.out.println("Please enter all of your favorite players jersey number. Please Enter 0 to complete the list.");

        for (int i = 0; i < playerNumber.size()+1; i++) {
            int jerseyNumber = scanner.nextInt();
            if (jerseyNumber == 0) {
              System.out.println("What jersey number are you looking for in the list?");
                int userInputNum = scanner.nextInt();
                for (int z = 0; z < playerNumber.size(); z++) {
                    if (playerNumber.get(z) == userInputNum) {
                        System.out.println(userInputNum + " is at index " + z);
                    }
                }

            } else {
                playerNumber.add(jerseyNumber);
            }
        }
    }
}
