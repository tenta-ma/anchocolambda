package org.tentama.anchoco.anchocolambda.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * aws lambda プロキシ統合用のレスポンス
 */
@Getter
@Setter
public class LambdaProxyResponse {

    // 他のパラメータは以下を参照など
    // https://github.com/gabrielle-anderson/aws-lambda-proxy-java/blob/master/src/main/java/com/onelostlogician/aws/proxy/ApiGatewayProxyResponse.java

    /** httpステータス */
    private int status;

    /** レスポンスボディ */
    private String body;
}
