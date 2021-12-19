import com.spring.config.myConfig;
import com.spring.entity.Dog;
import com.spring.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myTest {
    @Test
    public void test(){
        //通过javaConfig方式的容器获取方式
        ApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
        User user = context.getBean("user",User.class);
        System.out.println(user);

        Dog dog = context.getBean("dog",Dog.class);
        System.out.println(dog);
    }
}
