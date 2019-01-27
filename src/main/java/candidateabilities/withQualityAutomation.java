package candidateabilities;

public class withQualityAutomation implements CandidateAbility{
    public void able (Score candidateScore){
        if (have_experience_with_junit_or_similar_tool) {
            candidateScore.add(2);

            if (have_experience_with_integration_testing_like_restassurred) {
                candidateScore.add(2);
            }

            if (have_experience_with_performance_testing_like_gatling_or_jmeter) {
                candidateScore.add(1);
            }
        } else {
            candidateScore.setIrrelevant(true);
        }
    }
}