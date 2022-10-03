package ss19_string_regex.thuc_hanh;

public class test {
        private static Email email;
        public static final String[] valiemail=new String[]{ "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        public static final String[] invaliemail=new String[]{ "@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        email=new Email();
        for (String email:valiemail) {
            boolean is=email.validate(email);
            System.out.println("Email is: "+email+" is valid"+ is);
        }
        for (String email:invaliemail) {
            boolean is=email.validate(email);
            System.out.println("Email is "+email+" invaild "+is);
        }
    }
}
