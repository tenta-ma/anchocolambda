package org.tentama.anchoco.anchocolambda.dto;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 * Lambda プロキシ統合リクエスト
 *
 * @see aws : プロキシ統合のための Lambda 関数の入力形式
 */
@Getter
@Setter
public class LambdaProxyRequest {

    // 他のパラメータは以下を参照など
    // https://github.com/gabrielle-anderson/aws-lambda-proxy-java/blob/master/src/main/java/com/onelostlogician/aws/proxy/ApiGatewayProxyRequest.java

    /** http メソッド(e.g. POST, GET) */
    private String httpMethod;

    /** リクエストヘッダー */
    private Map<String, String> headers;

    /** リクエストボディ */
    private String body;
}
