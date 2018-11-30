//package com.ronzheng.travel.filter;
//
//import java.io.IOException;
//import java.util.Properties;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//
//import com.github.pagehelper.PageHelper;
//
///** 
//* @author 作者 luozheng: 
//* @version 创建时间：2018年11月25日 下午1:40:46 
//* 类说明 
//*/
//
//@Configuration
//@EnableTransactionManagement
// 
//public class MybatisConfig implements TransactionManagementConfigurer {
// 
//    @Autowired
//    private DataSource dataSource;
// 
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }
// 
//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactoryBean() throws IOException {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        bean.setMapperLocations(resolver.getResources("classpath:com/ronzheng/travel/dao/*.xml"));
//        bean.setTypeAliasesPackage("com.ronzheng.travel.dao");
// 
//        bean.setDataSource(dataSource);
//        bean.setPlugins(new Interceptor[]{new MapperAspect()});
//        try {
//            return bean.getObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }
// 
//    @Bean
//    public ConfigurationCustomizer mybatisConfigurationCustomizer() {
//        return configuration -> configuration.setMapUnderscoreToCamelCase(true);
//    }
// 
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//    
//    /**
//     * 分页插件
//     *
//     * @param
//     * @return
//     */
//    @Bean
//    public PageHelper pageHelper() {
//        PageHelper pageHelper = new PageHelper();
//        Properties p = new Properties();
//        p.setProperty("offsetAsPageNum", "true");
//        p.setProperty("rowBoundsWithCount", "true");
//        p.setProperty("reasonable", "true");
//        pageHelper.setProperties(p);
//        return pageHelper;
//    }
//}
