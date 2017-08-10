package com.ych.shcm.o2o.service.systemparamholder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.ych.core.model.SystemParameterHolder;
import com.ych.core.service.SystemParameterService;

/**
 * 微信支付的安全密钥
 *
 * Created by U on 2017/7/20.
 */
@Lazy
@Component(WXPaySecurityKey.NAME)
public class WXPaySecurityKey extends SystemParameterHolder {

    public static final String NAME = "shcm.o2o.service.systemparamholder.WXPaySecurityKey";

    public WXPaySecurityKey() {
        setKey("WXPaySecurityKey");
    }

    @Autowired
    @Override
    public void setSystemParameterSvc(SystemParameterService systemParameterSvc) {
        super.setSystemParameterSvc(systemParameterSvc);
    }

    @Value("${system.common.appKey}")
    @Override
    public void setAppKey(String appKey) {
        super.setAppKey(appKey);
    }

}
