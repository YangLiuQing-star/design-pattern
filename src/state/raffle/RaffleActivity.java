package state.raffle;

/**
 * 抽奖活动
 */
public class RaffleActivity {

    //表示活动当前的状态，不断变化的
    State state = null;
    //表示奖品的数量
    int count = 0;

    //聚合四种状态，分别是不能抽奖，可以抽奖，发放奖品，奖品领完
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);

    State dispenseState =   new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    /**
     * 初始化当前的状态（为不能抽奖的状态），同时设置奖品的数量
     * @param count
     */
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    /**
     * 调用当前状态的扣积分方法
     */
    public void deductMoney(){
        state.deductMoney();
    }

    /**
     * 调用当前状态的抽奖方法，决定后序的状态
     */
    public void raffle(){
        if(state.raffle()){//如果当前状态为抽奖状态并且抽中奖品，则领取奖品
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 每领取一次奖品，奖品的数量-1
     * @return 当前奖品的数量
     */
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
