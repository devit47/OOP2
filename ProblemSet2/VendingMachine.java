package ProblemSet2;

public class VendingMachine{
    private int cans, tokens;

    public VendingMachine(){
        this.cans = 0;
        this.tokens = 0;
    }

    public VendingMachine(int cans, int tokens){
        this.cans = cans;
        this.tokens = tokens;
    }

    public void buyCan(){
        if(getCans() > 0){
            setCans(getCans() - 1);
            setTokens(getTokens() + 1);
            System.out.println("Tokens: " + getTokens() + " Cans: " + getCans());
        }else{
            System.out.println("Please wait a moment.. refilling machine.");
            fillUp(10);
            buyCan();
        }
    }

    public void fillUp(int cans){
        setCans(cans);
    }

    public int getCans() {
        return cans;
    }
    public void setCans(int cans) {
        this.cans = cans;
    }

    public int getTokens() {
        return tokens;
    }
    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    public String toString(){
        return "Cans: " + getCans() + " Tokens: " + getTokens();
    }
}