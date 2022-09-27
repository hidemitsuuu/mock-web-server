# mock-web-server

Client開発時に動作確認用として利用するMockサーバ。  
Ktor(Kotlin)を用いて、REST APIを公開します。

# Usage

アプリケーションをローカルで起動させ、  
返却してほしいステータスコードに対応したURIに対してリクエストすると  
固定のレスポンスボティと期待通りのステータスコードが返却される。 

- curlでのリクエスト例
```
curl -X POST -H "Content-Type: application/json" --include http://localhost:8081/success/ok
```

- curlでのレスポンス例
```
HTTP/1.1 200 OK
Content-Length: 85
Content-Type: application/json

{"uri":"/success/ok","statusCode":200,"method":"POST","message":"Request succeeded."}
```

# Support

### Http Request Method
- get
- post
- put
- patch
- delete
- head
- options

### Http Response Status Code

| Group | Code | Name | Uri |
|  --   |  --  |  --  | --  |
| 2XX(Success) | 200 | OK | /success/ok |
|              | 201 | Created | /success/created |
|              | 202 | Accepted | /success/accepted |
|              | 204 | No Content | /success/no-content |
| 4XX(ClientError) | 400 | Bad Request | /client-error/bad-request |
|                  | 401 | Unauthorized | /client-error/unauthorized |
|                  | 403 | Forbidden | /client-error/forbidden |
|                  | 404 | Not Found | /client-error/not-found |
|                  | 405 | Method Not Allowed | /client-error/method-not-allowed |
|                  | 408 | Request Timeout | /client-error/request-timeout |
|                  | 412 | PreconditionFailed | /client-error/precondition-failed |
