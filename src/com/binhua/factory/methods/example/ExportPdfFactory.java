package com.binhua.factory.methods.example;

import com.binhua.factory.methods.ExportFile;
import com.binhua.factory.methods.ExportFinancialPdfFile;
import com.binhua.factory.methods.ExportStandardPdfFile;

/**
 * Created by shaobinhua on 2017/3/12.
 */
public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        // TODO Auto-generated method stub
        if("standard".equals(type)){

            return new ExportStandardPdfFile();

        }else if("financial".equals(type)){

            return new ExportFinancialPdfFile();

        }else{
            throw new RuntimeException("没有找到对象");
        }
    }

}
