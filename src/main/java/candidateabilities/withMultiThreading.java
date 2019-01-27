package candidateabilities;

public class   withMultiThreading implements CandidateAbility{
    public void able (Score candidateScore){
        if (have_experience_with_multi_threading or (have_experience_with_parallel
                and have_experience_with_concurrent)){
            candidateScore.add(8);

            if (have_experience_with_actor_model_like_akka) {
                candidateScore.add(2);
            }
        }else{
            candidateScore.setIrrelevant(true);
        }
    }
}