package jp.ac.uryukyu.ie.e245705;

public class Warrior extends LivingThing {
    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (0 < getHitPoint()) {
            int damage = (int) (getAttack() * (1.5));
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
