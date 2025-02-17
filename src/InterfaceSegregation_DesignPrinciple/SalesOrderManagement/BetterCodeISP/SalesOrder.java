package InterfaceSegregation_DesignPrinciple.SalesOrderManagement.BetterCodeISP;

public class SalesOrder {

    private OrderState currentState;

    public SalesOrder() {
        this.currentState = new NewOrder(); // Initial state
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void AddOrderLine() {
        if (currentState instanceof AddOrderLineSupport) {
            ((AddOrderLineSupport) currentState).AddOrderLine(this);
        } else {
            throw new UnsupportedOperationException("AddOrderLine not supported in this state.");
        }
    }

    public void Register() {
        if (currentState instanceof RegisterSupport) {
            ((RegisterSupport) currentState).Register(this);
        } else {
            throw new UnsupportedOperationException("Register not supported in this state.");
        }

    }

    public void Grant() {
        if (currentState instanceof GrantSupport) {
            ((GrantSupport) currentState).Grant(this);
        } else {
            throw new UnsupportedOperationException("Grant not supported in this state.");
        }
    }

    public void Ship() {
        if (currentState instanceof ShipSupport) {
            ((ShipSupport) currentState).Ship(this);
        } else {
            throw new UnsupportedOperationException("Ship not supported in this state.");
        }
    }

    public void Invoice() {
        if (currentState instanceof InvoiceSupport) {
            ((InvoiceSupport) currentState).Invoice(this);
        } else {
            throw new UnsupportedOperationException("Invoice not supported in this state.");
        }
    }

    public void Cancel() {
        if (currentState instanceof CancelSupport) {
            ((CancelSupport) currentState).Cancel(this);
        } else {
            throw new UnsupportedOperationException("Cancel not supported in this state.");
        }
    }


}
