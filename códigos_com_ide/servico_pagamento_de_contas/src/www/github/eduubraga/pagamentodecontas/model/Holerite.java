package www.github.eduubraga.pagamentodecontas.model;

import www.github.eduubraga.pagamentodecontas.payments.PayableDocument;
import www.github.eduubraga.pagamentodecontas.payments.Recipient;

public class Holerite implements PayableDocument {
    private final Recipient employee;
    private final double valueHour;
    private final double amountHours;

    public Holerite(Recipient employee, double valueHour, double amountHours) {
        this.employee = employee;
        this.valueHour = valueHour;
        this.amountHours = amountHours;
    }

    public Recipient getEmployee() {
        return employee;
    }

    public double getValueHour() {
        return valueHour;
    }

    public double getAmountHours() {
        return amountHours;
    }

    @Override
    public double getTotalValue() {
        return getValueHour() * getAmountHours();
    }

    @Override
    public Recipient getRecipient() {
        return getEmployee();
    }
}
