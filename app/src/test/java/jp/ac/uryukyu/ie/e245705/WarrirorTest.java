package jp.ac.uryukyu.ie.e245705;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarrirorTest {
    @Test
    public void testAttackWithWeponSkill() {
        int defaultHeroHp = 100;
        Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for (int i = 0; i < 3; i++)
            ;
        int slimeMximumHp = slime.getHitPoint();
        demoHero.attackWithWeponSkill(slime);
        assertEquals(demoHero.getAttack() * 1.5, slimeMximumHp - slime.getHitPoint());

    }
}

/*
 * int defaultHeroHp = 100;
 * Hero demoHero = new Hero("デモ勇者", defaultHeroHp, 100);
 * Enemy slime = new Enemy("スライムもどき", 10, 100);
 * demoHero.attack(slime); // ヒーローが敵を攻撃
 * assertTrue(slime.isDead(), "スライムは倒れているはず。");
 * 
 * int heroHpAfterAttack = demoHero.getHitPoint(); // ヒーローの現在HPを取得
 * slime.attack(demoHero); // 倒れた敵が攻撃（無効のはず）
 * assertEquals(heroHpAfterAttack, demoHero.getHitPoint(), "倒れた敵は攻撃できないはず。");
 * }
 */