1.加依赖，servlet，jsp 驱动 数据源 mybatis mybatis-spring 整合包
2.移动applicationContext.xml位置
3.配置前端控制器：视图解析器，扫描controller包
4.mybatis-config.xml
5.jdbc.properties
6.配置applicationContext-mybaits的配置：扫描dao
    加jdbc.properties
    配置数据源----->
    注入sqlSessionFactory:
        加mybatis-config.xml文件
        加mapper.xml文件
    可以选择程序中sqlSessionFactory注入dao-----创建sqlSession
    或者在配置文件中sqlSessionFactory注入jdbcTemplate-------注入dao