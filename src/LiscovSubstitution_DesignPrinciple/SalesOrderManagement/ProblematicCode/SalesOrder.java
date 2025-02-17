package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.ProblematicCode;

public class SalesOrder {
    private StateOrder currentState;

    public SalesOrder() {
        this.currentState = new NewOrder(); // Initial state
    }

    public void setState(StateOrder state) {
        this.currentState = state;
    }

    public void AddOrderLine() {
        currentState.AddOrderLine();
    }

    public void Register() {
        currentState.Register();
    }

    public void Grant() {
        currentState.Grant();
    }

    public void Ship() {
        currentState.Ship();
    }

    public void Invoice() {
        currentState.Invoice();
    }

    public void Cancel() {
        currentState.Cancel();
    }
}
