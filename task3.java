
public class task3 {
    public static void main(String[] args) {
        String input = "Java Programming";
        System.out.println("You entered: " + input);
        int len = input.length();
        System.out.println("Length of the string: " + len);
        String upper = input.toUpperCase();
        System.out.println("Uppercase: " + upper);
        String lower = input.toLowerCase();
        System.out.println("Lowercase: " + lower);

        String str="Hello";
        boolean result=str.startsWith("Hel");
        System.out.println(result);

        String str1="Hello World";
        boolean result1=str1.endsWith("ld");    
        System.out.println(result1);

        String str2="Welcome";
        char result2=str2.charAt(3);
        System.out.println(result2);

        String str3="Hello";
        int result3=str3.indexOf('e');  
        System.out.println(result3);



        
    }
}