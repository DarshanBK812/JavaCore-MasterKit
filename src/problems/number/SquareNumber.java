package problems.number;

public class SquareNumber {

    public static void main(String[] args) {
        int num = 25;
        int num2 = num / 2;
        int temp;

        do {
            temp = num2;
            num2 = (temp + (num / temp)) / 2;
        } while (temp != num2);  // Loop continues until guess stabilizes

        System.out.println(num2);  // Approximate square root of num
    }

}

