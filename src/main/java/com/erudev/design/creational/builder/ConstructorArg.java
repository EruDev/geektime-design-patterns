package com.erudev.design.creational.builder;

import lombok.Getter;

/**
 * 极客时间 建造者模式课后习题
 *
 * @author pengfei.zhao
 * @date 2020/12/6 14:11
 */
@Getter
public class ConstructorArg {
    private boolean isRef;

    private Class type;

    private Object arg;

    public ConstructorArg(Builder builder) {
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    class Builder {
        private boolean isRef;

        private Class type;

        private Object arg;

        public ConstructorArg build() {
            if (!isRef) {
                if (type == null && arg == null) {
                    throw new RuntimeException("isRef 为 false 时, type 和 arg 都需要设置");
                }
            }
            return new ConstructorArg(this);
        }

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
    }
}
