import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 1)
  public void c() {
	  
	  System.out.println("hellotestng_c");
  }
  @Test(enabled = false)
  public void a() {
	  
	  System.out.println("hellotestng");
  }
  @Test
  public void b() {
	  
	  System.out.println("hellotestng");
  }
}
