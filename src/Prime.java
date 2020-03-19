import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * This program will help determine each prime number upto a given number and
 * determine a number's prime factors.
 *
 * Inspired by the following link:
 * https://projecteuler.net/problem=3
 *
 * Example:
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 *
 * author: Frank Giordano
 */
public class Prime {

    public static void main(String[] args) throws IOException {

        Long num = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter a number to determine each prime up to the number:");
        try {
            num = Long.parseLong(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Error make sure to enter a number.");
            System.exit(1);
        }
        PrimeArray primeArray = new PrimeArray(num);
        System.out.println(primeArray.getPrimeArrayNums());

        System.out.println("\nEnter a number to determine it's prime factors:");
        try {
            num = Long.parseLong(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Error make sure to enter a number.");
            System.exit(1);
        }
        PrimeFactor primeFactor = new PrimeFactor(num);
        System.out.println(primeFactor.getFactors());
        System.out.println(primeFactor.getPrimeFactor());
    }

}
