## eureka-registry 模块
### 简介
eureka-registry作为eureka服务的注册中心
配置：
1. 添加eureka-server依赖
2. 在启动类上添加注解 @EnableEurekaServer
3. 在application.yml文件中添加配置
```yaml
# eureka 注册中心默认使用8761端口
server:
  port: 8761
eureka:
  instance:
    hostname: 127.0.0.1
  client:
    service-url:
      #由于service-url的参数类型是map，所以必须指定key，默认的key为defaultZone，
      # 默认的参数为 http://localhost:8761/eureka
      # 多个注册中心使用','分割
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
    # eureka server作为注册中心，本身也是一个eureka client, 为防止注册自身，需设置为false
    # 集群部署时建议为true
    register-with-eureka: false
    # eureka server 作为注册中心在启动时需要从注册中心集群中获取client信息，在单机部署时需要设置为false，
    # 集群部署时建议为true
    fetch-registry: false
```
访问 [注册中心地址](http://localhost:8761)