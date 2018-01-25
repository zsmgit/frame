http://www.mybatis.org/mybatis-3
1.添加依赖:mybatis,mysql
2.properties配置文件------配置jdbc
2.mybatis配置文件mybatis-config.xml
         加载properties文件
         配置别名，环境，事务管理器，连接池
         加载mapper文件
3.mapper映射文件
        namespace
        id:statement语句
        ResultMap开启自动映射:autoMapping=True或者在<settings>:设置为FULL
4.单例模式获取sqlSessionFactory工具类：mybatis.xml->SqlSessionBuider->SqlSessionFactory |||->SqlSession
5.dao得到sqlSession---调用sqlSession方法（statement,param),关闭连接
builder:方法作用域
Factory:适合单例
SqlSession:随用随关
junit单元测试：安装junit generat2插件
添加对某个类的测试：在类内 alt+insert快捷键
alter table post add constraint blog_id foreign key(blog_id) REFERENCES blog(id)

