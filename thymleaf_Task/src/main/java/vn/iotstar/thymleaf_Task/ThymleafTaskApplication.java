package vn.iotstar.thymleaf_Task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
public class ThymleafTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymleafTaskApplication.class, args);
	}
//	@Bean
//	public FilterRegistrationBean<MySiteMeshFilter> siteMeshFilter(){
//		FilterRegistrationBean<MySiteMeshFilter> filterRegistrationBean 
//			= new FilterRegistrationBean<MySiteMeshFilter>();
//		filterRegistrationBean.setFilter(new MySiteMeshFilter()); // adding sitemesh filter ??
//		filterRegistrationBean.addUrlPatterns("/*");
//		return filterRegistrationBean;
//	}
}
