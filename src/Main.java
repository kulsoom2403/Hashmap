import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        System.out.println("Enter string");
        String str=se.next();
        HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
        char ch;
        int count;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(hmap.containsKey(ch)==false){
                hmap.put(ch,1);

            }
            else{
                count=hmap.get(ch);
                count++;
                hmap.put(ch,count);
            }
        }
        for(Character key:hmap.keySet()){
            System.out.println(key+" = "+hmap.get(key));

        }
        System.out.println("--------------------");
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            count=hmap.get(ch);
            if(count==1)
            {
                System.out.println("first non repeating character in the string "+ch);
                break;

            }
        }
    }
}