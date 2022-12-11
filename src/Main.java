public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int depositAmount = 3000;


        if (depositAmount > 1000) {
            System.out.println("На вашем счете " + (initialAmount + depositAmount + (depositAmount / 100)) + " рублей.");
        } else {
            System.out.println("На вашем счете " + (initialAmount + depositAmount) + " рублей.");
        }

    }
}