package com.lovo.servlet.mybaits;

/**
 * 角色组装
 */
public class MakeHero {
    private HeroBuilder heroBuilder;
    public  MakeHero(HeroBuilder heroBuilder){
        this.heroBuilder=heroBuilder;
    }
    //角色构建
    public void butil(){
        heroBuilder.buildPymbol();
        heroBuilder.buildKill();
        heroBuilder.buildKien();
    }

    public  Hero getHero(){
        return heroBuilder.createHero();
    }
}
