package groupStageCalculator;

import java.util.*;

public class GroupStageController {

    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        GroupStageView.introProgramInfo();
        GroupStageView.selectStartingNumInfo();
        int selectStartNum = scanner.nextInt();
        selectStartAndEndNum(selectStartNum);
    }

    private void selectStartAndEndNum(int selectStartAndEndNum) {
        switch (selectStartAndEndNum) {
            case 1:
                inputTeamName();
                break;
            case 2:
                GroupStageView.selectProgramEnd();
                return;
        }
    }

    private void inputTeamName() {
        GroupStageView.inputTeamNameInfo();
        setGroupStageTeam();
    }

    private void setGroupStageTeam() {
        String participateTeams = scanner.next();
        String[] participateTeamsArr = participateTeams.split(",");
        List<Team> groupA = new ArrayList<>(); // 조
        Team team;
        for (String teamNames : participateTeamsArr) {
            team = new Team();
            team.setTeamName(teamNames);
            groupA.add(team);
        }
        GroupStageView.introSetGroupStageTeamInfo(groupA);
        groupStage(groupA);
    }

    private void groupStage(List<Team> groupA) {
        Ranking ranking = new Ranking();
        GroupStageView.groupStageInfo(groupA);
    }


}
