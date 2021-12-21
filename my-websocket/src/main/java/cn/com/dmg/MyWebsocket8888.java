package cn.com.dmg;

import org.apache.catalina.Context;
import org.apache.tomcat.websocket.server.WsSci;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "cn.com.dmg")
public class MyWebsocket8888 {
    public static void main(String[] args){
        SpringApplication.run(MyWebsocket8888.class,args);
    }

//    /**
//     * 创建wss协议接口
//     *
//     * @return
//     */
//    @Bean
//    public TomcatContextCustomizer tomcatContextCustomizer() {
//        System.out.println("init");
//        return new TomcatContextCustomizer() {
//            @Override
//            public void customize(Context context) {
//                System.out.println("init   customize");
//                context.addServletContainerInitializer(new WsSci(), null);
//            }
//
//        };
//    }
}

