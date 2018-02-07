package com.aop.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * Created by hew on 2018/2/6.
 */
public abstract class BaseActionBean implements ActionBean{

    private ActionBeanContext context;

    @Override
    public ActionBeanContext getContext() {
        return context;
    }

    @Override
    public void setContext(ActionBeanContext context) {
        this.context = context;
    }
}
