import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@RunWith(JUnit4.class)
public class HelloTest {

    @Test
    public void testAnnotation() throws ClassNotFoundException, NoSuchMethodException {
       Class clazz=Class.forName(HelloAnnotation.class.getName());
        Method method=clazz.getDeclaredMethod("toString",null);
        if(method.isAnnotationPresent(MethodInfo.class)){
             MethodInfo mi=method.getAnnotation(MethodInfo.class);
            String author=mi.author();
            String comments=mi.comments();
            String date=mi.date();
            int revision=mi.revision();
            System.out.println(author+","+comments+","+date+","+revision);


        }


    }


    @Test
    public static void test(){

    }

}
