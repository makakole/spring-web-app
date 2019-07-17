
package makakole.capp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author mk
 */

@Configuration
@ComponentScan(basePackages = {"makakole"})
public class SpringRootConfig {
    //TODO:ADD Services, DAO, DataSource, Email sender or some other business layer beans
    
    
}
