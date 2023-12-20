package baitap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       Nhập mã người chơi
        List <Player> playerList =new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            System.out.println("Nhap thong tin nguoi choi " + i);
            System.out.println("Nhap ma nguoi choi: ");
            String playerCode = scanner.nextLine();
            System.out.println("Nhap ten nguoi choi: ");
            String playerName = scanner.nextLine();


        }
    }
}
