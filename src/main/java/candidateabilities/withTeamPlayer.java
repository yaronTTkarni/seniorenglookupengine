package candidateabilities;

public class  withTeamPlayer implements CandidateAbility {
    public void able(Score candidateScore) {
        if (learn_from_others and help_teams and share_knowledge&humble){
            candidateScore.add(10);
        }else{
            candidateScore.setIrrelevant(true);
        }
    }
}
