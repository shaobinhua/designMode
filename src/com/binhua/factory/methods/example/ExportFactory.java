package com.binhua.factory.methods.example;

import com.binhua.factory.methods.ExportFile;

/**
 * Created by shaobinhua on 2017/3/12.
 */
public interface ExportFactory {
    /**
     * 声明了一个工厂方法，要求所有的具体工厂角色都实现这个工厂方法。
     * 参数type表示导出的格式是哪一种结构，如：导出HTML格式有两种结构，一种是标准结构，一种是财务需要的结构
     * 抽象工厂（ExportFactory）角色：担任这个角色的是工厂方法模式的核心，任何在模式中创建对象的工厂类必须实现这个接口。在实际的系统中，这个角色也常常使用抽象类实现。
     * @param type
     * @return
     */
    public ExportFile factory(String type);
}
