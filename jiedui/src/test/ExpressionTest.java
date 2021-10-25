package test;

import calculator.Expression;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    @BeforeAll
    void setUp() {
        System.out.println("测试开始");
    }

    @AfterAll
    void tearDown() {
        System.out.println("测试结束");
    }

   public static void main(String[] args) throws Exception {
        /*Expression e1 =new Expression(1);
       Expression e2 =new Expression(2);
       Expression e3 =new Expression(3);
       Expression e4 =new Expression(4);
       Expression e5 =new Expression(5);
       Expression e6 =new Expression(6);
       Expression e7 =new Expression(7);
       Expression e8 =new Expression(8);
       Expression e9 =new Expression(9);
       Expression e10 =new Expression(10);

       System.out.println(e1.getExpression());
       System.out.println(e2.getExpression());
       System.out.println(e3.getExpression());
       System.out.println(e4.getExpression());
       System.out.println(e5.getExpression());
       System.out.println(e6.getExpression());
       System.out.println(e7.getExpression());
       System.out.println(e8.getExpression());
       System.out.println(e9.getExpression());
       System.out.println(e10.getExpression());
*/
       Expression e1 =new Expression("1 + 2 × 3");
       Expression e2 =new Expression("1 × 2 + 3");
       Expression e3 =new Expression("1 + 2 × 3");
       Expression e4 =new Expression("1 + 3 × 2");
       Expression e5 =new Expression("2 + 3 + 1");
       Expression e6 =new Expression("1 + 3 - 2");
       Expression e7 =new Expression("1 - 2 + 3");
       Expression e8 =new Expression("1 ÷ ( 3 + 2 ) ");
       Expression e9 =new Expression(" ( 1 ÷ 3 )  + 2");
       Expression e10 =new Expression("1 ÷ 3 + 2");
       System.out.println("e1 = e2 ?"+e1.equals(e2));
       System.out.println("e1 = e3 ?"+e1.equals(e3));
       System.out.println("e1 = e4 ?"+e1.equals(e4));
       System.out.println("e2 = e3 ?"+e2.equals(e3));
       System.out.println("e2 = e4 ?"+e2.equals(e4));
       System.out.println("e3 = e4 ?"+e3.equals(e4));
       System.out.println("e1 = e5 ?"+e1.equals(e5));
       System.out.println("e6 = e7 ?"+e6.equals(e7));
       System.out.println("e8 = e9 ?"+e8.equals(e9));
       System.out.println("e8 = e10 ?"+e8.equals(e10));
       System.out.println("e9 = e910 ?"+e9.equals(e10));


   }
}