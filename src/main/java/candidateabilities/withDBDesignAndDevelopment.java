package candidateabilities;

public class withDBDesignAndDevelopment implements CandidateAbility{
    public void able(Score candidateScore){
        if (have_experience_db_design_and_schema or have_knowledge_how_to_design_db){
            candidateScore.add(2);

            if (work_with_relational_db) {
                candidateScore.add(1);
            }

            if (work_with_nosql_db) {
                candidateScore.add(2);
            }

        }else{
            candidateScore.setIrrelevant(true);
        }
    }
}

