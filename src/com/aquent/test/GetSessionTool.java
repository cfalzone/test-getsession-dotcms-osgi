package com.aquent.test;

import javax.servlet.http.HttpServletRequest;

import org.apache.velocity.tools.view.tools.ViewTool;

import com.aquent.testobjects.TestObject;

public class GetSessionTool implements ViewTool {
    
    public void init(Object initData) { }
    
    public String getFromSession(HttpServletRequest request) {
    	TestObject t = (TestObject) request.getSession().getAttribute("testObject");
    	if(t != null) {
    		return t.getTest();
    	} else {
    		return "Not in Session";
    	}
    }
    

}
