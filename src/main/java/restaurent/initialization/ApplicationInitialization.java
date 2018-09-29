package restaurent.initialization;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitialization extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class < ? > [] getRootConfigClasses() {
		return new Class[] {
				ApplicationConfiguration.class
		};
	}


	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {
				"/rest/*"
		};
	}

}
