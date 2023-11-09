public class RewardValue {
    public double cash;
    public static double conv_rate = .0035;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.cash = miles * conv_rate;
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return (int)(cash / conv_rate);
    }
}

