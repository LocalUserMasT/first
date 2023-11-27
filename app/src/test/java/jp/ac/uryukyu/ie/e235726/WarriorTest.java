package jp.ac.uryukyu.ie.e235726;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackTest(){
        int defaultWarriorAttack = 50;
        int defaultSlimeHP = 5000;
        Warrior demoWarrior = new Warrior("デモ戦士1", 100, defaultWarriorAttack);
        Enemy slime = new Enemy("スライム1", defaultSlimeHP, 10);

        for(int count = 0;count < 5; count ++){
            demoWarrior.attackWithWeponSkill(slime);
        }

        assertEquals((defaultWarriorAttack * 1.5) * 5,defaultSlimeHP - slime.getHitPoint());

    }
}
