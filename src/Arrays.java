import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,6,5,9,3,1};

        int[] newarr = removeElement(arr);
        for (int i =0; i < newarr.length; i++){
            System.out.print(newarr[i] + "\t" );
        }

    }

    public static int[] removeElement (int[] array) {
        System.out.println("Enter element want remove: ");
        Scanner scanner = new Scanner(System.in);
        int number;
        int index;
        number = scanner.nextInt();

        for (int i = 0; i < array.length ; i++) {
            if (number == array[i]){
                index = i+1;
                for (int j = index-1; j < array.length-1; j++ ){
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
            }
        }
        return array;
    }
}
