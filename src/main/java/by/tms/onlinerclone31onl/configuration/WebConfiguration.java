package by.tms.onlinerclone31onl.configuration;

import by.tms.onlinerclone31onl.services.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

/**
 * @author simonpirko
 * @version 1.0
 * @since 30.01.2025
 */

@Configuration
@EnableWebMvc
@PropertySource(Constants.APPLICATION_PROPERTIES_PATH)
public class WebConfiguration {

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${thymeleaf.prefix}")
    private String getThymeleafPrefix;

    @Value("${thymeleaf.suffix}")
    private String getGetThymeleafSuffix;

    @Value("${thymeleaf.cache}")
    private Boolean getGetThymeleafCache;

    @Value("${thymeleaf.encoding}")
    private String getThymeleafEncoding;

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(this.applicationContext);
        templateResolver.setPrefix(getThymeleafPrefix);
        templateResolver.setSuffix(getGetThymeleafSuffix);
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCacheable(getGetThymeleafCache);
        templateResolver.setCharacterEncoding(getThymeleafEncoding);
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setCharacterEncoding(getThymeleafEncoding);
        return viewResolver;
    }
}
