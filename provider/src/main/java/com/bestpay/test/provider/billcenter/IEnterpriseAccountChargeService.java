package com.bestpay.test.provider.billcenter;


public interface IEnterpriseAccountChargeService {
    /**
     * 充值
     *
     * @param chargeAccountType
     *            充值账户类型 1-资金账户；2-脱机账户
     * @param orgCode
     *            orgcode
     * @param outBusinessType
     *            外部业务类型
     * @param txnType
     *            交易类型
     * @param txnDscpt
     *            交易摘要
     * @param txnChannel
     *            交易渠道
     * @param txnAmount
     *            交易金额
     * @param acceptAreaCode
     *            受理地区代码
     * @param acceptCityCode
     *            受理城市代码
     * @param acceptTransSeqNo
     *            受理机构流水号
     * @param acceptOperNo
     *            受理操作员编号
     * @param acceptTransDate
     *            受理机构交易日期
     * @param acceptTransTime
     *            受理机构交易时间
     * @param resendNum
     *            受理机构重发次数
     * @param acceptOrgCode
     *            受理机构代码
     * @param transferOrgCode
     *            转接机构代码
     * @param payOrgCode
     *            支付机构代码
     * @param supplyOrgCode
     *            出单机构代码
     * @param terminalSeqNo
     *            终端流水号
     * @param terminalNo
     *            终端号
     * @param merchantCode
     *            商户号
     * @param feeFlag
     *            服务收费标识
     * @param feeAmt
     *            服务收费金额
     * @param enterprisename
     *
     *
     * @return 反馈报文 1、成功："000000" 2、失败:"错误代码(6):错误描述"
     */
    public String enterpriseunavailableAccountChargeAccount(String chargeAccountType,
                                                            String orgCode, String outBusinessType, String txnType,
                                                            String txnDscpt, String txnChannel, long txnAmount,
                                                            String acceptAreaCode, String acceptCityCode, String acceptOrgCode,
                                                            String acceptTransSeqNo, String acceptTransDate,
                                                            String acceptTransTime, String acceptOperNo, int resendNum,
                                                            String transferOrgCode, String payOrgCode, String supplyOrgCode,
                                                            String terminalSeqNo, String terminalNo, String merchantCode,
                                                            String feeFlag, long feeAmt, String enterprisename)
            throws EnterpriseBusinessException,EcryptMachineException;




    /**
     * 不可用变可用
     * @param orgCode
     * @param outBusinessType
     * @param txnType
     * @param txnDscpt
     * @param txnChannel
     * @param acceptAreaCode
     * @param acceptCityCode
     * @param acceptOrgCode
     * @param acceptTransSeqNo
     * @param acceptTransDate
     * @param acceptTransTime
     * @param acceptOperNo
     * @param resendNum
     * @param enterprisename
     * @return
     * @throws EnterpriseBusinessException
     */
    public String enterpriseCommitUnavailableAccountCharge(
            String orgCode, long txnAmount, String outBusinessType, String txnType,
            String txnDscpt, String txnChannel,
            String acceptAreaCode, String acceptCityCode, String acceptOrgCode,
            String acceptTransSeqNo, String acceptTransDate,
            String acceptTransTime, String acceptOperNo, int resendNum,
            String enterprisename)
            throws EnterpriseBusinessException;


