package com.lovo.servlet.mybaits;

public interface HeroBuilder {
    /**
     * 构建符文
     * @return 符文
     */
    public void  buildPymbol();

    /**
     * 构建技能
     * @return 技能
     */
    public void  buildKill();

    /**
     * 构建皮肤
     * @return 皮肤
     */
    public void  buildKien();

    /**
     * 构建英雄
     * @return 英雄
     */
    public Hero createHero();
}
