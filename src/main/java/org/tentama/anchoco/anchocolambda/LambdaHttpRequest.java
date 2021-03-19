package org.tentama.anchoco.anchocolambda;

import org.tentama.anchoco.anchocolambda.dto.LambdaProxyRequest;
import org.tentama.anchoco.anchocolambda.dto.LambdaProxyResponse;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * lambda処理用のリクエストハンドラ
 */
@Slf4j
public class LambdaHttpRequest implements RequestHandler<LambdaProxyRequest, LambdaProxyResponse> {

    // hint. この処理はhttp requestをlambdaで受け付けてそれを処理することを目標とする
    // また、リクエストパラメータをプロキシ統合で受け付けている

    @Override
    public LambdaProxyResponse handleRequest(LambdaProxyRequest request, Context context) {

        log.debug("process start.");

        // リクエスト情報からいろいろ行ったり
        String hogehogeHeader = request.getHeaders().get("hogehogeheader");
        String bodyJson = request.getBody();

        log.debug("hoge is {}", hogehogeHeader);
        log.debug("bode is {}", bodyJson);

        // processed...

        // create response.
        LambdaProxyResponse response = new LambdaProxyResponse();
        final int statusOk = 200;
        response.setStatus(statusOk);
        response.setBody("{}");

        return response;

    }
}
