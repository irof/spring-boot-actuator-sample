# spring-boot-actuator-sample

```
% curl http://localhost:8080/actuator/health | jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   202    0   202    0     0  50500      0 --:--:-- --:--:-- --:--:-- 67333
{
  "status": "UP",
  "components": {
    "diskSpace": {
      "status": "UP",
      "details": {
        "total": 499963174912,
        "free": 291946053632,
        "threshold": 10485760,
        "exists": true
      }
    },
    "myJava": {
      "status": "I <3 Java!"
    },
    "ping": {
      "status": "UP"
    }
  }
}
```
