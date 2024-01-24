package Questions;
//https://leetcode.com/problems/defanging-an-ip-address/description/
import java.util.*;

public class DefangingAnIPAddress {
  static String defangIPaddr(String address) {
    return address.replace(".","[.]");
  }

  public static void main(String[] args) {
    String address = "1.1.1.1";
    System.out.println(defangIPaddr(address));
  }
}
