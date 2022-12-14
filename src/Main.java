public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int depositAmount = 1100;


        if (depositAmount > 1000) {
            System.out.println("На вашем счете " + (initialAmount + depositAmount + (depositAmount / 100)) + " рублей.");
            System.out.println("Бонус: " + (depositAmount / 100) + " рублей.");

        } else {
            System.out.println("На вашем счете " + (initialAmount + depositAmount) + " рублей.");
            System.out.println("Бонус: 0 рублей.");
        }

    }
}