package top.lazyr.config;

import org.springframework.beans.factory.annotation.Value;
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

/**
 * @author lazyr
 * @created 2021/4/27
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${project.host}")
    private String host;
    @Value("${project.groupId}")
    private String groupId;
    @Value("${project.artifactId}")
    private String artifactId;
    @Value("${project.version}")
    private String version;
    @Value("${project.name}")
    private String name;
    @Value("${project.description}")
    private String description;
    @Value("${project.url}")
    private String url;
    @Value("${project.show}")
    private boolean show;


    //配置Swagger的Docket的bean实例
    @Bean
    public Docket docket(){
        final String CONTROLLER_PACKAGE_NAME = SwaggerConfig.class.getPackage().getName().replace("config", "controller");
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(show)
                .host(host)
                .apiInfo(apiInfo())
                .select()
                // 显示controller包下的所有api信息
                .apis(RequestHandlerSelectors.basePackage(CONTROLLER_PACKAGE_NAME))
                .paths(PathSelectors.any())
                .build();
    }

    //配置Swagger信息=apiInfo
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title(name)
                .description(description)
                .termsOfServiceUrl(url)
                .version(version)
                .contact(new Contact("lazyr", "http://lazyr.top", "lazywjr@foxmail.com"))
                .build();
    }
}
