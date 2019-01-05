fun main(args : Array<String>) { 
	println("Hello, world!")        
	var weight = 100;
	var height = 60;
	
	var bMI = (weight * 703) / (height * height);
	System.out.printf ("Your Body Mass Index (BMI) is %d\n\n", bMI);
	
	System.out.println ("BMI VALUES");
	System.out.println ("Underweight: less than 18.5");
	System.out.println ("Normal:      between 18.5 and 24.9");
	System.out.println ("Overweight:  between 25 and 29.9");
	System.out.println ("Obese:       30 or greater");
}