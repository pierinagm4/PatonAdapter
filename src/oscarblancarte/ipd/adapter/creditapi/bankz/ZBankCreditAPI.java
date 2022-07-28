package oscarblancarte.ipd.adapter.creditapi.bankz;

public class ZBankCreditAPI {

    public ZBankCreditResponse sendCreditRequest(ZBankCreditRequest request){
        ZBankCreditResponse response =new ZBankCreditResponse();
        if(request.getAmount()<= 10000){
            response.setApproved(true);
        }else{
            response.setApproved(false);
        }
        return response;
    }

}
