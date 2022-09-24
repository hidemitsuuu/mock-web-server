# mock-web-server

Client開発時に動作確認用として利用するMockサーバ。  
Ktor(Kotlin)を用いて、REST APIを公開します。

# Usage

アプリケーションをローカルで起動させ、  
返却してほしいステータスコードに対応したURIに対してリクエストすると  
固定のレスポンスボティと期待通りのステータスコードが返却される。  
TODO : docker-composeで起動させる

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
