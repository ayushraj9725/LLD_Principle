package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.BetterCode;

// Common interface for all states
interface OrderState {
    void AddOrderLine(SalesOrder order);
    void Register(SalesOrder order);
    void Grant(SalesOrder order);
    void Ship(SalesOrder order);
    void Invoice(SalesOrder order);
    void Cancel(SalesOrder order);

}
