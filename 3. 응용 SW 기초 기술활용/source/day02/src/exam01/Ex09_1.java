package exam01;

public class Ex09_1 {
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 3.0;

        int result = (int)(num1 * num2);  // int num1 -> double
        System.out.printf("%d + %f = %d\n",num1,num2,(int)(num1+num2));
        System.out.printf("%d - %f = %d\n",num1,num2,(int)(num1-num2));
        System.out.printf("%d * %f = %d\n",num1,num2,(int)(num1*num2));
        System.out.printf("%d / %f = %d\n",num1,num2,(int)(num1/num2));
    }
}
