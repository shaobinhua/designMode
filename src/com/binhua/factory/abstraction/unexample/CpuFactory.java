package com.binhua.factory.abstraction.unexample;

import com.binhua.factory.abstraction.AmdCpu;
import com.binhua.factory.abstraction.Cpu;
import com.binhua.factory.abstraction.IntelCpu;

/**
 * Created by shaobinhua on 2017/3/13.
 */
public class CpuFactory {
    public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}
