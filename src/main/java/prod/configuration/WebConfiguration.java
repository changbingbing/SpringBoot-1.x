package prod.configuration;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import prod.filter.MyFilter;

/**
 * @author changbingbing
 * 2018年11月29日
 */
//将Java类：WebConfiguration修饰为［配置文件］,相当于配置文件
@Configuration
public class WebConfiguration {

	//bean的实例化交给spring管理，修饰的bean对象对应的关键字默认为当前修饰的方法的方法名
	@Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }
    
    @Bean
    public FilterRegistrationBean testFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("MyFilter");
        registration.setOrder(1);
        return registration;
    }
}
