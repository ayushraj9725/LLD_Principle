package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.BetterCode;

public class SalesOrder {
    private OrderState currentState;

    public SalesOrder() {
        this.currentState = new NewOrder(); // Initial state
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void AddOrderLine() {
        currentState.AddOrderLine(this);
    }
    public void Register() {
        currentState.Register(this);
    }
    public void Grant() {
        currentState.Grant(this);
    }
    public void Ship() {
        currentState.Ship(this);
    }
    public void Invoice() {
        currentState.Invoice(this);
    }
    public void Cancel() {
        currentState.Cancel(this);
    }
}
