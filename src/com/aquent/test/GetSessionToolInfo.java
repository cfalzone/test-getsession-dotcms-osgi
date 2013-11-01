package com.aquent.test;

import org.apache.velocity.tools.view.context.ViewContext;
import org.apache.velocity.tools.view.servlet.ServletToolInfo;

public class GetSessionToolInfo extends ServletToolInfo {

    @Override
    public String getKey () {
        return "testget";
    }

    @Override
    public String getScope () {
        return ViewContext.APPLICATION;
    }

    @Override
    public String getClassname () {
        return GetSessionTool.class.getName();
    }

    @Override
    public Object getInstance ( Object initData ) {

        GetSessionTool viewTool = new GetSessionTool();
        viewTool.init( initData );

        setScope( ViewContext.APPLICATION );

        return viewTool;
    }

}
