package com.aop.actions;

import net.sourceforge.stripes.action.*;
import org.apache.log4j.Logger;

/**
 * Created by hew on 2018/2/6.
 */
//Rest风格变参访问
@UrlBinding("/login/{name}")
public class LoginAction extends BaseActionBean{

    private static final long serialVersionUID = 2276458379123668500L;

    Logger logger = Logger.getLogger("LoginAction.class");

    private static final String VIEW = "/WEB-INF/jsp/login.jsp";

    /**
     * 默认跳转页面@DefaultHandler
     * @return
     */
    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution(VIEW);
    }

}
