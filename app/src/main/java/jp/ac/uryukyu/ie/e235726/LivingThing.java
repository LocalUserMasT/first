package jp.ac.uryukyu.ie.e235726;

public class LivingThing {
    private String name;
    private double hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, double hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
    }

    public boolean isDead(){
        return this.dead;
    }

    public void setDead(boolean state){
        dead = state;
    }

    public String getName(){
        return this.name;
    }

    public double getHitPoint(){
        return this.hitPoint;
    }

    public void setHitPoint(double _hitPoint){
        this.hitPoint = _hitPoint;
    }

    public int getAttack(){
        return this.attack;
    }

     

    public void attack(LivingThing opponent){
        if(getHitPoint() > 0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(double damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }


}
