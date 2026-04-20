package exercicios12.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");

        System.out.println("Enter client data:");
        String name = sc.nextLine();
        String email = sc.nextLine();
        Date birthDate = sdf.parse(sc.nextLine());

        System.out.println(birthDate.toString());
    }
}
