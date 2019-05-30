package com.lovo.servlet.mybaitsTest;

import com.lovo.servlet.mybaits.*;
import org.junit.Test;

public class THero {
    @Test
    public  void testHero(){

//         HeroBuilder hh = new VNBasic();
         HeroBuilder hh = new VNVIP();
         //建造者
        MakeHero mh = new MakeHero(hh);

            mh.butil(); //开始创建
        Hero h = mh.getHero(); //获得英雄
        System.out.printf(h.getKien());
    }
}
