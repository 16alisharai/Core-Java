public class ReverseStringAndCheckPalindrome {
    public static void main(String args[]){

        String str= "heleh";
        int len= str.length();
        String t="";
        for(int i=len-1; i>=0; i--){
            t=t+str.charAt(i);
        }

        System.out.println("\n"+t);
        System.out.println("\n"+str);

        if(str.equalsIgnoreCase(t.trim())){
            System.out.println(" \n Is Palindrome");
        }
        else System.out.println("\n Is not a Palindrome");


    }
}
