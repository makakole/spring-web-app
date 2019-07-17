package makakole.capp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
/**
 *
 * @author mk
 */

@Configuration
@ComponentScan(basePackages = {"makakole"})
@EnableWebMvc
public class SpringWebConfig extends WebMvcConfigurationSupport{
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //TODO
        //super.addResourceHandlers(registry);
    }
    
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setViewClass(JstlView.class);
        vr.setPrefix("/WEB-INF/view/");
        vr.setSuffix(".jsp");
        return vr;
    }
}
