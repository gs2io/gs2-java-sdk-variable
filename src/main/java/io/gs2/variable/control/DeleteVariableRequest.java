package io.gs2.variable.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.variable.Gs2Variable;

/**
 * 変数の削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteVariableRequest extends Gs2BasicRequest<DeleteVariableRequest> {

	public static class Constant extends Gs2Variable.Constant {
		public static final String FUNCTION = "DeleteVariable";
	}
	
	/** ユーザID */
	String userId;
	/** 変数名 */
	String variableName;
	
	/**
	 * ユーザIDを取得。
	 * 
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * ユーザIDを設定。
	 * 
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * ユーザIDを設定。
	 * 
	 * @param userId ユーザID
	 * @return this
	 */
	public DeleteVariableRequest withUserId(String userId) {
		setUserId(userId);
		return this;
	}
	
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
	public DeleteVariableRequest withVariableName(String variableName) {
		setVariableName(variableName);
		return this;
	}
}
