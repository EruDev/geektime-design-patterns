package com.erudev.design.creational.factory.di;

import java.io.InputStream;
import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2020/10/1 19:22
 */
public interface BeanConfigParser {
    List<BeanDefinition> parse(InputStream inputStream);
}
