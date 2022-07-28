package oscarblancarte.ipd.adapter.creditapi.bankz;

public class ZBankCreditResponse {

    public boolean approved;

    public boolean isApproved() throws Exception {
        if(approved){
            return approved;
        }else{
            throw new Exception("Credit denied");
        }

    }

    public void setApproved(boolean aproval) {
        this.approved = aproval;
    }

}
