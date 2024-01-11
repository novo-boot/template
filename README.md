# novo

提供reset和webservice服务能力，并将待办发送到MQ


# 工程分层结构（上层依赖下层，不允许反向依赖）

```
├── novo
│   ├── README.md
│   ├── doc
│   ├── start   应用程序入口，资源配置，源码打包
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── com.novo
│   │   │   │   │           └── demo
│   │   │   │   │               ├── Application.java 系统启动入口
│   │   │   │   │               └── configuration
│   │   │   │   ├── resources
│   │   │   │   │   ├── i18n
│   │   │   │   │   │   ├── message.properties
│   │   │   │   │   │   ├── message_en_US.properties
│   │   │   │   │   │   └── message_zh_CN.properties
│   │   │   │   ├── logback-spring.xml
│   │   │   │   └── application.yml
│   │   │   └── test
│   ├── novo-interface   用户接口层
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       └── java
│   │   │           └── com.novo
│   │   │                   └── demo
│   │   │                       └── interface
│   │   │                           ├── web        提供http访问
│   │   │                           ├── feign      提供对外Feign调用
│   │   │                           └── job        定时任务job入口
│   ├── novo-application  应用服务层
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       └── java
│   │   │           └── com.novo
│   │   │                   └── demo
│   │   │                       └── application
│   │   │                           ├── assembler    DTO转换DO
│   │   │                           ├── dto          传输对象
│   │   │                           ├── event  
│   │   │                           │   ├── publish  事件发布
│   │   │                           │   └── subcribe 事件订阅
│   │   │                           └── service      应用服务
│   ├── novo-domain  领域层
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       └── java
│   │   │           └── com.novo
│   │   │                   └── demo
│   │   │                       └── domain
│   │   │                           └── aggregate1      聚合
│   │   │                               ├── entity      实体对象
│   │   │                               ├── valueobject 值对象
│   │   │                               ├── event       领域事件
│   │   │                               ├── repository  仓储接口
│   │   │                               ├── service     领域服务
│   │   │                               └── validator   校验
│   ├── novo-infrastructure   基础设施层，基础组件的封装访问
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── com.novo
│   │   │   │   │           └── demo
│   │   │   │   │               └── infrastructure
│   │   │   │   │                   ├── util            存放工具类
│   │   │   │   │                   ├── constant        存放常量类
│   │   │   │   │                   ├── enums            
│   │   │   │   │                   ├── external        调用外部接口
│   │   │   │   │                   ├── database        关系数据库访问层
│   │   │   │   │                   │   ├── converter   领域对象转换po
│   │   │   │   │                   │   ├── dataobject  数据对象
│   │   │   │   │                   │   ├── mapper      mapper实现
│   │   │   │   │                   │   ├── datasource  配置多数据源
│   │   │   │   │                   │   └── repository  仓储实现
│   │   │   │   │                   ├── elasticsearch   es访问层
│   │   │   │   │                   ├── mongo           mongo访问层
│   │   │   │   │                   └── redis           redis访问层
│   │   │   │   └── resources
│   │   │   │       └── mapper  xml映射文件
```


每次版本升级的配置文件和数据执行的sql需要从itsm上对应的分支上获取，如果配置文件变更，标品侧需要发邮件通知

