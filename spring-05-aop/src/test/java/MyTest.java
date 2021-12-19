import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        动态代理代理的是接口，不是实现类
        UserService userService = context.getBean("userservice", UserService.class);
        userService.delete();
    }
}
