package com.example;


import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

public class MainTest {
    @Inject
    private  HelloWorldService service;

    public static void main(String[] args) {
        try {
            MainTest mainTest = new MainTest();
            Module module = new HelloWorldModule();
            Injector injector = Guice.createInjector(module);
            injector.injectMembers(mainTest);//injects the implementation of the service
            mainTest.testGuice();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void testGuice(){
        service.sayHello();
    }
}
