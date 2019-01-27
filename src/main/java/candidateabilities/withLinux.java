package candidateabilities;

public class withLinux implements CandidateAbility{
    public void able (Score candidateScore){
        if (work_with_linux_as_a_user) {
            candidateScore.add(2);

            if (write_linux_shell_script) {
                candidateScore.add(1);
            }
        }
    }
}