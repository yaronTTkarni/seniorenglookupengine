public class Score {
    private int value;
    private boolean irrelevant;
    public int getValue(){
        return  value;
    }

    public void setIrrelevant(boolean irrelevant){
        this.irrelevant = irrelevant;
    }

    @java.lang.Override
    public java.lang.String toString() {
        final java.lang.StringBuilder sb = new java.lang.StringBuilder("Score{");
        sb.append("value=").append(value);
        sb.append(", irrelevant=").append(irrelevant);
        sb.append('}');
        return sb.toString();
    }

    public boolean isSuccess(){
        if(irrelevant){
            return false;
        }
        if(value > 70){
            return true;
        }
        return false;
    }
}
