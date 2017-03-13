package com.binhua.factory.abstraction.example;

import com.binhua.factory.abstraction.Cpu;
import com.binhua.factory.abstraction.Mainboard;

/**
 * Created by shaobinhua on 2017/3/13.
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public Mainboard createMainboard();
}
