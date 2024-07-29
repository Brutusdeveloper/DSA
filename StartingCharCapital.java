// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// PS : The name of the public class has to be Main for the code to work

public class StartingCharCapital {
    public static boolean isUpper(int num){
        if(num > 64 && num < 90){
            return true;
        }
        return false;
    }
    public static void firstCharCapital(String str){
        if(str.length() < 1){
            System.out.println("No UpperCase found");
            return ;
        }
         int firstChar = str.charAt(0);
        if(isUpper(firstChar)){
            char ch = (char) firstChar;
            System.out.println(ch);
            return;
        }
        String subStr = str.substring(1, str.length());
        firstCharCapital(subStr);
    }
    public static void main(String[] args) {
        firstCharCapital("geeksforgeeKs");
    }
}
