package io.gs2.variable.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.variable.Gs2Variable;

/**
 * 変数の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetMyVariableRequest extends Gs2UserRequest<GetMyVariableRequest> {

	public static class Constant extends Gs2Variable.Constant {
		public static final String FUNCTION = "GetMyVariable";
	}
	
	/** 変数名 */
	String variableName;
	
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
	public GetMyVariableRequest withVariableName(String variableName) {
		setVariableName(variableName);
		return this;
	}
}
