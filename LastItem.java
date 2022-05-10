import java.util.Scanner;
import java.util.ArrayList;
public class LastItem {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> siblingList = new ArrayList<String>();
        
        System.out.println("Please enter all of your siblings from oldest to youngest. Press Enter x2 to complete the list.");

        for (int i = 0; i < siblingList.size()+1; i++) {
            String sibling = scanner.nextLine();
            if (sibling.isBlank()) {
               
                System.out.println("Your youngest sibling is: " + siblingList.get(i-1));
            } else {
                siblingList.add(sibling);
            }
        }
    }
}
