import java.util.*;
public class Basesixtyfour
{
  public static  void main(String[] args)
    {
        
        String originalInput = "deadbeef";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println(encodedString);

    }
}
