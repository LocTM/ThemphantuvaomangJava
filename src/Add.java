import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử (n): ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập mảng gồm " + size + " phần tử:");

        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập số cần chèn: ");
        int x = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();

        if (index < 0 || index > array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {

            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;

            System.out.print("Mảng sau khi chèn: ");
            for (int value : array) {
                System.out.print(value + " ");
            }
        }
    }
}

