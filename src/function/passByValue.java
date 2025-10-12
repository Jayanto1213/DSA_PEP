package function;

import java.util.Scanner;

public class passByValue {
    void doNothing(String s){
        s[0]='j';
        System.out.println(s);


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        passByValue ps= new passByValue();
        String s= "tanu";
        ps.doNothing(s);
        System.out.println(s);
    }
}
