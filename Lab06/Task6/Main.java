public class Main{
   public static void main( String args[] ) {
        StaticTest st = new StaticTest();
        System.out.println(" 2 * 2 = " + st.multiply(2,2));
        System.out.println(" 2 + 3 = " + StaticTest.add(2,3));
   }
}