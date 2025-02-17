package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.ProblematicCode;

public abstract class StateOrder {

    void AddOrderLine() {
        throw new UnsupportedOperationException("AddOrderLine not supported in this state");
    }
    void Register() {
        throw new UnsupportedOperationException("Register not supported in this state");
    }
    void Grant() {
        throw new UnsupportedOperationException("Grant not supported in this state");
    }
    void Ship() {
        throw new UnsupportedOperationException("Ship not supported in this state");
    }
    void Invoice() {
        throw new UnsupportedOperationException("Invoice not supported in this state");
    }
    void Cancel() {
        throw new UnsupportedOperationException("Cancel not supported in this state");
    }

}
