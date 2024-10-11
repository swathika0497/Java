package loops;

public class LoopsConcept {

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void advancedPrint(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public void getMonth(int n) {
        switch (n) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febraury");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("Invalid Month");
                break;

        }
    }

    public void printNumber(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    public void printNumberDoWhile(int n) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= n);
    }

    public void gender(String name) {
        if (name == "Swathika") {
            System.out.println("Female");

        } else if (name == "Ashish") {
            System.out.println("Male");
        } else {
            System.out.println("Invalid");
        }

    }
}