    /**
     * 充值
     *
     * @param chargeAccountType
     *            充值账户类型 1-资金账户；2-脱机账户
     * @param orgCode
     *            orgcode
     * @param outBusinessType
     *            外部业务类型
     * @param txnType
     *            交易类型
     * @param txnDscpt
     *            交易摘要
     * @param txnChannel
     *            交易渠道
     * @param txnAmount
     *            交易金额
     * @param acceptAreaCode
     *            受理地区代码
     * @param acceptCityCode
     *            受理城市代码
     * @param acceptTransSeqNo
     *            受理机构流水号
     * @param acceptOperNo
     *            受理操作员编号
     * @param acceptTransDate
     *            受理机构交易日期
     * @param acceptTransTime
     *            受理机构交易时间
     * @param resendNum
     *            受理机构重发次数
     * @param acceptOrgCode
     *            受理机构代码
     * @param transferOrgCode
     *            转接机构代码
     * @param payOrgCode
     *            支付机构代码
     * @param supplyOrgCode
     *            出单机构代码
     * @param terminalSeqNo
     *            终端流水号
     * @param terminalNo
     *            终端号
     * @param merchantCode
     *            商户号
     * @param feeFlag
     *            服务收费标识
     * @param feeAmt
     *            服务收费金额
     * @param enterprisename
     *
     * @param isSmsSend 是否发送短信
     *
     *
     * @return 反馈报文 1、成功："000000" 2、失败:"错误代码(6):错误描述"
     */
    public String enterpriseAccountChargeAccountWithSms(String chargeAccountType,
                                                        String orgCode, String outBusinessType, String txnType,
                                                        String txnDscpt, String txnChannel, long txnAmount,
                                                        String acceptAreaCode, String acceptCityCode, String acceptOrgCode,
                                                        String acceptTransSeqNo, String acceptTransDate,
                                                        String acceptTransTime, String acceptOperNo, int resendNum,
                                                        String transferOrgCode, String payOrgCode, String supplyOrgCode,
                                                        String terminalSeqNo, String terminalNo, String merchantCode,
                                                        String feeFlag, long feeAmt, String enterprisename, boolean isSmsSend)
            throws EnterpriseBusinessException,EcryptMachineException;



    /**
     * 充值检查
     *
     * @param chargeAccountType
     *            充值账户类型 1-资金账户；2-脱机账户
     * @param orgCode
     *            orgcode
     * @param outBusinessType
     *            外部业务类型
     * @param txnType
     *            交易类型
     * @param txnDscpt
     *            交易摘要
     * @param txnChannel
     *            交易渠道
     * @param txnAmount
     *            交易金额
     * @param acceptAreaCode
     *            受理地区代码
     * @param acceptCityCode
     *            受理城市代码
     * @param acceptTransSeqNo
     *            受理机构流水号
     * @param acceptOperNo
     *            受理操作员编号
     * @param acceptTransDate
     *            受理机构交易日期
     * @param acceptTransTime
     *            受理机构交易时间
     * @param resendNum
     *            受理机构重发次数
     * @param acceptOrgCode
     *            受理机构代码
     * @param transferOrgCode
     *            转接机构代码
     * @param payOrgCode
     *            支付机构代码
     * @param supplyOrgCode
     *            出单机构代码
     * @param terminalSeqNo
     *            终端流水号
     * @param terminalNo
     *            终端号
     * @param merchantCode
     *            商户号
     * @param feeFlag
     *            服务收费标识
     * @param feeAmt
     *            服务收费金额
     *
     *
     * @return 反馈报文 1、成功："000000" 2、失败:"错误代码(6):错误描述"
     */
    public String enterpriseAccountChargeAccountCheck(String chargeAccountType,
                                                      String orgCode, String outBusinessType, String txnType,
                                                      String txnDscpt, String txnChannel, long txnAmount,
                                                      String acceptAreaCode, String acceptCityCode, String acceptOrgCode,
                                                      String acceptTransSeqNo, String acceptTransDate,
                                                      String acceptTransTime, String acceptOperNo, int resendNum,
                                                      String transferOrgCode, String payOrgCode, String supplyOrgCode,
                                                      String terminalSeqNo, String terminalNo, String merchantCode,
                                                      String feeFlag, long feeAmt, String enterprisename)
            throws EnterpriseBusinessException,EcryptMachineException;




