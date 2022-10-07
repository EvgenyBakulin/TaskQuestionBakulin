import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       String[] arrayOfString = new String[] {"bob","tom","john","bob"};
       String [] arrayNew = Arrays.stream(arrayOfString).distinct().toArray(String[]::new);
        StringBuilder sb = new StringBuilder();
        for(String i:arrayNew) {
            sb.append(i).append(" ");
        }
         sb.deleteCharAt(sb.length()-1);
         String result = sb.toString();
        System.out.println(result);

    }
}