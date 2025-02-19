import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //1.Write a program to find all of the longest word in a given dictionary.
    static ArrayList longestWords(String[] dictionary) {
        ArrayList list = new ArrayList();
        int longest_length = 0;
for(String st:dictionary){
    int length = st.length();
    if (length > longest_length) {
        longest_length = length;
        list.clear();
} if (length == longest_length) {
        list.add(st);
    }
}
     return list;
    }

    //2.Write a program that displays the number of occurrences of an element in the array.
    public static int countOccurrences(int[] array, int element) {
        int count = 0;
        for (int i : array) {
            if (i == element) {
                count++;}
        }
        return count;
    }
    //4. Create a method to reverse an array of integers. Implement the method without creating a new
    //array.
    public static void revresnumber( int a[] ,int n){

        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
    }

        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);}}
    //        5. Write a menu driven Java program with following options
    int num;
    int[] arrays;
    do{
        System.out.println("Enter the length:");
        num=input.nextInt();
    }while (num<=0);
    arrays=new int[num];
    for(int i=0;i<num;i++){
        System.out.println("enter elment array["+i+"]:");
        arrays[i]=input.nextInt();
    }
        System.out.println("the array is:"+Arrays.toString(arrays));
        System.out.println(arrays[0]);
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
    //6. Create a method that generates a random number within a given range. Allow the user to
    //specify the range and call the method to display random numbers.
    public static void randomOfNumber(int numberMin,int numberMax,int numberRandom ){
        Random random=new Random();
       //int numberR=0;
        for (int i=0;i<numberRandom;i++){
         int numberR=random.nextInt(numberMax);
            System.out.println("Random No : " + numberR);
        }

    }
    //8.. Create a method that generates the Fibonacci sequence up to a specified number of terms.
    public static void fibonacci(int Fibonacci){
        int num1=0;
        int num2=1;
        for(int count=0;count<Fibonacci;count++){
            System.out.println(num1+"");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //1.Write a program to find all of the longest word in a given dictionary.
        String [] animals={ "cat", "dog", "red", "is", "am" };
        System.out.println(longestWords(animals));
        //2Write a program that displays the number of occurrences of an element in the array.
        int[] array = {1,1,1,3,3,5};
        System.out.println("enter number to check:");
        int elementToCount = input.nextInt();
            System.out.println("The element " + elementToCount + " occurs " + countOccurrences(array, elementToCount) + " times in the array.");

        //3.Write a program to find the k largest elements in a given array. Elements in the array can be in
        //any order.
 int [] number={1, 4, 17, 7, 25, 3, 100};
 Arrays.sort(number);
 int k=3;
 int max=number[0];
 for(int i=0;i<number.length;i++){
if(number[i]>max && number.length>=k){
    max=number[i];
}
 }
        System.out.println("the numbers is largedt is:"+number[number.length-1]+","+number[number.length-2] +","+number[number.length-3]);
//4. Create a method to reverse an array of integers. Implement the method without creating a new
//array.
        int[] integers={5,4,3,2,1};
        revresnumber(integers,integers.length);
       // 5. Write a menu driven Java program with following options
        System.out.println("enter number to stop the array:");
        int numbers1=input.nextInt();
        int[]arrayList=new int[numbers1];
        for(int arr=0;arr<numbers1;arr++){
            System.out.println("enter your numbers in arrays or 0 to stop the array:");
         int number2=input.nextInt();
        }

        //6. Create a method that generates a random number within a given range. Allow the user to
        //specify the range and call the method to display random numbers.
        System.out.println("Enter the minimum value of the range: ");
        int numberMin=input.nextInt();
        System.out.println("Enter the maximum value of the range:");
        int numberMax=input.nextInt();
        System.out.println("Enter the number of random numbers to generate:");
        int numberRandom=input.nextInt();
       randomOfNumber(numberMin,numberMax,numberRandom);
       //7. Write a program that checks the strength of a password. Create a method that evaluates a
        //password based on criteria like length, inclusion of special characters, and
        //uppercase/lowercase letters.

        //8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
        //Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
        //and each subsequent number in the sequence is the sum of the two preceding ones.6
        int Fibonacci=10;
        fibonacci(Fibonacci);
    }
}
