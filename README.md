# cloud_nacos
以nacos为注册中心的微服务  注册中心、做配置中心
1.使用ribbon实现负载均衡的时候，服务名称不能用下划线，换成中划线  否则跳转不成功 
2.要在相同spacename下的的服务才能相互远程调用
多环境下如何“管理”及“隔离”配置和服务
group 和spacename

共享文件
shared-dataids方式：
适合于共享配置文件与项目默认配置文件处于相同Group时，直接两条命令就可以搞定
优点：配置方便
缺点：只能在同一Group中
ext-config方式：
它可以由开发者自定义要读取的共享配置文件的DataId、Group、refresh属性，这样刚好解决了shared-dataids存在的局限性。
优点：可以与shared-dataids方案结合使用，用户自定义配置。灵活性强
缺点：配置容易出错，要熟悉YAML语法
