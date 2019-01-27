import candidateabilities.CandidateAbility;

import java.util.List;

public class CVAnalyzerImpl {
    private CV yourCV;
    private Score score;

    public Score analyze(CV yourCV) {

        Preconditions.checkArgument(yourCV != null, "cv input argument is null");

        Preconditions.checkArgument(yourCV.isEmpty(), "cv input argument is empty");

        this.yourCV = yourCV;
        this.score = new Score();

        if( ! you_wont_to_have_an_impact_on_the_world){
            return this.score.setIrrelevant(true);
        }

        List<CandidateAbility> candidateAbilityList = CandidateAbilityListBuilder.build(yourCV);


        for (CandidateAbility candidateAbility : candidateAbilityList) {
            candidateAbility.able(score);

            if (score.isIrrelvant()) {
                return score;
            }
        }

        return score;
    }
}
