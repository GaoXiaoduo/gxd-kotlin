package com.gxd.kotlin.chapter4.innerclass;

/**
 * @author gaoxiaoiduo
 * @version 1.0
 * @date 18/10/16上午9:59
 */
public class InnerClassJava
{
    public String a = "";

    public class Inner
    {
        //静态内部类不持有外部类的引用
        public void hello ()
        {

            System.out.println(InnerClassJava.this.a);
        }
    }

    public static void main (String... args)
    {

        InnerClassJava innerClassJava = new InnerClassJava();
        Inner inner = innerClassJava.new Inner();
    }
}
