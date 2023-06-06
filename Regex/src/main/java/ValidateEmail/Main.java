package ValidateEmail;

public class Main {
    public static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail){
            boolean ivalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid : " + ivalid);
        }
        for (String email : invalidEmail){
            boolean ivalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is invalid : " + ivalid);
        }
    }
}
