import java.util.Scanner;

public class Demo1{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        //name.stripLeading();
        //System.out.println(name);
        if (name.length() == 0 ) System.out.printf("\033[31m"+"Invalid name..!\n"+"\033[0m");
        else 
    
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age < 10 || age > 18) System.out.printf("\033[31m"+"Invalid age..!\n"+"\033[0m");
        else

        System.out.print("Enter your subject-01 : ");
        String sub1 = scanner.nextLine();

        
        System.out.print("Enter marks-01 : ");
        double mark1 = scanner.nextDouble();
        scanner.nextLine();


        System.out.print("Enter your subject-02 : ");
        String sub2 = scanner.nextLine();
        
        System.out.print("Enter marks-02 : ");
        double mark2 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Enter your subject-03 : ");
        String sub3 = scanner.nextLine();

        System.out.print("Enter marks-03 : ");
        double mark3 = scanner.nextDouble();
        System.out.printf("\n\n\n\n");



        //Calculate Total
        double total = mark1 + mark2 + mark3;

        //Calculate avg
        double avg = total / 3;

        //define status
        String status;
        if (avg >= 75) status = "\033[34;1m"+"DP"+"\033[0m";
        else if (avg >= 65 ) status = "\033[33;1m"+"CP"+"\033[0m";
        else if (avg >= 55 ) status = "\033[35;1m"+"P"+"\033[0m";
        else status = "\033[31;1m"+"Fail"+"\033[0m";    


        
        String editedName =name.toUpperCase();
        final String SET1 = "\033[35;1m";
        final String precent = "%";
        System.out.printf("NAME     :- %2$s%1$-6s\n"+"\033[0m",editedName,SET1);
        System.out.printf("AGE      :- %d Years old \n",age);
        System.out.printf("STATUS   ;- %s \n",status);
        System.out.printf("TOTAL    :- %1$.2f        AVG  :-%2$.2f%3$s\n",total,avg,precent);

        System.out.printf("\n\n");

        //Create the table

        final String STRING1 = "SUBJECT";
        final String STRING2 = "MARKS";
        final String STRING3 = "STATUS";

        final String ROW = "+"+"-".repeat(12)+"+"+"-".repeat(8)+"+"+"-".repeat(6)+"+";
        final String TITLE = "|%-12s|%-8s|%6s|\n";
        final String RECORD = "|%-12s|%8.2f|%10s|\n";

        System.out.println(ROW);
        System.out.printf(TITLE,STRING1,STRING2,STRING3);
        System.out.println(ROW);
        System.out.printf(RECORD,sub1,mark1,status);
        System.out.println(ROW);
        System.out.printf(RECORD,sub2,mark2,status);
        System.out.println(ROW);
        System.out.printf(RECORD,sub3,mark3,status);
        System.out.println(ROW);
        



        
        


    }
}