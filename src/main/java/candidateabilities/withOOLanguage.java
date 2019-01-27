package candidateabilities;

public class   withOOLanguage implements CandidateAbility{
    public void able(Score candidateScore){
        if (expert_with_java) {
            candidateScore.add(7);
        } else if (expert_with_python or expert_with_scala){
            candidateScore.add(5);
        }else if (expert_with_cplusplus or expert_with_csharp or expert_in_anyother_oo_language ){
            candidateScore.add(3);
        }
    }
}
