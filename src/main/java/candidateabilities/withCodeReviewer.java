package candidateabilities;

public class withCodeReviewer implements CandidateAbility{
    public void able (Score candidateScore){
        if (have_experience_reviewing_code) {
            candidateScore.add(2);
        }
    }
}
