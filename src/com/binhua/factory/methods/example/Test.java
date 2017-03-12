package com.binhua.factory.methods.example;

import com.binhua.factory.methods.ExportFile;

/**
 * Created by shaobinhua on 2017/3/12.
 */
public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String data = "";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
    }
}
