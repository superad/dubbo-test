package com.bestpay.test.provider.billcenter.impl;

import com.bestpay.test.provider.billcenter.EcryptMachineException;
import com.bestpay.test.provider.billcenter.EnterpriseBusinessException;
import com.bestpay.test.provider.billcenter.IEnterpriseAccountChargeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by fgm on 2016/5/30.
 */
@Slf4j
@Service
public class EnterpriseAccountChargeServiceImpl implements IEnterpriseAccountChargeService {

    public static final String SUCCESS="000000";

    public String enterpriseunavailableAccountChargeAccount(String chargeAccountType, String orgCode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt, String enterprisename) throws EnterpriseBusinessException, EcryptMachineException {
       log.info("enterpriseunavailableAccountChargeAccount invoke success!");

        return SUCCESS;
    }

    public String enterpriseCommitUnavailableAccountCharge(String orgCode, long txnAmount, String outBusinessType, String txnType, String txnDscpt, String txnChannel, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, int resendNum, String enterprisename) throws EnterpriseBusinessException {
        log.info("enterpriseCommitUnavailableAccountCharge invoke success!");

        return SUCCESS;
    }

    public String enterpriseAccountChargeAccountWithSms(String chargeAccountType, String orgCode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt, String enterprisename, boolean isSmsSend) throws EnterpriseBusinessException, EcryptMachineException {
        log.info("enterpriseAccountChargeAccountWithSms invoke success!");

        return SUCCESS;
    }

    public String enterpriseAccountChargeAccountCheck(String chargeAccountType, String orgCode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt, String enterprisename) throws EnterpriseBusinessException, EcryptMachineException {
        log.info("enterpriseAccountChargeAccountCheck invoke success!");

        return SUCCESS;
    }

    public String rollbackEnterpriseAccounChargeAccount(String chargeAccountType, String orgcode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptOperNo, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String oldAcceptTransSeqNo, String oldAcceptTransDate, String oldAcceptTransTime, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt) {
        log.info("rollbackEnterpriseAccounChargeAccount invoke success!");

        return SUCCESS;
    }

    public String cancelEnterpriseAccounChargeAccount(String orgCode, String enterprisename, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, String oldAcceptTransSeqNo, String oldAcceptTransDate, String oldAcceptTransTime, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt) throws EnterpriseBusinessException, EcryptMachineException {
        log.info("cancelEnterpriseAccounChargeAccount invoke success!");

        return SUCCESS;
    }

    public String rollbackCancelEnterpriseAccounChargeAccount(String chargeAccountType, String orgcode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, String oldAcceptTransSeqNo, String oldAcceptTransDate, String oldAcceptTransTime, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt) {
        log.info("rollbackCancelEnterpriseAccounChargeAccount invoke success!");

        return SUCCESS;
    }

    public String chargeAccountWithBalReturn(String chargeAccountType, String orgcode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt) {
        log.info("chargeAccountWithBalReturn invoke success!");

        return SUCCESS;
    }
}