    /**
     * 充值冲正
     *
     * @param chargeAccountType
     *            充值账户类型 1-资金账户；2-脱机账户等等
     * @param orgcode
     *            账户ID
     * @param outBusinessType
     *            外部业务类型
     * @param txnType
     *            交易类型
     * @param txnDscpt
     *            交易摘要
     * @param txnChannel
     *            交易渠道
     * @param txnAmount
     *            交易金额
     * @param acceptAreaCode
     *            受理地区代码
     * @param acceptCityCode
     *            受理城市代码
     * @param acceptOrgCode
     *            受理机构代码
     * @param acceptTransSeqNo
     *            受理机构流水号
     * @param acceptOperNo
     *            受理操作员编号
     * @param acceptTransDate
     *            受理机构交易日期
     * @param acceptTransTime
     *            受理机构交易时间
     * @param resendNum
     *            受理机构重发次数
     * @param transferOrgCode
     *            转接机构代码
     * @param payOrgCode
     *            支付机构代码
     * @param supplyOrgCode
     *            出单机构代码
     * @param terminalSeqNo
     *            终端流水号
     * @param terminalNo
     *            终端号
     * @param merchantCode
     *            商户号
     * @param feeFlag
     *            服务收费标识
     * @param feeAmt
     *            服务收费金额
     *
     *
     * @return 反馈报文 1、成功："000000" 2、失败:"错误代码(6):错误描述"
     */
    public String rollbackEnterpriseAccounChargeAccount(
            String chargeAccountType, String orgcode, String outBusinessType,
            String txnType, String txnDscpt, String txnChannel, long txnAmount,
            String acceptAreaCode, String acceptCityCode, String acceptOrgCode,
            String acceptOperNo, String acceptTransSeqNo,
            String acceptTransDate, String acceptTransTime,
            String oldAcceptTransSeqNo, String oldAcceptTransDate,
            String oldAcceptTransTime, int resendNum, String transferOrgCode,
            String payOrgCode, String supplyOrgCode, String terminalSeqNo,
            String terminalNo, String merchantCode, String feeFlag, long feeAmt);

    /**
     * 充值撤销
     *
     * @param orgCode
     *            账户ID
     * @param outBusinessType
     *            外部业务类型
     * @param txnType
     *            交易类型
     * @param txnDscpt
     *            交易摘要
     * @param txnChannel
     *            交易渠道
     * @param txnAmount
     *            交易金额
     * @param acceptAreaCode
     *            受理地区代码
     * @param acceptCityCode
     *            受理城市代码
     * @param acceptTransSeqNo
     *            受理机构流水号
     * @param acceptOperNo
     *            受理操作员编号
     * @param acceptTransDate
     *            受理机构交易日期
     * @param acceptTransTime
     *            受理机构交易时间
     * @param resendNum
     *            受理机构重发次数
     * @param acceptOrgCode
     *            受理机构代码
     * @param transferOrgCode
     *            转接机构代码
     * @param payOrgCode
     *            支付机构代码
     * @param supplyOrgCode
     *            出单机构代码
     * @param terminalSeqNo
     *            终端流水号
     * @param terminalNo
     *            终端号
     * @param merchantCode
     *            商户号
     * @param feeFlag
     *            服务收费标识
     * @param feeAmt
     *            服务收费金额
     *
     *
     * @return 反馈报文 1、成功："000000" 2、失败:"错误代码(6):错误描述"
     */
    public String cancelEnterpriseAccounChargeAccount(String orgCode,
                                                      String enterprisename, String outBusinessType, String txnType,
                                                      String txnDscpt, String txnChannel, long txnAmount,
                                                      String acceptAreaCode, String acceptCityCode, String acceptOrgCode,
                                                      String acceptTransSeqNo, String acceptTransDate,
                                                      String acceptTransTime, String acceptOperNo,
                                                      String oldAcceptTransSeqNo, String oldAcceptTransDate,
                                                      String oldAcceptTransTime, int resendNum, String transferOrgCode,
                                                      String payOrgCode, String supplyOrgCode, String terminalSeqNo,
                                                      String terminalNo, String merchantCode, String feeFlag, long feeAmt)
            throws EnterpriseBusinessException,EcryptMachineException;

