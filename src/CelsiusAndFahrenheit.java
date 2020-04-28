import java.util.Scanner;
public class CelsiusAndFahrenheit {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit=(9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius=(5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Menu: \n"+"1. Fahrenheit to Celsius\n"+"2. Celsius to Fahrenheit\n"+"0. Exit\n"+"Enter your choice: ");
        int i=scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("Celsius to Fahrenheit, Input Celsius: ");
                double celsius=scanner.nextDouble();
                System.out.println("Fahrenheit is "+celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.println("Fahrenheit to Celsius, Input Fahrenheit: ");
                double fahrenheit=scanner.nextDouble();
                System.out.println("Celsius is "+fahrenheitToCelsius(fahrenheit));
                break;
            case 0:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Your value input is wrong.");
                break;
        }
    }
}
