package org.nikiforov.karafrestspring;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.springframework.beans.factory.BeanFactory;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        //This code is critically important cause OSGI class loader by default does not handle 
        //classes of bundle JAR in case of dynamic class loading. Cause Spring framework
        //is completely based of DCL, we need this class load setting to make application working
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
    }

    public void stop(BundleContext context) throws Exception {
        // TODO add deactivation code here
    }

}
