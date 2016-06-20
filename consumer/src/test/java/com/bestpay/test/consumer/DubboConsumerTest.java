package com.bestpay.test.consumer;


import com.caucho.hessian.client.HessianProxyFactory;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Created by perdonare on 2015/12/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:dubbo-consumer.xml")
@Slf4j
public class DubboConsumerTest {


    @Test
    public void testHessianAPI() throws MalformedURLException {

    /*    String serviceUrl = "http://192.178.106.79:9099/hessian/IEnterpriseAccountFacade";
        HessianProxyFactory factory = new HessianProxyFactory();

        IEnterpriseAccountFacade accountFacade = (IEnterpriseAccountFacade) factory.create(IEnterpriseAccountFacade.class, serviceUrl);
        log.info("back==>{}",accountFacade.test());*/

    }

    @Test
    public void testGateWay() throws IOException {
     /*    String url="http://192.178.106.79:9099/GateWayPay";
         HttpPost httpRequst = new HttpPost(url);
         HttpResponse httpResponse = new DefaultHttpClient().execute(httpRequst);
         int status=httpResponse.getStatusLine().getStatusCode();
         if(status==200){
             HttpEntity httpEntity = httpResponse.getEntity();
             String  result = EntityUtils.toString(httpEntity,"UTF-8");//取出应答字符串
             log.info("back==>{}",result);
         }else{
             log.info("errorCode==>{}",status);
         }*/


    }

}
