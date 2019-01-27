package candidateabilities;


public class enthusiasticDeveloper implements CandidateAbility {

    public void able(Score candidateScore) {
        if (enthusiastic_developer and always_learn and easy_to_adapt_language and love_to_code){
            candidateScore.add(8);
        }else{
            candidateScore.setIrrelevant(true);
        }
    }
}