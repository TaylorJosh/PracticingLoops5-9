import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> yearsOfExp = new ArrayList<Integer>();
        
        System.out.println("Please enter your team's years of experience. Press Enter 0 to complete the list.");
        
        for (int i = 0; i < yearsOfExp.size() + 1; i++) {
            int years = scanner.nextInt();
            if (years == 0) {
                for (int a = 0; a < yearsOfExp.size(); a++) {
                    if (a - (yearsOfExp.size() - 1) != 0) {
                        System.out.print(yearsOfExp.get(a) + ", ");
                    } else {
                        System.out.println("and " + yearsOfExp.get(a) + " years of experience.");
                        sum(yearsOfExp);
                    }
                }
            } else {
                yearsOfExp.add(years);
            }
        }
    }

    public static void sum(ArrayList<Integer> yearsOfExp) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int n = 0; n < yearsOfExp.size(); n++) {
            total += yearsOfExp.get(n);
        }
        System.out.println("Altogether, your team has: " + total + " total years of experience.");
        
            }
        }