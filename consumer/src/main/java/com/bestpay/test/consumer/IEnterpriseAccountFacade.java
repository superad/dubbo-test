package com.bestpay.test.consumer;

public interface IEnterpriseAccountFacade {

	String test();
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
	public String enterpriseAccountChargeAccount(String chargeAccountType, String orgCode, String outBusinessType,
												 String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode,
												 String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate,
												 String acceptTransTime, String acceptOperNo, int resendNum, String transferOrgCode, String payOrgCode,
												 String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag,
												 long feeAmt, String enterprisename) throws EnterpriseBusinessException, EcryptMachineException;

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
	public String cancelEnterpriseAccounChargeAccount(String orgCode, String enterprisename, String outBusinessType,
													  String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode,
													  String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate,
													  String acceptTransTime, String acceptOperNo, String oldAcceptTransSeqNo, String oldAcceptTransDate,
													  String oldAcceptTransTime, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode,
													  String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt)
			throws EnterpriseBusinessException, EcryptMachineException;

	/**
	 * 企业账户无密消费
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
	public String consumeEnterpriseAccountNoPassWd(String orgCode, String outBusinessType, String txnType,
												   String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode,
												   String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime,
												   String acceptOperNo, int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode,
												   String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt)
			throws EnterpriseBusinessException, EcryptMachineException;

	/**
	 * 企业账户无密消费
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
	 * @param merchantCode
	 *            商户号
	 * @param feeFlag
	 *            服务收费标识
	 * @param feeAmt
	 *            服务收费金额
	 * @parm userProductNo 电信产品号
	 * 
	 * 
	 * @return 反馈报文 1、成功："000000" 2、失败:"错误代码(6):错误描述"
	 */
	public String consumeEnterpriseAccountNoPassWdOver(String orgCode, String outBusinessType, String txnType, String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode,
													   String acceptCityCode, String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime, String acceptOperNo, int resendNum, String transferOrgCode,
													   String payOrgCode, String supplyOrgCode, String terminalSeqNo, String terminalNo, String merchantCode, String feeFlag, long feeAmt, String userProductNo)
			throws EnterpriseBusinessException, EcryptMachineException;

	/**
	 * 
	 * 企业账户消费取消
	 * 
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
	public String cancelConsumeEnterpriseAccountNoPassWd(String orgcode, String outBusinessType, String txnType,
														 String txnDscpt, String txnChannel, long txnAmount, String acceptAreaCode, String acceptCityCode,
														 String acceptOrgCode, String acceptTransSeqNo, String acceptTransDate, String acceptTransTime,
														 String acceptOperNo, String oldAcceptTransSeqNo, String oldAcceptTransDate, String oldAcceptTransTime,
														 int resendNum, String transferOrgCode, String payOrgCode, String supplyOrgCode, String terminalSeqNo,
														 String terminalNo, String merchantCode, String feeFlag, long feeAmt) throws EnterpriseBusinessException,
			EcryptMachineException;
	/**
	 * 预存款账户的当日交易记录
	 *
	 * @param accountNo
	 *            预存款账户号 
	 * @param txnType
	 *            交易类型
	 * @param txnChannel
	 *            交易渠道
	 * @param startrecord
	 *            开始记录好
	 * @param maxrecord
	 *            技术记录号
	 *
	 * @return 反馈报文 1、成功：
	 *         "000000：账号1|受理流水1|受理日期1|受理时间1|受理渠道1|交易金额1|商户1|交易类型1|交易描述1|取消标志1;账号2|受理流水2|受理日期2|受理时间2|受理渠道2|交易金额2|商户2|交易类型2|交易描述2|取消标志2;  失败:"
	 *         错误代码(6):错误描述"
	 * @throws EnterpriseBusinessException
	 */
	String queryEnterpriseTxnLogByAccountNo(String accountNo, String txnType, String txnChannel, String startrecord,
											String maxrecord) throws EnterpriseBusinessException;
	
	
	
