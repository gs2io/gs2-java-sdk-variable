package io.gs2.variable.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 変数の取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetVariableResult {
	
	/** 値 */
	String value;
	/** 値の有効期限 */
	Long expire;
	
	/**
	 * 値を取得します。
	 * 
	 * @return 値
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * 値を設定します。
	 * 
	 * @param value 値
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * 値の有効期限を取得します。
	 * 
	 * @return 値の有効期限
	 */
	public Long getExpire() {
		return expire;
	}
	
	/**
	 * 値の有効期限を設定します。
	 * 
	 * @param expire 値の有効期限
	 */
	public void setExpire(Long expire) {
		this.expire = expire;
	}
}
