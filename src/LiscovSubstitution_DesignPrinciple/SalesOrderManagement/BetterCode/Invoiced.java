package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.BetterCode;

public class Invoiced implements OrderState{
    public void AddOrderLine(SalesOrder order) {
        throw new UnsupportedOperationException("AddOrderLine not supported in Invoiced state.");
    }
    public void Register(SalesOrder order) {
        throw new UnsupportedOperationException("Register not supported in Invoiced state.");
    }
    public void Grant(SalesOrder order) {
        throw new UnsupportedOperationException("Grant not supported in Invoiced state.");
    }
    public void Ship(SalesOrder order) {
        throw new UnsupportedOperationException("Ship not supported in Invoiced state.");
    }
    public void Invoice(SalesOrder order) {
        throw new UnsupportedOperationException("Invoice not supported in Invoiced state.");
    }
    public void Cancel(SalesOrder order) {
        throw new UnsupportedOperationException("Cancel not supported in Invoiced state.");
    }
}
