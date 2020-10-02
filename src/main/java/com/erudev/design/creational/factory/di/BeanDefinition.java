package com.erudev.design.creational.factory.di;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2020/10/1 20:09
 */
public class BeanDefinition {
    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private boolean lazyInit;
    private Scope scope = Scope.PROTOTYPE;

    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public void setConstructorArgs(List<ConstructorArg> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean isSingleton() {
        return Scope.SINGLETON.equals(scope);
    }

    public void addConstructorArg(ConstructorArg arg) {
        constructorArgs.add(arg);
    }

    public enum Scope {
        SINGLETON,
        PROTOTYPE;
    }

    public static class ConstructorArg {
        private boolean isRef;
        private Class type;
        private Object arg;

        public ConstructorArg(Builder builder) {
            this.isRef = builder.isRef;
            this.type = builder.type;
            this.arg = builder.arg;
        }

        public boolean isRef() {
            return isRef;
        }

        public Class getType() {
            return type;
        }

        public Object getArg() {
            return arg;
        }

        static class Builder {
            private boolean isRef;
            private Class type;
            private Object arg;

            public Builder setRef(boolean ref) {
                this.isRef = ref;
                return this;
            }

            public Builder setType(Class type) {
                this.type = type;
                return this;
            }

            public Builder setArg(Object arg) {
                this.arg = arg;
                return this;
            }

            public ConstructorArg build() {
                if (this.isRef) {
                    if (this.type != null) {
                        throw new IllegalArgumentException("当参数为引用类型时, 无需设置 type 参数.");
                    }
                    if (!(arg instanceof String)) {
                        throw new IllegalArgumentException("请设置引用 ID");
                    }
                } else {
                    if (this.type == null || this.arg == null) {
                        throw new IllegalArgumentException("当参数为非引用类型时，type 和 arg 参数必填");
                    }
                }
                return new ConstructorArg(this);
            }
        }
    }
}
