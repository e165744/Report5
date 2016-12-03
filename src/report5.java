/**
 * Created by e165744 on 2016/12/03.
 */
public class report5 {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("strはnullです！");
            e.printStackTrace();
        }
    }
}