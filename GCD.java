import java.util.Scanner; 

public class GCD { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        int a = scanner.nextInt();
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        int b = scanner.nextInt(); 
        scanner.close(); 
        

        int result = gcd(a, b); 
        System.out.println("EL RESULTADO ES: " + result); 
    }

    // Método que implementa el algoritmo de Euclides para encontrar el MCD de dos números
    public static int gcd(int a, int b) {
        while (b != 0) { 
            int temp = a % b; 
            a = b; 
            b = temp; 
        }
        return a; 
    }
}