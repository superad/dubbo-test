package com.bestpay.test.provider.billcenter;

/**
 * 2012-08-11
 * 
 * @author Mili.Tang
 * 
 */
public class EnterpriseBusinessException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2955940711387926366L;
	private String txnCode;
	private String errorCode;
	private String errorMsg;
    private String errorAllMsg;


	public EnterpriseBusinessException(String txnCode, String errorCode) {
		this.txnCode = txnCode;
		this.errorCode = errorCode;
		// TODO Auto-generated constructor stub
	}

	public EnterpriseBusinessException(String txnCode, String errorCode, String errorMsg) {
		this.txnCode = txnCode;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		// TODO Auto-generated constructor stub
	}

	public EnterpriseBusinessException(String errorCode) {
		this.errorCode = errorCode;
		// TODO Auto-generated constructor stub
	}

    public EnterpriseBusinessException(String txnCode, String errorCode, String errorMsg ,String errorAllMsg) {
        this.txnCode = txnCode;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.errorAllMsg = errorAllMsg;
    }


    /**
     * @return the errorMsg
     */
    public String getErrorAllMsg() {
        return errorAllMsg;
    }

    /**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @return the txnCode
	 */
	public String getTxnCode() {
		return txnCode;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

}