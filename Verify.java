import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verify {
   public static void main(String args[]) {
      List emails = new ArrayList();
      emails.add("mouni@gmail.com");
      emails.add("ramu700@gmail.com");
      emails.add("123@google-india.com");
      emails.add("you@domain.com");
      emails.add("me#gmail.com");
      emails.add("@gmail.com");
      
      String regex = "^(.+)@(.+)$";
      Pattern pattern = Pattern.compile(regex);
      
      for (Object email : emails) {
         Matcher matcher = pattern.matcher((CharSequence) email);
         System.out.println(email + " : " + matcher.matches());
      } 
   }
}