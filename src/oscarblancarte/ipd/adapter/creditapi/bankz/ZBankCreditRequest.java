package oscarblancarte.ipd.adapter.creditapi.bankz;

public class ZBankCreditRequest {

    private String clientName;
    private double amount;

    public String getClientrName() {
        return clientName;
    }

    public void setClientrName(String customerName) {
        this.clientName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double requestAmount) {
        this.amount = requestAmount;
    }

}
