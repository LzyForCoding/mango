package cc.concurrent.mango.exception.reflect;

/**
 * @author ash
 */
public class BeanInstantiationException extends BeansException {

    private Class beanClass;

    public BeanInstantiationException(Class beanClass, String msg) {
        this(beanClass, msg, null);
    }

    public BeanInstantiationException(Class beanClass, String msg, Throwable cause) {
        super("Could not instantiate bean class [" + beanClass.getName() + "]: " + msg, cause);
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

}
