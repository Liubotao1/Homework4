package Exception.exception2;


public class MustHandel {
    public static void main(String[] args) throws ClassNotFoundException {
       try {
            Class clazz = Class.forName("com.geekbang.exception.MustHandle");
       }
        catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
    }
}
