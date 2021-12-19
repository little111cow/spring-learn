import com.spring.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void test1(){
    //获得spring容器，需要任何对象直接从容器中取
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
      //获取User对象
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
