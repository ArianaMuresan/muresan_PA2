package muresan_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) 
	{
		int i, t;
        int len = 4;
        int [] ori = new int [len];
        int [] newNum = new int [len];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 Digit Code (Format 1 2 3 4)");
        for(i = 0; i < ori.length; i++)
            ori[i] = sc.nextInt();

        System.out.print("The Number You Have Entered Is: ");
        for(i = 0; i < ori.length; i++)
           System.out.print(ori[i]);

        System.out.println();

        for(i = 0; i < ori.length; i++)
            newNum[i] = (ori[i] + 7) % 10;

        t = newNum[0];
        newNum[0] = newNum[2];
        newNum[2] = t;
        t = newNum[1];
        newNum[1] = newNum[3];
        newNum[3] = t;

        System.out.print("Your Encrypted Code Is: ");

        for(i = 0; i < newNum.length; i++)
            System.out.print(newNum[i]);

	}

}
