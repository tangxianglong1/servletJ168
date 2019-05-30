package com.lovo.servlet.mybaits;

/**
 * 构建一个普通英雄
 */
public class VNBasic implements HeroBuilder {
    //持有一个英雄
    Hero  h= new Hero();
    @Override
    public void buildPymbol() { h.setPymbol("物理基本攻击符文"); }
    @Override
    public void buildKill() {
        h.setKien("呻吟弩箭");
    }
    @Override
    public void buildKien() {
        h.setKien("默认皮肤");
    }
    @Override
    public Hero createHero() {
        return h;
    }

}
