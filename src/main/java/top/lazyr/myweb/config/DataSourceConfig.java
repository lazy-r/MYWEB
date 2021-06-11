package top.lazyr.myweb.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author lazyr
 * @created 2021/3/22
 */

//@Getter
//@Setter
//@SpringBootConfiguration
//@EnableTransactionManagement
//@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceConfig {
//    private String url;
//    private String username;
//    private String password;
//    private String driverClassName;
//    private int maxActive;
//    private int maxIdle;
//    private int minIdle;
//    private int initialSize;
//    private int maxWait;
//
//
//
//    @Primary
//    @Bean("datasource.druid")
//    public DataSource createDataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        //base
//        dataSource.setUrl(this.url);
//        dataSource.setUsername(this.username);
//        dataSource.setPassword(this.password);
//        dataSource.setDriverClassName(this.driverClassName);
//        //configuration
//        dataSource.setMaxActive(this.maxActive);
//        dataSource.setMinIdle(this.maxIdle);
//        dataSource.setMinIdle(this.minIdle);
//        dataSource.setInitialSize(this.initialSize);
//        dataSource.setMaxWait(this.maxWait);
//        return dataSource;
//    }

}
