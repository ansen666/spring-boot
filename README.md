### 说明
这是一个spring boot学习项目，我观看的教程是慕课网的教程:
https://www.imooc.com/video/23471

项目框架使用的是spring boot + mybatis-plus

### 运行项目
- 1.把项目下sql/db_stu.sql导入到你本地的mysql数据库，

- 2.修改application.yml文件中 datasource下的数据库相关信息,修改成你的.

### 打包war包，运行到tomcat
spring boot默认是有集成tomcat的，但是有可能需要打包war部署到服务器。
参考链接:https://blog.51cto.com/u_15345018/3654011

- 如果打包war如果运行访问404，尝试tomcat官网下载跟内嵌一样版本号的tomcat。