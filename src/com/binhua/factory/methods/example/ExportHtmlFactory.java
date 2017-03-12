package com.binhua.factory.methods.example;

import com.binhua.factory.methods.ExportFile;
import com.binhua.factory.methods.ExportFinancialHtmlFile;
import com.binhua.factory.methods.ExportStandardHtmlFile;

/**
 * Created by shaobinhua on 2017/3/12.
 */
public class ExportHtmlFactory implements ExportFactory {
    /**
     * 具体工厂（ExportHtmlFactory、ExportPdfFactory）角色：
     * 担任这个角色的是实现了抽象工厂接口的具体JAVA类。具体工厂角色含有与业务密切相关的逻辑，
     * 并且受到使用者的调用以创建导出类（如：ExportStandardHtmlFile）。
     * @param type
     * @return
     */
    @Override
    public ExportFile factory(String type) {
        // TODO Auto-generated method stub
        if("standard".equals(type)){

            return new ExportStandardHtmlFile();

        }else if("financial".equals(type)){

            return new ExportFinancialHtmlFile();

        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}
