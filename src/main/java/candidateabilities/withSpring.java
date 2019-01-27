package candidateabilities;

public class   withSpring implements CandidateAbility{
    public void able(Score candidateScore){
        if (work_with_spring_fundamentals) {
            candidateScore.add(3);
        }
        if (work_with_spring_boot) {
            candidateScore.add(4);
        }
    }
}