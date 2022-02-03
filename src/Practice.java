import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /*
        1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        System.out.println("Hello");
        System.out.println("Matías Vera");

        2. Write a Java program to print the sum of two numbers.
        System.out.println(50 + 50);

        3. Write a Java program to divide two numbers and print on the screen.
        System.out.println(50/5);

        5. Write a Java program that takes two numbers as input and display the product of two numbers.
        Scanner in = new Scanner(System.in);

        System.out.println("Primer Número: ");
        int num1 = in.nextInt();

        System.out.println("Segundo Número: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1*num2);


        6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

        Scanner in = new Scanner(System.in);

        System.out.println("Primer Número: ");
        int num1 = in.nextInt();

        System.out.println("Segundo Número: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));

        7. Write a Java program that takes a number as input and prints its multiplication table up to 10.

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        int num1 = in.nextInt();
        for (int i = 1; i<=10; i++) {
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
            }

        8. Write a Java program to display the following pattern.


        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

       9. Write a Java program to compute the specified expressions and print the output

       System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

       10. Write a Java program to compute a specified formula.

       System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

       11. Write a Java program to print the area and perimeter of a circle.

        double radio = 7.5;
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El área es: " + area);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro es: " + perimetro);

       12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = in.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = in.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3 = in.nextInt();

        int sumOfNums = num1 + num2 + num3;
        System.out.println("El promedio es: " + sumOfNums/3);

        13. Write a Java program to print the area and perimeter of a rectangle

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el ancho del rectangulo: ");
        double ancho = in.nextDouble();
        System.out.println("Ingrese el alto del rectangulo: ");
        double alto = in.nextDouble();

        double perimetro = 2*(ancho + alto);
        double area = ancho * alto;

        System.out.printf("El Perimetro es 2*(%.1f + %.1f) = %.2f \n", alto, ancho, perimetro);
        System.out.printf("El Area es %.1f * %.1f = %.2f \n", ancho, alto, area);

        14. Write a Java program to print an American flag on the screen.

        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");

        15. Write a Java program to swap two variables.


        int a, b, temp;

        a = 1;
        b = 2;

        System.out.println("Antes del swap: " + "a = " + a + " y b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Despues del swap: " + "a = " + a + " y b = " + b);

        16. Write a Java program to print a face
        17. Write a Java program to add two binary numbers.


        String binary1, binary2;

        Scanner in = new Scanner(System.in);

        System.out.println("Primer numero binario: ");
        binary1 = in.next();
        System.out.println("Segundo numero binario: ");
        binary2 = in.next();

        int binary1ToInt = Integer.parseInt(binary1, 2);
        int binary2ToInt = Integer.parseInt(binary2, 2);
        int sumOfParsedBinary = binary1ToInt + binary2ToInt;

        System.out.println("num1 : " + Integer.toBinaryString(binary1ToInt));
        System.out.println("num2 : " + Integer.toBinaryString(binary2ToInt));
        System.out.println("num1 + num2 = " + Integer.toBinaryString(sumOfParsedBinary));

        18. Write a Java program to multiply two binary numbers

        String binary1, binary2;

        Scanner in = new Scanner(System.in);

        System.out.println("Primer numero binario: ");
        binary1 = in.next();
        System.out.println("Segundo numero binario: ");
        binary2 = in.next();

        int binary1ToInt = Integer.parseInt(binary1, 2);
        int binary2ToInt = Integer.parseInt(binary2, 2);
        int multOfParsedBinary = binary1ToInt * binary2ToInt;

        System.out.println("num1 : " + Integer.toBinaryString(binary1ToInt));
        System.out.println("num2 : " + Integer.toBinaryString(binary2ToInt));
        System.out.println("num1 * num2 = " + Integer.toBinaryString(multOfParsedBinary));

        19. Write a Java program to convert a decimal number to binary number


        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese numero decimal: ");
        int x = in.nextInt();

        System.out.println("Tu numero en binario es: " + Integer.toBinaryString(x));

         20. Write a Java program to convert a decimal number to hexadecimal number.
         21. Write a Java program to convert a decimal number to octal number.

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese numero decimal: ");
        int x = in.nextInt();

        System.out.println("Tu numero en hexadecimal es: " + Integer.toHexString(x));
        System.out.println("Tu numero en octal es: " + Integer.toOctalString(x));

        22. Write a Java program to convert a binary number to decimal number.
        23. Write a Java program to convert a binary number to hexadecimal number.
        24. Write a Java program to convert a binary number to a Octal number.

        String binary;

        Scanner in = new Scanner(System.in);

        System.out.println("Numero binario: ");
        binary = in.next();
        int binaryToInt = Integer.parseInt(binary,2);

        System.out.println("Numero en decimal: " + binaryToInt);
        System.out.println("Numero en hexadecimal: " + Integer.toHexString(binaryToInt));
        System.out.println("Numero en octal: " + Integer.toOctalString(binaryToInt));

        25. Write a Java program to convert a octal number to a decimal number.
        26. Write a Java program to convert a octal number to a binary number.
        27. Write a Java program to convert a octal number to a hexadecimal number.


        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese numero octal: ");
         String octal = in.next();

         int octalToInt = Integer.parseInt(octal,8);
        System.out.println("Tu numero en decimal: " + octalToInt);
        System.out.println("Tu numero en binario: " + Integer.toBinaryString(octalToInt));
        System.out.println("Tu numero en hexadecimal: " + Integer.toHexString(octalToInt));


        28. Write a Java program to convert a hexadecimal to a decimal number.
        29. Write a Java program to convert a hexadecimal to a binary number.
        30. Write a Java program to convert a hexadecimal to a octal number

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese numero hexadecimal: ");
        String hexa = in.next();

        int hexaToInt = Integer.parseInt(hexa,16);
        System.out.println("Tu numero en decimal: " + hexaToInt);
        System.out.println("Tu numero en binario: " + Integer.toBinaryString(hexaToInt));
        System.out.println("Tu numero en octal: " + Integer.toOctalString(hexaToInt));

        31. Write a Java program to check whether Java is installed on your computer

        System.out.println("\nJava Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");

        32. Write a Java program to compare two numbers.

        */
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = in.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = in.nextInt();

        if (num1 == num2) {
            System.out.printf( "%d == %d\n", num1, num2 );
        }
        if (num1 != num2) {
            System.out.printf( "%d != %d\n", num1, num2 );
        }
        if (num1 > num2) {
            System.out.printf( "%d > %d\n", num1, num2 );
        }
        if (num1 < num2) {
            System.out.printf( "%d < %d\n", num1, num2 );
        }
        if (num1 >= num2) {
            System.out.printf( "%d >= %d\n", num1, num2 );
        }
        if (num1 <= num2) {
            System.out.printf( "%d <= %d\n", num1, num2 );
        }


















        }
}







