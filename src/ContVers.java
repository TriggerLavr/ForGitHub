import java.util.Scanner;

public class ContVers
{
    public static void main (String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int u = scanner.nextInt();

        for (int i = u ; i < 30 ; i += 2)
            System.out.println(i);
    }
}

