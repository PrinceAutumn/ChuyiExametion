<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper>
PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
"http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!-- 命名空间，对sql进行分类化管理（sql隔离） -->
<mapper namespace="com.sw.mapper.UserMapper">
    <!-- 在映射文件中配置sql语句 -->
    <!-- 通过select执行查询，id用于标识映射文件中的sql(Statement-id)
	将sql语句封装到mappedstatement中
	#{表示占位符}
	parameterType-指定输入参数的类型
	#{id}-id表示输入的参数，参数名称就是id,如如果输入参数是简单类型，#{}中的参数可以任意
	resultType-指定sql输出结果所映射的java对象类型
	-->
    <!-- 通过id查询用户表的记录 -->
    <select id="findUserById" parameterType="int" resultType="com.sw.po.User">
        select *from user where id=#{id}
    </select>

    <!-- 根据用户名称模糊查询用户信息 -->
    <!-- resultType-指定单条记录所映射的对象类型
	${}拼接sql串，接收参数的内容，不加任何修饰，拼接在sql中(存在sql漏洞)
	${}接收输入参数的内容，如果传入的类型是简单类型，${}中只能使用value
	-->
    <select id="findUserByName" parameterType="java.lang.String" resultType="com.sw.po.User">
        SELECT *FROM USER WHERE username LIKE '%${value}%'
    </select>

    <!-- 添加用户 -->
    <!-- 指定输入参数类型是pojo(包括用户信息)
		#{中指定pojo(User)属性名,接收到pojo的属性值}
		Mybatis通过OGNL获取对象的属性值
	 -->
    <insert id="insertUser" parameterType="com.sw.po.User">
        <!-- 获取刚增加的记录主键
            返回id到poio对象（User）
            SELECT LAST_INSERT_ID():得到刚插入金进去记录的主键值，只适用于自增逐主键
            keyProperty：将查询到的主键值设置到parameterType指定的对象的id属性
            order:指SELECT LAST_INSERT_ID()的执行顺序，相对于insert来说（before/after）
            resultType:指定SELECT LAST_INSERT_ID()的结果类型
        -->
        <selectKey keyProperty="id" order="AFTER" resultType="java.lang.Integer">
            SELECT LAST_INSERT_ID()
        </selectKey>
        INSERT INTO USER (username,birthday,sex,address) VALUES(#{username},#{birthday},#{sex},#{address})

        <!-- 使用mysql的uuid生成主键返回
            执行过程：
                首先通过uuid得到主键，然后将主键设置到id属性中
                其次在Inster执行的时候从User对象中取出id的属性值
         -->
        <!--   <selectKey keyProperty="id" order="BEFORE" resultType="java.lang.String">
	         SELECT UUID()
	     </selectKey>
	   INSERT INTO USER (id,username,birthday,sex,address) VALUES(#{id},#{username},#{birthday},#{sex},#{address})  -->
    </insert>

    <!-- 根据id删除用户 -->
    <delete id="deleteUser" parameterType="java.lang.Integer">
        DELETE FROM USER WHERE id=#{id}
    </delete>

    <!-- 根据id更新用户
		传入用户id以及相关更新信息
		#{id}:从输入的user对象中获取user的属性值
	-->
    <update id="updateUser" parameterType="com.sw.po.User">
        UPDATE USER SET username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} WHERE id=#{id}
    </update>
</mapper>
