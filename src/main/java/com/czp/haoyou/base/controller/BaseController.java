package com.czp.haoyou.base.controller;


import com.czp.haoyou.base.utils.StateParameter;
import org.springframework.ui.ModelMap;

public abstract class BaseController {

    protected final String success = StateParameter.SUCCESS;
    protected final String  fail = StateParameter.FAULT;

    public ModelMap getModelMap(String status, Object data, String msg){
        ModelMap modelMap=new ModelMap();
        modelMap.put("status", status);
        modelMap.put("data", data);
        modelMap.put("msg", msg);
        return modelMap;
    }


}
