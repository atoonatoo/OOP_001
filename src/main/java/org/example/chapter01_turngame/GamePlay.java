package org.example.chapter01_turngame;

public class GamePlay {
    public static void main(String[] args) {
    GameSystem Player_Air = new GameSystem("Air", 100, 10);
    GameSystem Player_Bidoo = new GameSystem("Bidoo", 110, 10);

    int turn = 1;

    while (Player_Air.getHp() > 0 && Player_Bidoo.getHp() > 0){
        System.out.println("-------" + turn + "턴---------");
        Player_Air.punch(Player_Bidoo);
        Player_Bidoo.punch(Player_Air);
            turn++;
    }
    }
}
