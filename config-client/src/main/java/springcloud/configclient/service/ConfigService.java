package springcloud.configclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/10/31 12:00
 */
@RestController
@RefreshScope
public class ConfigService {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/config")
    public String getConfig(){
        System.out.println("从git仓库或本地仓库获取配置：" + foo);
        return foo;
    }

}
