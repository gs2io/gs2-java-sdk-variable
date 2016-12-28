package io.gs2.variable.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 変数の設定結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SetMyVariableResult {
	
	/** 設定した値 */
	String value;
	/** 値の有効期限 */
	Long expire;
	
	/**
	 * 設定した値を取得します。
	 * 
	 * @return 設定した値
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * 設定した値を設定します。
	 * 
	 * @param value 設定した値
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
