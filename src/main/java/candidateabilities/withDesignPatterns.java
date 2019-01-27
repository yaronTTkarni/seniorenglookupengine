package candidateabilities;

public class   withDesignPatterns implements CandidateAbility {
    public void able (Score candidateScore){
        if (write_code_use_of_design_pattern or adopted_other_pattern_than_singletone ){
            candidateScore.add(5);
        }else{
            candidateScore.setIrrelevant(true);
        }
    }
}