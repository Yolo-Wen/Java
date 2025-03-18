import textClass.Interface.Person;
import textClass.Students;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        reflection();
    }

    //反射示例，主要：getConstructor()、getField()、getMethod()、invoke()
    public static void reflection() throws Exception{
        Person person = new Students();
        //获取Class对象
        Class<? extends Person> clazz = person.getClass();
        //创建对象，
        //表示类的构造函数，getConstructor()获取公共构造函数
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class,int.class);
        Object obj = constructor.newInstance("John",18,100);
        //获取字段(类的属性)
        Field nameField = clazz.getDeclaredField("Name");//getField()获取公共字段，getDeclaredField()获取全部字段，包括私有字段
        nameField.setAccessible(true);//允许访问私有字段
        System.out.println(nameField.get(obj));//获取对象的字段值
        nameField.set(obj,"Tom");//修改/设置字段值
        System.out.println(nameField.get(obj));
        //通过反射获取方法
        Method method = clazz.getMethod("run");//无参方法
        method.invoke(obj);
        Method methodWithArgs = clazz.getMethod("eat", String.class);//获取带参方法
        methodWithArgs.invoke(obj,"apple");

    }
}