	 /**
	 * 个人账户转预存款账户
	 * @param inEnterpriseAccountOrgCode 预存款商户-申请
	 * @param inSupplyOrgCode 新配置商户号-申请
	 * @param outPersonalProductNo 用户手机号
	 * @param outPersonalAccountName 用户姓名-可为空
	 * @param outSupplyOrgCode 新配置商户号-申请
	 * @param inBusinessType 721020 预存款充值  固定值
	 * @param intxnType 721020 预存款充值  固定值
	 * @param intxnDscpt 转入交易描述
	 * @param outBusinessType 和内部一样，如需要专属短信，配置短信模版的交易类型
	 * @param outtxnType 131010 个人有密支付   131040 个人无密支付
	 * @param outtxnDscpt 转出交易描述
	 * @param txnChannel 02 门户 , 08 客户端
	 * @param txnAmount  交易金额，单位：分
	 * @param inacceptTransSeqNo  转入交易流水号
	 * @param outacceptTransSeqNo 转出交易流水号  （可以和转入交易流水号相同）
	 * @param acceptTransDate 交易日期 yyyyMMdd
	 * @param acceptAreaCode 交易地区 可以为空
	 * @param acceptCityCode 交易城市 可以为空
	 * @param acceptOrgCode 001999900000000 天翼电子商务有限公司上海分公司
	 * @param payOrgCode 001999900000000 天翼电子商务有限公司上海分公司
	 * @param acceptTransTime 交易时间 hhmiss
	 * @param acceptOperNo 操作人
	 * @param terminalSeqNo 终端流水号 （可以和交易流水号相同）
	 * @param terminalNo 终端号 为空
	 * @param feeFlag 收费标识 为空
	 * @param feeAmt  收费 0
	 * @param isSmsSend 是否发送短信
	 * @return
	 * @throws EnterpriseBusinessException
	 * @throws EcryptMachineException
	 */
	String personalAccountIntoEnterpriseAccountWithSms(
			String inEnterpriseAccountOrgCode, String inSupplyOrgCode,
			String outPersonalProductNo, String outPersonalAccountName,
			String outSupplyOrgCode, String inBusinessType, String intxnType,
			String intxnDscpt, String outBusinessType, String outtxnType,
			String outtxnDscpt, String txnChannel, long txnAmount,
			String inacceptTransSeqNo, String outacceptTransSeqNo,
			String acceptTransDate, String acceptAreaCode,
			String acceptCityCode, String acceptOrgCode, String payOrgCode,
			String acceptTransTime, String acceptOperNo, String terminalSeqNo,
			String terminalNo, String feeFlag, long feeAmt, boolean isSmsSend);

	/**
	 * 预存款账户转个人账户
	 * @param outEnterpriseAccountOrgCode 预存款商户-申请
	 * @param outSupplyOrgCode 新配置商户号-申请
	 * @param inPersonalProductNo 用户手机号
	 * @param inPersonalAccountName 用户姓名-可为空
	 * @param inSupplyOrgCode 新配置商户号-申请
	 * @param outBusinessType 721020 预存款充值  固定值
	 * @param outTxnType 721020 预存款充值  固定值
	 * @param outTxnDesc 转入交易描述
	 * @param inBusinessType 和内部一样，如需要专属短信，配置短信模版的交易类型
	 * @param inTxnType 131010 个人有密支付   131040 个人无密支付
	 * @param inTxnDesc 转出交易描述
	 * @param txnChannel 02 门户 , 08 客户端
	 * @param txnAmount  交易金额，单位：分
	 * @param outAcceptTransSeqNo  转入交易流水号
	 * @param inAcceptTransSeqNo 转出交易流水号  （可以和转入交易流水号相同）
	 * @param acceptTransDate 交易日期 yyyyMMdd
	 * @param acceptAreaCode 交易地区 可以为空
	 * @param acceptCityCode 交易城市 可以为空
	 * @param acceptOrgCode 001999900000000 天翼电子商务有限公司上海分公司
	 * @param payOrgCode 001999900000000 天翼电子商务有限公司上海分公司
	 * @param acceptTransTime 交易时间 hhmiss
	 * @param acceptOperNo 操作人
	 * @param terminalSeqNo 终端流水号 （可以和交易流水号相同）
	 * @param terminalNo 终端号 为空
	 * @param feeFlag 收费标识 为空
	 * @param feeAmt  收费 0
	 * @return
	 * @throws EnterpriseBusinessException
	 * @throws EcryptMachineException
	 */
	String enterpriseAccountIntoPersonalAccount(
			String outEnterpriseAccountOrgCode, String outSupplyOrgCode,
			String inPersonalProductNo, String inPersonalAccountName,
			String inSupplyOrgCode, String outBusinessType, String outTxnType,
			String outTxnDesc, String inBusinessType, String inTxnType,
			String inTxnDesc, String txnChannel, long txnAmount,
			String outAcceptTransSeqNo, String inAcceptTransSeqNo,
			String acceptTransDate, String acceptAreaCode,
			String acceptCityCode, String acceptOrgCode, String payOrgCode,
			String acceptTransTime, String acceptOperNo, String terminalSeqNo,
			String terminalNo, String feeFlag, long feeAmt);


	/**
	 * 消费退货
	 * @param acceptSeqNo 退货记录的受理流水号
	 * @param acceptDate 退货记录的受理日期
	 * @param acceptTime 退货记录的受理时间
	 * @param oldAcceptOrgCode 原受理机构代码
	 * @param oldAcceptDate 原受理日期
	 * @param oldAcceptTime 原受理时间
	 * @param oldAcceptSeqNo 原受理流水号
	 * @param oldTerminalSeqNo 原终端设备流水号
	 * @param refundAmount 消费退货金额
	 * @return
	 * @throws EnterpriseBusinessException
	 * @throws EcryptMachineException
	 */
	public String consumeRefund(String acceptSeqNo, String acceptDate, String acceptTime,
								String businessType, String oldAcceptOrgCode, String oldAcceptDate,
								String oldAcceptTime, String oldAcceptSeqNo,
								String oldTerminalSeqNo, long refundAmount)
			throws EnterpriseBusinessException, EcryptMachineException;


}


