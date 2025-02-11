package by.tms.onlinerclone31onl.services;

import by.tms.onlinerclone31onl.configuration.JdbcConfiguration;
import by.tms.onlinerclone31onl.configuration.RootConfiguration;
import by.tms.onlinerclone31onl.configuration.WebConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author simonpirko
 * @version 1.0
 * @since 30.01.2025
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{RootConfiguration.class, WebConfiguration.class, JdbcConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
