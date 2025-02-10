package ex_16_Array;

public class Lab_139_Sum_Of_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10};
        int sum = 0; // ->12 + 34 + 10 ->56
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }

//        System.out.println(sum);

        System.out.println( "  ---- --- -- ");
        for (int n : numbers){
            sum  = sum+ n;
        }
        System.out.println(sum);


    }
}
