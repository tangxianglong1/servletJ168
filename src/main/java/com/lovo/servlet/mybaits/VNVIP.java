package com.lovo.servlet.mybaits;

/**
 * 构建一个高级英雄
 */
public class VNVIP implements HeroBuilder{
    //持有一个英雄
    Hero  h= new Hero();
    @Override
    public void buildPymbol() {
        h.setPymbol("物理暴击攻击符文");
    }
    @Override
    public void buildKill() {
        h.setKien("终极时刻");
    }

    @Override
    public void buildKien() {
        h.setKien("烈焰美人");
    }

    @Override
    public Hero createHero() {
        return h;

    }

}
