package com.binhua.decorator.example02;

/**
 * Created by shaobinhua on 2017/4/16.
 */
public class Client {
    public static void main(String[] args) {
        DoProjecter coder = new Employe();

        //以经理的名义将编码完成，功劳都是经理的，实际编码的是工人
        //使用DoProjecter客户端无感知，这种是全透明的
        DoProjecter managerA = new AnxietyManagerA(coder);
        DoProjecter managerB = new PeaceManagerB(coder);
        managerA.doCoding();
        managerB.doCoding();

        //使用具体装饰 客户端需要知道类，这种是半透明的；也称做半装饰、半适配器模式
        AnxietyManagerA managerAA = new AnxietyManagerA(coder);
        managerAA.urgent();

        //装饰模式组合新的类
        RubbishManagerC managerC = new RubbishManagerC(managerAA);
        managerC.criticism();

        RubbishManagerC managerD = new RubbishManagerC(new AnxietyManagerA(new PeaceManagerB(coder)));

    }
}
