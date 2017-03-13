package com.binhua.factory.abstraction.example;

import com.binhua.factory.abstraction.Cpu;
import com.binhua.factory.abstraction.IntelCpu;
import com.binhua.factory.abstraction.IntelMainboard;
import com.binhua.factory.abstraction.Mainboard;

/**
 * Created by shaobinhua on 2017/3/13.
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(938);
    }
}
