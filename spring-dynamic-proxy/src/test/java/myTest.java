import com.spring.Host;
import com.spring.Rent;
import com.spring.proxyinvocationhandler;
import org.junit.Test;

public class myTest {
    @Test
    public void test1(){
        //被代理的角色
        Host host = new Host();
        //动态代理处理程序
        proxyinvocationhandler pih = new proxyinvocationhandler();
        //设置被代理的接口
        pih.setRent(host);
        //获得代理类实列
        Rent proxy = (Rent)pih.getProxy();
        //代理相应方法
        proxy.rent();
    }
}
