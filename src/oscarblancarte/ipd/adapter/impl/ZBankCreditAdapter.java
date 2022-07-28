package oscarblancarte.ipd.adapter.impl;

import oscarblancarte.ipd.adapter.creditapi.bankz.ZBankCreditAPI;
import oscarblancarte.ipd.adapter.creditapi.bankz.ZBankCreditRequest;
import oscarblancarte.ipd.adapter.creditapi.bankz.ZBankCreditResponse;

public class ZBankCreditAdapter implements IBankAdapter{

    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {

        ZBankCreditRequest zrequest = new ZBankCreditRequest();
        zrequest.setClientrName(request.getCustomer());
        zrequest.setAmount(request.getAmount());

        ZBankCreditAPI api = new ZBankCreditAPI();
        ZBankCreditResponse zresponse = api.sendCreditRequest(zrequest);

        BankCreditResponse response = new BankCreditResponse();
        try {
            response.setApproved(zresponse.isApproved());
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return response;
    }
}
