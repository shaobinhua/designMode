package com.binhua.factory.methods;

/**
 * Created by shaobinhua on 2017/3/12.
 */
public class ExportStandardHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         */
        System.out.println("导出标准HTML文件");
        return true;
    }
}
