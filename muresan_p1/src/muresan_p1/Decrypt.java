package muresan_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) 
	{
		int i, t;
        int len = 4;
        int [] original = new int [len];
        int [] newNum = new int [len];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Encrypted Code (Format 1 2 3 4)");

        for(i = 0; i < original.length; i++)
            original[i] = sc.nextInt();

        for(i = 0; i < original.length; i++)
            newNum[i] = ((original[i] + 10) - 7) %10;

        t = newNum[0];
        newNum[0] = newNum[2];
        newNum[2] = t;
        t = newNum[1];
        newNum[1] = newNum[3];
        newNum[3] = t;

        System.out.print("Your Decrypted Code Is: ");

        for(i = 0; i < newNum.length; i++)
            System.out.print(newNum[i]);
		

	}

}
