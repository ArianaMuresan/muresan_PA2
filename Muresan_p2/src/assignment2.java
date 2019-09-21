import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double BMIstandard;
		double BMImetric;
		double weight;
		double height;
		int opt;
		
		Scanner sc = new Scanner (System.in);
		
		 
        System.out.print ("Enter Your Weight in Pounds or Kilograms: ");
        weight = sc.nextDouble();
        System.out.println("Enter Your Height In Inches or Meters: ");
        height = sc.nextDouble();
        System.out.println("If you are using the standard system, please enter 1.");
        System.out.println("If you are using the metric system, please enter 2.");
        opt = sc.nextInt();
        
        if (opt == 1)
        {
        	BMIstandard = (weight * 703) / (height * height);
        	System.out.printf("Your Body Mass Index Is: %f\n", BMIstandard);
        }
        
        if (opt == 2)
        {
        	BMImetric = (weight) / (height * height);
    		System.out.printf("Your Body Mass Index is: %f\n", BMImetric);
        }
        
        
        System.out.println("BMI Categories:");
        System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5 – 24.9");
		System.out.println("Overweight = 25 – 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
	}

}
