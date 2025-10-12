package function;
import java.util.*;


public class functions_passByReference {
    void printName(String name){
        System.out.println("hey "+name);
    }
    int sum(int num1, int num2, int num3){
        int num4= num1+num2+num3;
        return num4;
    }

    int minn(int num1, int num2, int num3){
        if(num1<num2 && num1<num3)return num1;
        else if (num2<num1 && num2<num3) return num2;
        else return num3;



    }

    int maxx(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) return num1;
        else if (num2 > num1 && num2 > num3) return num2;
        else return num3;
    }

    void doSomething(int num){
        System.out.println(num);
        num+=5;
        System.out.println(num);
        num+=5;
        System.out.println(num);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        functions_passByReference fn = new functions_passByReference();

        System.out.println("Enter the name of the Candidate : ");
        String name;
        name = sc.nextLine();
        System.out.println("Enter the second candidate Name : ");
        String name2;
        name2=sc.nextLine();
       fn.printName(name);
       fn.printName(name2);
       int num1,num2,num3;
        System.out.println("Enter the numbers to add and get sum of the numbers :");
       num1=sc.nextInt();
       num2= sc.nextInt();
       num3 = sc.nextInt();
       int res= fn.sum(num1,num2,num3);
        System.out.println(res);

        //using the min and the max functoion for the refernce by value to not reuse the code for the future
        System.out.println("for the minimum  number between the numbers:: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        int minimum = fn.minn(num1,num2,num3);
        System.out.println(minimum);

        //for the maxx math function
        System.out.println("for the maximum number between them :: ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        int maximum = fn.maxx(num1,num2,num3);
        System.out.println(maximum);

        // pass by values
        System.out.println("Enter the num to increase the values by adding 5 : ");
        int num=10;
        fn.doSomething(num);
        System.out.println(num);



    }
}
