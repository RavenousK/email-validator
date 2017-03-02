public class validate {
public static void main(String[] args) {
 validate test = new validate();
 String email1 = "chicken@yahoo.com";
 String email2 = "bushesofLOVE.";
 String email3 = "stopitnow";
 System.out.println(test.validateEmail(email1));
 System.out.println(test.validateEmail(email2));
 System.out.println(test.validateEmail(email3));
}
public String validateEmail(String email){
 if ((email.contains("@"))||(email.contains("."))) return "This is an email";
 else return "This is not an email";
}
}
