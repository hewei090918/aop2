package com.aop.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 * Created by hew on 2018/2/6.
 */
@UrlBinding("/login")
public class LoginAction extends BaseActionBean{

    @DefaultHandler
    public Resolution index() {
        return new ForwardResolution("WEB-INF/jsp/login.jsp");
    }

}
