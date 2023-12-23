package org.example.chapter01_turngame;

public class GameSystem {

    private String name;
    private int hp;
    private int atk;

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getAtk(){
        return atk;
    }
    public void setAtk(int atk){
        this.atk = atk;
    }

    public GameSystem(String name, int hp, int atk){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public void punch (GameSystem enemy){
        System.out.println(name + "이(가)" + enemy.getName() + "에게" + atk + "의 피해를 주었다.");
        enemy.takeDamage(atk);
    }

    private void takeDamage(int damage){
        hp -= damage;
        System.out.println(name + "HP : " + hp + " / 100");
        if (hp <= 0){
            System.out.println(name + "이(가) 쓰러졌다.");
        }
    }
}
