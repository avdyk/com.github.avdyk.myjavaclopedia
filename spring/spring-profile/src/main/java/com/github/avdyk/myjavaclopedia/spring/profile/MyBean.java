package com.github.avdyk.myjavaclopedia.spring.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyBean {

    private final MyOtherBean otherBean;
    @Autowired
    private Optional<CiProfileBean> prof;

    @Autowired
    public MyBean(MyOtherBean otherBean) {
        this.otherBean = otherBean;
    }

    public String getValue() {
        return this.otherBean.getValue() + prof.map(CiProfileBean::getValue).orElse("-not found-");
    }
}
