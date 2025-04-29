package tudelft.roman;

public class RomanNumeralMain {
    public static void main(String[] args) {
        RomanNumeral rn = new RomanNumeral();

        System.out.println("I = " + rn.convert("I"));
        System.out.println("IV = " + rn.convert("IV"));
        System.out.println("XIII = " + rn.convert("XIII"));
        System.out.println("MCMXC = " + rn.convert("MCMXC"));
    }
}
