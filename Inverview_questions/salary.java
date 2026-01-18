class salary {
    public static void main(String args[]){


        // CONDITIONALS(IF-ELSE)
        int marks = 46;

        if (marks>=50) {
            System.out.println("this person is pass but we know hes fail bcz i assigned his numbers 😄😎");

            
        } else {
            System.out.println("yeah we know this person is fail no need to tell us hehe");
        }

        int age = 19;
        boolean HasCNIC = true;


        if (age >=18 && HasCNIC == true){
            System.out.println("has cnic and over 18 eligible to vote");
        }else{
            System.out.println("is not eligible to vote");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println("this number is even ");
            } else {
                System.out.println("this number is odd  ");
            }
            
        }
        // reverse iteration
        int num = 0;

        for (int i = 10; i > num; i--) {
            System.out.println(i);
            
        }

        int table = 30;

        for (int i = 0; i <= table ; i++) {
            if (i % 3 == 0) {
                System.out.println("3 X " + i + " = " + i);
                
            }
            
        }

        int num1 = 50;
        int sum = 0;
        for (int i = 0; i <= num1; i++) {

            if (i % 2 == 0){
                sum = sum + i;
            }
            
        }
        System.out.print("the sum of all just " + sum);

        int age1 = 18;
        int marks1 = 19;

        if (age1 >=18 ){
            if (marks1 > 50) {
                System.out.println( "age is" + age1 + "marks is ok passed" + marks1);
                
            }else{
                System.out.println("exam is not passed");
            }
            
        }else{
            System.out.println("not eligible");
        }

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++){
                System.out.println(i + "X" + j + "=" + i*j);
            }
            
        }

























        // OPORATORS
        // int a = 45;
        // int b = 52;

        // int sum = a+b;
        // int difference = a-b;
        // int product = a*b;
        // int Quantiem = a/b;
        // int reminder = a%b;

        // System.out.println("Sum is " + sum);
        // System.out.println("difference is " + difference);
        // System.out.println("product is " +product);
        // System.out.println("Quantiem is " + Quantiem);
        // System.out.println("reminder is " + reminder);



        // VARIABLES
        // String name = ("Amir");
        // int age = 21;
        // double height = 5.3;
        // boolean student = true;

        // System.out.println("name is "+ name);
        // System.out.println("age is " + age);
        // System.out.println("height is "+ height);
        // System.out.println("is Student " + student);
    }

    
}