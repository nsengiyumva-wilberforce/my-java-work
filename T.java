public class T{
    public static void main(String [] args){
        // int x = 10;
        // System.out.println(x++);//10->11
        // System.out.println(++x);//12
        // System.out.println(x--);//12<-11
        // System.out.println(--x);//10

        // int a = 10, b = 10;
        // System.out.println(a++ + ++a);//10->11, 10+ 12=22
        // System.out.println(b++ + b++); //10->11, 10+11=21

        // int a = 10;
        // int b = -10;

        // boolean c = true;
        // boolean d = false;

        // System.out.println(~a);//-11
        // System.out.println(~b);//9
        // System.out.println(!c);
        // System.out.println(!d);

        // System.out.println(10<<2);//40
        // System.out.println(10<<3);//80
        // System.out.println(20<<2);//80
        // System.out.println(15<<4);//240      

        //>>
        // System.out.println(10>>2);//10/(2x2)
        // System.out.println(20>>>2);//20/{2x2}

        //>> vs >>>
        //For potive numbers, they work the same
        // System.out.println(20>>2);
        // System.out.println(20>>>2);

        // //for negative numbers, >>> changes the parity bit to 0 i.e MSB
        // System.out.println(-20>>2);
        // System.out.println(-20>>>2);

        //& checks all the conditions and && doesn't check the second condtion if the first one is false
        // int a = 10;
        // int b = 5;
        // int c = 15;
        // System.out.println(a<b&&a<c);//false
        // System.out.println(a<b&a<c);//false

        //  int a = 10;
        // int b = 5;
        // int c = 20; 

        // System.out.println(a<b&&a++<c);//false  
        // System.out.println(a);//10
        // System.out.println(a<b&a++<c);//false
        // System.out.println(a);//11  

        //Logical || and bitwise |
        // ||doesn'tt check other condition if the first one is true
        //  int a = 10;
        // int b = 5;
        // int c = 20; 

        // // System.out.println(a>b||a<c);//false
        // // System.out.println(a>b|a<c);//false

        // System.out.println(a>b||a++<c);//false  
        // System.out.println(a);//10 because it doesn't check the second condition
        // System.out.println(a>b|a++<c);//false
        // System.out.println(a);//11 coz it checks the second condition

        // int a=2;

        // int b=5;

        // // int min = (a<b)?a:b;

        // // System.out.println(min);

        // int max = (a>b)?a:b;

        // System.out.println(max);

        //assignment operater
        // int a = 10;
        // int b = 20;

        // a+=4;
        // b-=4;

        // System.out.println(a);
        // System.out.println(b);

        // short a = 10;
        // short b = 10;

        // //a+=b;
        // a=a+b;//compile time error becoz 10+10=20 which is now an int
        // System.out.println(a);

       //after typ casting
        // short a = 10;
        // short b = 10;

        // a=(short)(a+b);//compile time error becoz 10+10=20 which is now an int
        // System.out.println(a);

        String[] names = { "Java", "C", "C++", "Python", "Javascript"};
        for(String name:names)
        System.out.println(name);
    }
}