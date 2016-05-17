/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nikiforov.karafrestspring.spring.base;

import org.springframework.beans.factory.BeanFactory;
import org.nikiforov.karafrestspring.spring.config.BaseConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author dmtry
 */
public class BaseContainer extends AnnotationConfigApplicationContext {
    
    public BaseContainer() {
        super();
    }
    
    public void init() {
        super.register(BaseConfiguration.class);
        super.refresh();
    }
    
}
