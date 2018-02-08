package com.aop.actions;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.SimpleMessage;

import java.io.Serializable;

/**
 * Created by hew on 2018/2/6.
 */
public abstract class BaseActionBean implements ActionBean, Serializable {

    private static final long serialVersionUID = -1767714708233127983L;

    private ActionBeanContext context;

    // 传递到指定的页面的参数
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public ActionBeanContext getContext() {
        return context;
    }

    @Override
    public void setContext(ActionBeanContext context) {
        this.context = context;
    }

    protected void setMessage(String value) {
        context.getMessages().add(new SimpleMessage(value));
    }

}
