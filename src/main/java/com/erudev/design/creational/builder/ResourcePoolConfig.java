package com.erudev.design.creational.builder;

import cn.hutool.core.util.StrUtil;

/**
 * @author pengfei.zhao
 * @date 2020/12/6 14:40
 */
public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    public ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        private ResourcePoolConfig build() {
            if (StrUtil.isBlank(name)) {
                throw new RuntimeException("...");
            }
            if (maxTotal > DEFAULT_MAX_TOTAL) {
                throw new RuntimeException("...");
            }
            if (maxIdle > DEFAULT_MAX_IDLE) {
                throw new RuntimeException("...");
            }
            if (minIdle < DEFAULT_MIN_IDLE) {
                throw new RuntimeException("...");
            }

            return new ResourcePoolConfig(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            this.minIdle = minIdle;
            return this;
        }
    }

    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("test")
                .setMaxIdle(10)
                .setMaxIdle(10)
                .setMinIdle(1).build();
    }
}
