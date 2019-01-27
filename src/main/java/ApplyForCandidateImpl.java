public class ApplyForCandidateImpl implements ApplyForCandidate{
    public apply(CV yourCV){

        Preconditions.checkArgument(yourCV != null, "cv input argument is null" );

        Preconditions.checkArgument(yourCV.isEmpty(), "cv input argument is empty" );

        EmailService.Emailto(From:#yourEmail#, To:Yaron.karni@ecitele.com, CC:yourCV);
    }
}