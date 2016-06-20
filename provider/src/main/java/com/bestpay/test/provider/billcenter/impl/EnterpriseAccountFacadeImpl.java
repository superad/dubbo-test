package com.bestpay.test.provider.billcenter.impl;

import com.bestpay.test.provider.billcenter.EcryptMachineException;
import com.bestpay.test.provider.billcenter.EnterpriseBusinessException;
import com.bestpay.test.provider.billcenter.IEnterpriseAccountFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by fgm on 2016/5/30.
 */
@Slf4j
@Service
public class EnterpriseAccountFacadeImpl implements IEnterpriseAccountFacade {

    public static final String SUCCESS="000000";

    public String test() {
        return "Hello Hessian!";
    }

    public String enterpriseAccountChargeAccount(String chargeAccountType, String orgCode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt, String enterprisename) throws EnterpriseBusinessException, EcryptMachineException {
       log.info("enterpriseAccountChargeAccount invoke success!");
        return SUCCESS;
    }

    public String cancelEnterpriseAccounChargeAccount(String orgCode, String enterprisename, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, String oldAcceptTransSeqNo, String oldAcceptTransDate, String oldAcceptTransTime, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt) throws EnterpriseBusinessException, EcryptMachineException {
        log.info("cancelEnterpriseAccounChargeAccount invoke success!");
        return SUCCESS;
    }

    public String consumeEnterpriseAccountNoPassWd(String orgCode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt) throws EnterpriseBusinessException, EcryptMachineException {
        log.info("consumeEnterpriseAccountNoPassWd invoke success!");
        return SUCCESS;
    }

    public String consumeEnterpriseAccountNoPassWdOver(String orgCode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt, String userProductNo) throws EnterpriseBusinessException, EcryptMachineException {
        log.info("consumeEnterpriseAccountNoPassWdOver invoke success!");
        return SUCCESS;
    }

    public String cancelConsumeEnterpriseAccountNoPassWd(String orgcode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, String oldAcceptTransSeqNo, String oldAcceptTransDate, String oldAcceptTransTime, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt) throws EnterpriseBusinessException, EcryptMachineException {
        log.info("cancelConsumeEnterpriseAccountNoPassWd invoke success!");
        return SUCCESS;
    }

    public String queryEnterpriseTxnLogByAccountNo(String accountNo, String txnType, String txnChannel, String startrecord, String maxrecord) throws EnterpriseBusinessException {
        log.info("queryEnterpriseTxnLogByAccountNo invoke success!");
        return SUCCESS;
    }

    public String personalAccountIntoEnterpriseAccountWithSms(String inEnterpriseAccountOrgCode, String inSupplyOrgCode, String outPersonalProductNo, String outPersonalAccountName, String outSupplyOrgCode, String inBusinessType, String intxnType, String intxnDscpt, String outBusinessType, String outtxnType, String outtxnDscpt, String txnChannel, long txnAmount, String inacceptTransSeqNo, String outacceptTransSeqNo, String acceptTransDate, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String payOrgCode, String acceptTransTime, String acceptOperNo, String terminalSeqNo, String terminalNo, String feeFlag, long feeAmt, boolean isSmsSend) {
        log.info("personalAccountIntoEnterpriseAccountWithSms invoke success!");
        return SUCCESS;
    }

    public String enterpriseAccountIntoPersonalAccount(String outEnterpriseAccountOrgCode, String outSupplyOrgCode, String inPersonalProductNo, String inPersonalAccountName, String inSupplyOrgCode, String outBusinessType, String outTxnType, String outTxnDesc, String inBusinessType, String inTxnType, String inTxnDesc, String txnChannel, long txnAmount, String outAcceptTransSeqNo, String inAcceptTransSeqNo, String acceptTransDate, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String payOrgCode, String acceptTransTime, String acceptOperNo, String terminalSeqNo, String terminalNo, String feeFlag, long feeAmt) {
        log.info("enterpriseAccountIntoPersonalAccount invoke success!");
        return SUCCESS;
    }

    public String consumeRefund(String acceptSeqNo, String acceptDate, String acceptTime, String businessType, String oldAcceptOrgCode, String oldAcceptDate, String oldAcceptTime, String oldAcceptSeqNo, String oldTerminalSeqNo, long refundAmount) throws EnterpriseBusinessException, EcryptMachineException {
        log.info("consumeRefund invoke success!");
        return SUCCESS;
    }
}
