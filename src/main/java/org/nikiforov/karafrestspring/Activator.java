package org.nikiforov.karafrestspring;

import org.nikiforov.karafrestspring.spring.base.BaseContainer;
import org.nikiforov.karafrestspring.spring.config.BaseConfiguration;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    private BaseContainer baseContainer;
    
    public void start(BundleContext context) throws Exception {
        // TODO add activation code here
        Thread.currentThread().setContextClassLoader(BaseConfiguration.class.getClassLoader());        
        baseContainer = new BaseContainer();
        baseContainer.init();
    }

    public void stop(BundleContext context) throws Exception {
        // TODO add deactivation code here
        baseContainer.close();
        baseContainer = null;
    }

}
