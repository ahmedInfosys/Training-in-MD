import org.junit.* ;
import static org.junit.Assert.* ;

public class SubscriptionTest {

   @Test
   public void test_returnDollar() {
      System.out.println("Test if pricePerMonth returns Dollars...") ;
      Subscription S = new Subscription(400,4) ;
      assertTrue(S.pricePerMonth() == 100) ;
   }

   @Test
   public void test_roundUp() {
      System.out.println("Test if pricePerMonth rounds up correctly...") ;
      Subscription S = new Subscription(300,3) ;
      assertTrue(S.pricePerMonth() == 100) ;
   }
}
