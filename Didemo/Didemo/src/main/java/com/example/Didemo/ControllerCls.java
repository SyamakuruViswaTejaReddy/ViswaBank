package com.example.Didemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerCls {
   // @Autowired- feild injection
   // private ServiceCls serviceCls;

    // Constructor injection
    /* private ServiceCls serviceCls;
    private ControllerCls(ServiceCls serviceCls){
        this.serviceCls = serviceCls;
    } */
    // Setter injection
    private ServiceCls serviceCls;
    @Autowired
    public void setServicecls(ServiceCls serviceCls){
        this.serviceCls=serviceCls;
    }
    public void display(){
        System.out.println("Hello from Controller");
        serviceCls.show();
    }

}
