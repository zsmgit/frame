1.加依赖：mysql 驱动,dbcp连接池，mybatis,mybatis-spring
2.配置mybatis全局配置文件：mybatis-config.xml
3.配置spring全局配置文件，IOC容器:applicationContext.xml
4.mapper接口开发，mapper接口和mapper.xml：在idea 中mapper.xml文件在rescources相同路径的下
5.在spring-config.xml中配置mapper
5.创建测试

org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): cn.su.mapper.UserMapper.getUserById
mapper.xml文件在idea中必须放在resources下，不然打包不到spring之中