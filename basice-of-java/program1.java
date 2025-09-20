import java.util.Scanner;

// ************ Notes ***********
// Class contains everything - has members
// Statements - Telling computer something
// Methods - Do something
// Properties - Store something

// Access modifier (public) - who can use?
// No instance of a class is needed
// Object - instance of a class

public class program1 {
    public static void main(String[] args) { //method
        System.out.println("Hello there!");   
        //System.out.println("Hello " + args[0] + " " + args[1]);   
        // Learn about input 
        // type identifier operator new type() 
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Name enered is " + name);
        String str = new String("This is new string");
        System.out.println(str + " :) ");
        String str2 = "This is easy!" + " :) " + str;
        System.out.println(str2);

        // Data types 
        // 1. Primitive type  - char, short, int, long, float, double
        // 2. Objects - Instance of a class (class is a data type)

        int x = 5; // primitive
        Integer y = 5; // object (5 is autobox)
        System.out.println(x);
        System.out.println(y);
        boolean isPizzaGood = true;
        byte b = 127;  // 8 bit
        char c = 'Z';  // 16 bits
        short s = -2345;  // 16 bit
        int i = 4343123;  // 32 bits
        long l = 34563; // 64 bits
        float fl = 3.124f; // 32 bits
        double d = 432.56; // 64 bits

        System.out.println(isPizzaGood + " " + b + " " + c + " " + s + " " + i + " " + l + " " + fl + " " + d);
        System.out.println("Enter any string ");
        String str3 = sc.nextLine();
        System.out.println(str3);
        System.out.println("Enter any Number ");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("Byte Min value: " + Byte.MIN_VALUE);
        System.out.println("Byte Max value: " + Byte.MAX_VALUE);
        System.out.println("Short Min value: " + Short.MIN_VALUE);
        System.out.println("Short Max value: " + Short.MAX_VALUE);
        System.out.println("Int Min value: " + Integer.MIN_VALUE);
        System.out.println("Int Max value: " + Integer.MAX_VALUE);
        System.out.println("Bool Min value: " + Boolean.FALSE);
        System.out.println("Type: " + Boolean.TYPE);
        System.out.println("Float Min value: " + Float.MIN_VALUE);
        System.out.println("Float Max value: " + Float.MAX_VALUE);
        System.out.println("Double Min value: " + Double.MIN_VALUE);
        System.out.println("Double Max value: " + Double.MAX_VALUE);
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.pow(349999992, 56644444));
        double z = (double)5/2;
        System.out.println(z);

        // precedence -- order of evaluation
        // it is left to right in expression 1st preference is  for * and / and the + and -

        int g = 8;
        int h = 10;
        System.out.println(Integer.max(g, h));
        System.out.println(Integer.compare(h, h));

        String money = "300";
        System.out.println(Integer.parseInt(money)); //  returns primitive
        System.out.println(Integer.valueOf(money));  // returns object
        
    }
}


// Stopped at 1:40 