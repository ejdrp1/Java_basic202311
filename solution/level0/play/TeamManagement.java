package level0.play;

import java.util.Arrays;
import java.util.Scanner;

public class TeamManagement {

    private String[] playerName = new String[0]; // 1. 선수 이름
    private String[] playerPosition = new String[0]; // 2. 선수 포지션
    private int[] playerAge = new int[0]; // 3. 선수 나이

    public static Scanner scanner = new Scanner(System.in);


    private void addPlayer() {
//    1. 선수 추가 (이름, 포지션, 나이)

//        1. 선수 나이
//        1. 복사 배열 생성 (기존 배열 길이 + 1)
        String[] copyPlayerName = new String[playerName.length + 1];
        String[] copyPlayerPosition = new String[playerPosition.length + 1];
        int[] copyPlayerAge = new int[playerAge.length + 1];

        System.out.println("추가할 선수 이름을 입력해주세요.");
        String newPlayerName = scanner.next();
        System.out.println("추가된 선수의 포지션을 입력해주세요.");
        String newPlayerPosition = scanner.next();
        ;
        System.out.println("추가된 선수의 나이를 입력해주세요.");
        int newPlayerAge = scanner.nextInt();

//        2. 복사된 배열에 기존 배열의 데이터 복사
        for (int i = 0; i < playerName.length; i++) {
            copyPlayerName[i] = playerName[i];
            copyPlayerPosition[i] = playerPosition[i];
            copyPlayerAge[i] = playerAge[i];
        }

//        3. 입력 받은 데이터를 복사된 배열에 추가
        copyPlayerName[copyPlayerName.length - 1] = newPlayerName;
        copyPlayerPosition[copyPlayerPosition.length - 1] = newPlayerPosition;
        copyPlayerAge[copyPlayerAge.length - 1] = newPlayerAge;

//        4. 복사된 배열의 주소를 기존 배열의 주소로 변경
        playerName = copyPlayerName;
        playerPosition = copyPlayerPosition;
        playerAge = copyPlayerAge;

//        5.복사된 배열 삭제
        copyPlayerName = null;
        copyPlayerPosition = null;
        copyPlayerAge = null;


//        System.out.println(Arrays.toString(playerName) + " "
//                            + Arrays.toString(playerPosition) + " "
//                            + Arrays.toString(playerAge));

    }


    private void showPlayerInfo() {
        String searchInputPlayerName;
        System.out.print("선수 이름을 입력해주세요 : ");
        searchInputPlayerName = scanner.next();

        for (int i = 0; i < playerName.length; i++) {
            if (playerName[i].equals(searchInputPlayerName)) {
                System.out.println("조회된 선수의 정보입니다.");
                System.out.println("선수 이름 : " + playerName[i]);
                System.out.println("선수 포지션 : " + playerPosition[i]);
                System.out.println("선수 나이 : " + playerAge[i]);
                System.out.println();
                return;
            }
        }

        System.out.println("입력하신 선수가 존재하지 않습니다.");
    }
















    public static void main(String[] args) {

        TeamManagement teamManagement = new TeamManagement();

        System.out.println("환영합니다. JavaFC 입니다.");

        checkpoint: while (true) {
            System.out.println("원하시는 서비스의 번호를 입력해주세요.");
            System.out.println("1.선수 조회 2.선수 추가 3.선수 정보 수정 4.선수 삭제 5.서비스 종료");
            int selectServiceNum = scanner.nextInt();

            switch (selectServiceNum) {
                case 1: teamManagement.showPlayerInfo(); break;
                case 2: teamManagement.addPlayer(); break;
                case 3: break;
                case 4: break;
                case 5: break checkpoint;
            }
        }




    }

}