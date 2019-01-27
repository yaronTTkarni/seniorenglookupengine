package candidateabilities;


public class  withMsAndIntegrationPatterns implements CandidateAbility {
    public void able(Score candidateScore) {
        if (adopted_micro_service_patterns or adopted_cloud_patterns
        or adopted_distributed_pattern
        or know_what_saga_is
        or know_how_hibrenate_works_behind_the_scenes
        or martin_fowler_is_your_kind
        or read_this_book_Patterns_of_Enterprise_Application_Architecture_or_similar){
            candidateScore.add(3);
        }

        if (developed_micro_services) {
            candidateScore.add(3);

            if (developed_container_docker_or_similar) {
                score.add(2);
            }
        }
    }
}
