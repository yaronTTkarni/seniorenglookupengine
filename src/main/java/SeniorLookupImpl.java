public class SeniorLookupImpl {
    private CVAnalyzer cvAnalyzer;

    public void execute( CV candidateCV){

        Preconditions.checkArgument(candidateCV != null, "candidateCV input argument is null" );

        Preconditions.checkArgument(candidateCV.isEmpty(), "candidateCV input argument is empty" );

        cvAnalyzer = new CVAnalyzer(candidateCV);

        Score score = cvAnalyzer.analyze();

        if( score.isSuccess()){
            ApplyForCandidate applyForCandidate = new ApplyForCandidateImpl();
            applyForCandidate.apply(candidateCV);
        }else{
            //TBD
        }
}
