import java.math.BigDecimal;

public class Hello {

	public static void main(String[] args) {
		System.out.println("hi");
        //system is a class
		// out is a static field -- it is a printstream object 
		// println is a method 
		
		int value1;
		value1 = 1;
		
		int value2 = 2;
		value2 = (2*3) - value1;
		
		int value3 = value2;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		primitiveDataTypes();
		
		floatingPoint();
		
		intDivideByInt();
		/*
		 *  comments
		 */
		
		markerExample();
		
		booleanType();
		
		charType();
		
		bigDecimalType();
		
		stringBasics();
		
		typeCasting();	
		
		solveAnEquation();
		
		whentoUseWhat();
		
		decisionMaking();
		
		ternaryOperator();
		
		assignmentOperator();
		
		ifElse();
		
		forLoop();
		
		whileLoop();
		
		doWhile();
		
		breakAndContinue();
		
		nestedLoops();
		
		moduloOperator();
		
		int r = methodWithReturnType(6);
		System.out.println(r);
		
		int q = methodWithReturnType(10,20);
		System.out.println(q);
		
		exerciseOnMethod();
	}
   
	private static void exerciseOnMethod() {
		// create a new class that does addition
		//use that class to perform the addition of 2 numbers , 18 and 33;
		
		SumCalculator sumCalculator = new SumCalculator();
		int finalvalue = sumCalculator.addNumbers(18, 33);
		System.out.println(finalvalue);
		
	}

	private static int methodWithReturnType(int i) {
		i = i + 10;
		return i;
	}
	
	private static int methodWithReturnType(int i, int x) {
		return i + x;
	}

	private static void moduloOperator() {
		System.out.println();
		int x = 12;
		
		System.out.println(x%5);
		
	}

	private static void nestedLoops() {
		System.out.println();
		for (int i =0; i<10; i++)
		{
			for (int j = 0; j<10; j++)
			{
				System.out.println(i+j);
			}
		}
		
	}

	private static void breakAndContinue() {
		for (int i =0; i<10; i++)
		{
			
			if (i == 5)
			{
				
				break;
			}
			System.out.println(i);
		}
		
		
		System.out.println();
		
		for (int i =0; i<10; i++)
		{
			
			if (i == 5)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}

	private static void doWhile() {
		int x = 1970;
		System.out.println();
		do {
			System.out.println(x);
			x++;
		}while (x < 1905);
		
	}

	private static void whileLoop() {
		System.out.println();
		int x = 3;
		
		while (x<10)
		{
			System.out.println(x);
			x++;
		}
		
	}

	private static void forLoop() {
		for (int i =0; i<100; i++)
		{
			System.out.println(i);
		}
		
	}

	private static void ifElse() {
		int x = 2;
		
		if (x == 5)
		{
			System.out.println("value is 5");
		}else if (x > 5)
		{
			System.out.println("value is more than 5");
		}else
		{
			System.out.println("value is less than 5");
		}
		
	}

	private static void assignmentOperator() {
		int x = 5; //assignment operator;
		
		System.out.println(x);
	}

	private static void ternaryOperator() {
		boolean x;
		String y;
		x = (3>4)?true:false;
		y = (10>15)?"10 more than 15":"10 not more than 15";
		System.out.println(x);
		System.out.println(y);
		
	}

	private static void decisionMaking() {
		int x = 10;
		
		if (x != 10)
		{
			System.out.println("value not equal tp 10");
		}else
		{
			System.out.println("value is equal to 10");
		}
		
		int y = 18;
		int z = 17;
		
		if (z > y)
		{
			System.out.println("z is more than y");
		}else
		{
			System.out.println("z is equal to or less than y");
		}
		
		
		boolean bool1 = false;
		boolean bool2 = false;
		
		if (bool1 && bool2)
		{
			System.out.println("both are true");
		}else
		{
			System.out.println("either both are false or 1 is false");
		}
	}

	private static void whentoUseWhat() {
		// later..
		
	}

	private static void solveAnEquation() {
		//(a+b)^2 = a^2 + 2ab + b^2; 
		
		// a = int
		
		// b= float 
		
		int a = 2;
		float b = 42.159f;
		double value = a*a + 2*a*b + b*b;
		System.out.println(value);
		System.out.println(((int)(value)));
		
		
	}

	private static void typeCasting() {
		short x = 5;
		int y = x;
		System.out.println(y);
		
		//int x1 = 5;
		//short y2 = x1; --> cannot convert from int to short
		
		System.out.println("good");
		
		int x1 = 5;
		short y2 = (short)x1;
		System.out.println(y2);
		
		//implicit and explicit typecasting
		
		double v2 = 20.0123456789d;
		float v1 = (float)v2;
		System.out.println(v1); //loss of some information
	}

	private static void stringBasics() {
		String var = "Hello World";
		String var2 = "!";
		System.out.println(var+var2);
		
		String var3 = "hello";
		int var4 = 30;
		
		System.out.println(var3+var4);
		
		String var5 = new String("him");
		System.out.println(var5);
		
		
	}

	private static void bigDecimalType() {
		double x = 1.05;
		double y = 2.55;
		
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
		
		System.out.println(x+y);
		System.out.println(d1.add(d2));
	}

	private static void charType() {
		char var = 'a';
		var = '\u0087';
		System.out.println(var);
		
	}

	private static void booleanType() {
		boolean var = false;
		System.out.println(var);
		
	}

	private static void markerExample() {
		int marker = 100;
		marker = 512;
		double percentage = marker * 0.46f;
		System.out.println(percentage + "this is percentage");
		
	}

	private static void intDivideByInt() {
		System.out.println(9/2);
		System.out.println(9f/2f);
		System.out.println(9d/2d);
		
		System.out.println(10f/6f);
		System.out.println(10d/6d);
		
	}

	private static void floatingPoint() {
		float value2 = 9f; //occupies 32
		double value3 = 9d; //occupies 64 bit in memory
		System.out.println(value2);
		System.out.println(value3);
	}

	private static void primitiveDataTypes() {
		int max = 2147483647;
		//int max = 2147483648;
		System.out.println(max);
		
		short maxShort = 32767;
		//short maxShort1 = 32768;
	    System.out.println(maxShort);
	    
	    long longMax = 9223372036854775807L;
	   // long longMax1 = 9223372036854775808L;
	    
	    System.out.println(longMax);
	}

}
