package io.gs2.variable;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.model.IGs2Credential;
import io.gs2.variable.control.DeleteMyVariableRequest;
import io.gs2.variable.control.DeleteVariableRequest;
import io.gs2.variable.control.GetMyVariableRequest;
import io.gs2.variable.control.GetMyVariableResult;
import io.gs2.variable.control.GetVariableRequest;
import io.gs2.variable.control.GetVariableResult;
import io.gs2.variable.control.SetMyVariableRequest;
import io.gs2.variable.control.SetMyVariableResult;
import io.gs2.variable.control.SetVariableRequest;
import io.gs2.variable.control.SetVariableResult;

/**
 * GS2 Variable API クライアント
 * 
 * @author Game Server Services, Inc.
 *
 */
public class Gs2VariableClient extends AbstractGs2Client<Gs2VariableClient> {

	public static String ENDPOINT = "variable";
	
	/**
	 * コンストラクタ。
	 * 
	 * @param credential 認証情報
	 */
	public Gs2VariableClient(IGs2Credential credential) {
		super(credential);
	}

	/**
	 * 変数に値を設定。
	 * 
	 * @param request リクエストパラメータ
	 * @return 設定結果
	 */
	public SetVariableResult setVariable(SetVariableRequest request) {
		if(request.getUserId() == null || request.getVariableName() == null) throw new NullPointerException();
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("value", request.getValue())
				.put("ttl", String.valueOf(request.getTtl()));
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserId() + "/variable/" + request.getVariableName(), 
				credential, 
				ENDPOINT,
				SetVariableRequest.Constant.MODULE, 
				SetVariableRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, SetVariableResult.class);
	}

	/**
	 * 変数を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 変数の値
	 */
	public GetVariableResult getVariable(GetVariableRequest request) {
		if(request.getUserId() == null || request.getVariableName() == null) throw new NullPointerException();
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserId() + "/variable/" + request.getVariableName(), 
				credential, 
				ENDPOINT,
				GetVariableRequest.Constant.MODULE, 
				GetVariableRequest.Constant.FUNCTION);
		return doRequest(get, GetVariableResult.class);
	}

	/**
	 * 変数を削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteVariable(DeleteVariableRequest request) {
		if(request.getUserId() == null || request.getVariableName() == null) throw new NullPointerException();
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserId() + "/variable/" + request.getVariableName(), 
				credential, 
				ENDPOINT,
				DeleteVariableRequest.Constant.MODULE, 
				DeleteVariableRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * 変数に値を設定。
	 * 
	 * @param request リクエストパラメータ
	 * @return 設定結果
	 */
	public SetMyVariableResult setMyVariable(SetMyVariableRequest request) {
		if(request.getVariableName() == null) throw new NullPointerException();
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("value", request.getValue())
				.put("ttl", String.valueOf(request.getTtl()));
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/variable/" + request.getVariableName(), 
				credential, 
				ENDPOINT,
				SetMyVariableRequest.Constant.MODULE, 
				SetMyVariableRequest.Constant.FUNCTION,
				body.toString());
		put.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(put, SetMyVariableResult.class);
	}

	/**
	 * 変数を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 変数の値
	 */
	public GetMyVariableResult getMyVariable(GetMyVariableRequest request) {
		if(request.getVariableName() == null) throw new NullPointerException();
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/variable/" + request.getVariableName(), 
				credential, 
				ENDPOINT,
				GetMyVariableRequest.Constant.MODULE, 
				GetMyVariableRequest.Constant.FUNCTION);
		get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(get, GetMyVariableResult.class);
	}

	/**
	 * 変数を削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteMyVariable(DeleteMyVariableRequest request) {
		if(request.getVariableName() == null) throw new NullPointerException();
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/variable/" + request.getVariableName(), 
				credential, 
				ENDPOINT,
				DeleteMyVariableRequest.Constant.MODULE, 
				DeleteMyVariableRequest.Constant.FUNCTION);
		delete.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(delete, null);
	}

}
