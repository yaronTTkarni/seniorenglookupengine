package candidateabilities;

public class withAbilityToWriteAlgorithms implements CandidateAbility{
    public void able (Score candidateScore){
        if ((have_experience_write_algo_infra or ever_write_dijkstra_algo_or_similar)
        and wont_to_practice_more_on_writing_simple_algo){
            candidateScore.add(10);
        }else{
            candidateScore.setIrrelevant(true);
        }
    }
}