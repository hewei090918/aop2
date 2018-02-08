package com.aop.actions;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import org.apache.log4j.Logger;

/**
 * Created by hew on 2018/2/6.
 */
@UrlBinding("/agent/{name}")
public class AgentAction extends BaseActionBean{

    private static final long serialVersionUID = 2276458379123668500L;

    Logger logger = Logger.getLogger("AgentAction.class");

    private static final String VIEW = "/WEB-INF/jsp/module/agent.jsp";

    /**
     * 默认跳转页面@DefaultHandler
     * @return
     */
    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution(VIEW);
    }

}
