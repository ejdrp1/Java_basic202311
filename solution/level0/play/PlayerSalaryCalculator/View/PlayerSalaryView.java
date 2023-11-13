package level0.play.PlayerSalaryCalculator.View;

public class PlayerSalaryView {

    public void startPlayerSalaryCalculator() {
        System.out.println("안녕하세요. 선수들의 급여를 계산하는 프로그램입니다.");
        System.out.println("주급 => 연봉 / 연봉 => 주급을 계산합니다.");
    }

    public void inputPlayerName() {
        System.out.println("원하는 선수의 이름을 입력해주세요.");
        System.out.print("선수 이름 : ");
    }

    public void selectSalaryType() {
        System.out.println("선수의 주급 또는 연봉을 입력하세요.");
        System.out.println("1.주급 2.연봉");
    }

    public void selectWeeklyPayOfPlayer() {
        System.out.print("주급 입력 : ");
    }
}
