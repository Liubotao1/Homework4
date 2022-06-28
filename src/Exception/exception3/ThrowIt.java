package Exception.exception3;

public class ThrowIt {

    // 以使用throws关键字，抛出一个异常。
    //抛出的异常类型，可以是实际异常的父类或者本身。
    //可以抛出多种类型的异常，用逗号分开就可以。
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("abc");
        clazz.getField("");
    }

}
