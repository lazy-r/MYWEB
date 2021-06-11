package top.lazyr.myweb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Swagger配置类
 * @author lazyr
 * @created 2021/4/27
 */
@Configuration
@EnableSwagger2
//@ConfigurationProperties(prefix = "project")
public class SwaggerConfig {
//    private static final String API_PACKAGE_NAME = SwaggerConfig.class.getPackage().getName().replace("config", "controller");
//    private boolean show;
//    private String host;
//    private String groupId;
//    private String artifactId;
//    private String version;
//    private String name;
//    private String description;
//    private String url;




//    //配置Swagger的Docket的bean实例
//    @Bean
//    public Docket docket(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(getApiInfo());
//    }
//
//    //配置Swagger信息=apiInfo
//    private ApiInfo getApiInfo(){
//        Contact contact = new Contact("wjr", "http://119.23.231.254:8080", "2296339656@qq.com");
//        return new ApiInfo("LAZYR Api Documentation",
//                "LAZRY IS THE BEST",
//                "1.0",
//                "http://119.23.231.254:8080/dictionary/",
//                contact,
//                "Apache 2.0",
//                "http://www.apache.org/licenses/LICENSE-2.0",
//                new ArrayList());
//    }

}
