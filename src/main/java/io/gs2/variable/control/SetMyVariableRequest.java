package io.gs2.variable.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.variable.Gs2Variable;

/**
 * 変数の設定リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class SetMyVariableRequest extends Gs2UserRequest<SetMyVariableRequest> {

	public static class Constant extends Gs2Variable.Constant {
		public static final String FUNCTION = "SetMyVariable";
	}
	
	/** 変数名 */
	String variableName;
	/** 値 */
	String value;
	/** 有効期間(秒) */
	Integer ttl;
	
	/**
	 * 変数名を取得。
	 * 
	 * @return 変数名
	 */
	public String getVariableName() {
		return variableName;
	}
	
	/**
	 * 変数名を設定。
	 * 
	 * @param variableName 変数名
	 */
	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}
	
	/**
	 * 変数名を設定。
	 * 
	 * @param variableName 変数名
	 * @return this
	 */
	public SetMyVariableRequest withVariableName(String variableName) {
		setVariableName(variableName);
		return this;
	}

	/**
	 * 値を取得。
	 * 
	 * @return 値
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * 値を設定。
	 * 
	 * @param value 値
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * 値を設定。
	 * 
	 * @param value 値
	 * @return this
	 */
	public SetMyVariableRequest withValue(String value) {
		setValue(value);
		return this;
	}

	/**
	 * 有効期間(秒)を取得。
	 * 
	 * @return 有効期間(秒)
	 */
	public int getTtl() {
		return ttl;
	}
	
	/**
	 * 有効期間(秒)を設定。
	 * 
	 * @param ttl 有効期間(秒)
	 */
	public void setTtl(int ttl) {
		this.ttl = ttl;
	}
	
	/**
	 * 有効期間(秒)を設定。
	 * 
	 * @param ttl 有効期間(秒)
	 * @return this
	 */
	public SetMyVariableRequest withTtl(int ttl) {
		setTtl(ttl);
		return this;
	}
}
