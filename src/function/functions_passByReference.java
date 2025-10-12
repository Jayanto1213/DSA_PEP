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




    }
}