    /**
     * 充值撤销冲正
     **
     * @param chargeAccountType
     *            充值账户类型 1-资金账户；2-脱机账户
     * @param orgcode
     *            账户ID
     * @param outBusinessType
     *            外部业务类型
     * @param txnType
     *            交易类型
     * @param txnDscpt
     *            交易摘要
     * @param txnChannel
     *            交易渠道
     * @param txnAmount
     *            交易金额
     * @param acceptAreaCode
     *            受理地区代码
     * @param acceptCityCode
     *            受理城市代码
     * @param acceptTransSeqNo
     *            受理机构流水号
     * @param acceptOperNo
     *            受理操作员编号
     * @param acceptTransDate
     *            受理机构交易日期
     * @param acceptTransTime
     *            受理机构交易时间
     * @param resendNum
     *            受理机构重发次数
     * @param acceptOrgCode
     *            受理机构代码
     * @param transferOrgCode
     *            转接机构代码
     * @param payOrgCode
     *            支付机构代码
     * @param supplyOrgCode
     *            出单机构代码
     * @param terminalSeqNo
     *            终端流水号
     * @param terminalNo
     *            终端号
     * @param merchantCode
     *            商户号
     * @param feeFlag
     *            服务收费标识
     * @param feeAmt
     *            服务收费金额
     *
     *
     * @return 反馈报文 1、成功："000000" 2、失败:"错误代码(6):错误描述"
     */
    public String rollbackCancelEnterpriseAccounChargeAccount(
            String chargeAccountType, String orgcode, String outBusinessType,
            String txnType, String txnDscpt, String txnChannel, long txnAmount,
            String acceptAreaCode, String acceptCityCode, String acceptOrgCode,
            String acceptTransSeqNo, String acceptTransDate,
            String acceptTransTime, String acceptOperNo,
            String oldAcceptTransSeqNo, String oldAcceptTransDate,
            String oldAcceptTransTime, int resendNum, String transferOrgCode,
            String payOrgCode, String supplyOrgCode, String terminalSeqNo,
            String terminalNo, String merchantCode, String feeFlag, long feeAmt);

    /**
     * 充值，并返回充值后账户余额
     *
     * @param chargeAccountType
     *            充值账户类型 1-资金账户；2-脱机账户
     * @param orgcode
     *            账户ID
     * @param outBusinessType
     *            外部业务类型
     * @param txnType
     *            交易类型
     * @param txnDscpt
     *            交易摘要
     * @param txnChannel
     *            交易渠道
     * @param txnAmount
     *            交易金额
     * @param acceptAreaCode
     *            受理地区代码
     * @param acceptCityCode
     *            受理城市代码
     * @param acceptTransSeqNo
     *            受理机构流水号
     * @param acceptOperNo
     *            受理操作员编号
     * @param acceptTransDate
     *            受理机构交易日期
     * @param acceptTransTime
     *            受理机构交易时间
     * @param resendNum
     *            受理机构重发次数
     * @param acceptOrgCode
     *            受理机构代码
     * @param transferOrgCode
     *            转接机构代码
     * @param payOrgCode
     *            支付机构代码
     * @param supplyOrgCode
     *            出单机构代码
     * @param terminalSeqNo
     *            终端流水号
     * @param terminalNo
     *            终端号
     * @param merchantCode
     *            商户号
     * @param feeFlag
     *            服务收费标识
     * @param feeAmt
     *            服务收费金额
     *
     *
     * @return 反馈报文 1、成功："000000:账户余额（分）" 2、失败:"错误代码(6):错误描述"
     */
    public String chargeAccountWithBalReturn(String chargeAccountType,
                                             String orgcode, String outBusinessType, String txnType,
                                             String txnDscpt, String txnChannel, long txnAmount,
                                             String acceptAreaCode, String acceptCityCode, String acceptOrgCode,
                                             String acceptTransSeqNo, String acceptTransDate,
                                             String acceptTransTime, String acceptOperNo, int resendNum,
                                             String transferOrgCode, String payOrgCode, String supplyOrgCode,
                                             String terminalSeqNo, String terminalNo, String merchantCode,
                                             String feeFlag, long feeAmt);

}
