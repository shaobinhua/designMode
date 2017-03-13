package com.binhua.factory.abstraction.unexample;

import com.binhua.factory.abstraction.AmdMainboard;
import com.binhua.factory.abstraction.IntelMainboard;
import com.binhua.factory.abstraction.Mainboard;

/**
 * Created by shaobinhua on 2017/3/13.
 */
public class MainboardFactory {
    public static Mainboard createMainboard(int type){
        Mainboard mainboard = null;
        if(type == 1){
            mainboard = new IntelMainboard(755);
        }else if(type == 2){
            mainboard = new AmdMainboard(938);
        }
        return mainboard;
    }
}
