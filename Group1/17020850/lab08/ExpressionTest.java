import java.io.FileNotFoundException;
import java.io.IOException;

public class ExpressionTest {
    public static void main(String args[]) {
        // toan tu thu nhat
        Expression n1 = new Numeral(10);
        Expression n3 = new Numeral(1);
        //binh phương
        Expression s1 = new Square(n1);
        //toan tu thu hai
        Expression n2 = new Numeral(0);
        //phép chia cho 0
        Expression d1 = new Division(n2, s1);
        //phép trừ hai số
        Expression sub = new Subtraction(s1,n3);
        //phep nhan hai so
        Expression m = new Multiplication(n1,n3);
        //phép cộng hai số
        Expression a1 = new Addition(sub, m);
        //bieu thuc
        Expression s2 = new Square(a1);

        System.out.println(n1.toString());
        System.out.println(n2);
        System.out.println(s1.toString());
        System.out.println(a1.evaluate());
        System.out.println(sub);
        System.out.println(sub.evaluate());
        System.out.println(m.toString());
        System.out.println(m.evaluate());
        System.out.println(s2.toString());
        System.out.println(s2.evaluate());
        try {
            System.out.println(d1.evaluate());
        } catch(ArithmeticException e) {
            System.out.println("Lỗi chia cho so 0");
        }
    }

}