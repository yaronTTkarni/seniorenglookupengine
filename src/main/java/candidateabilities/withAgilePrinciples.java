package candidateabilities;

public class withAgilePrinciples implements CandidateAbility {
    public void able(Score candidateScore) {
        if (work_in_agile_teams) {
            candidateScore.add(4);
        }
    }
}
