在Nacos-Server中新建配置，其中Data ID它的定义规则是：${prefix}-${spring.profile.active}.${file-extension}

prefix 默认为 spring.application.name 的值，也可以通过配置项 spring.cloud.nacos.config.prefix 来配置。
spring.profile.active 即为当前环境对应的 profile，可以通过配置项 spring.profile.active 来配置。
file-exetension 为配置内容的数据格式，可以通过配置项 spring.cloud.nacos.config.file-extension 来配置。目前只支持 properties 和 yaml 类型。
注意：当 spring.profile.active 为空时，对应的连接符 - 也将不存在，dataId 的拼接格式变成 p r e f i x . {prefix}. prefix.{file-extension}