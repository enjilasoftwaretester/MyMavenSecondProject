package Day2;

import org.testng.annotations.Test;

public class Login 
{
  @Test
  public void ValidLogin() 
  {
	  System.out.println("Login with valid data ");
  }
  @Test
  public void InValidLogin() 
  {
	  System.out.println("Login with invalid data ");
  }
  @Test
  public void BlankLogin() 
  {
	  System.out.println("Login with no data ");
  }
}
