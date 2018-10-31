package com.springcloud.ribbon.common;

import org.hibernate.validator.resourceloading.PlatformResourceBundleLocator;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/10/30 13:54
 */
public class Constant {

    private static final String FILE_NAME = "parmas_config";  //配置文件名
    private static final String RESP_STATUS_SUCCESS = "resp.status.success";
    private static final String RESP_STATUS_ERROR = "resp.status.error";
    private static final String RESP_STATUS_REPEAT = "resp.status.repeat";
    private static final String RESP_STATUS_PARAMSERR = "resp.status.paramsErr";

    //加载配置文件
    private static ResourceBundle resourceBundle = new PlatformResourceBundleLocator(Constant.FILE_NAME).getResourceBundle(Locale.getDefault());

    public static void main(String[] args) {
        //获取配置文件变量
        String success = resourceBundle.getString(Constant.RESP_STATUS_SUCCESS);
        System.out.println(success);
    }

}
