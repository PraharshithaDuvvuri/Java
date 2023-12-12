import java.util.*;
public class stringtokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hi : this : is : praharshitha"," : ");
        System.out.println("The no of tokens are : "+st.countTokens());
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken()+" ");
        }
        System.out.println();
    }
}
