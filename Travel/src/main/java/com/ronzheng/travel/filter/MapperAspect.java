//package com.ronzheng.travel.filter;
//
//import java.util.Properties;
//
//import org.apache.ibatis.executor.statement.StatementHandler;
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.plugin.Intercepts;
//import org.apache.ibatis.plugin.Invocation;
//import org.apache.ibatis.plugin.Plugin;
//import org.apache.ibatis.plugin.Signature;
//import org.apache.ibatis.session.ResultHandler;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import com.mysql.jdbc.Statement;
//
//
///** 
//* @author 作者 luozheng: 
//* @version 创建时间：2018年11月25日 下午1:12:00 
//*  Sql执行时间记录拦截器
//*/
//@Intercepts({@Signature(type = StatementHandler.class, method = "query", args = {Statement.class, ResultHandler.class}),
//        @Signature(type = StatementHandler.class, method = "update", args = {Statement.class}),
//        @Signature(type = StatementHandler.class, method = "batch", args = { Statement.class })})
//@Component
//@Configuration
//public class MapperAspect implements Interceptor {
//	private static final Logger log = LoggerFactory.getLogger(MapperAspect.class);
//    @Override
//    public Object intercept(Invocation invocation) throws Throwable {
// 
//        long startTime = System.currentTimeMillis();
//        try {
//            return invocation.proceed();
//        } finally {
//            long endTime = System.currentTimeMillis();
//            long sqlCost = endTime - startTime;
//            log.info("执行耗时 : [" + sqlCost + "ms ] ");
//        }
//    }
// 
//    @Override
//    public Object plugin(Object target) {
//        return Plugin.wrap(target, this);
//    }
// 
//    @Override
//    public void setProperties(Properties properties) {
// 
//    }
//}
