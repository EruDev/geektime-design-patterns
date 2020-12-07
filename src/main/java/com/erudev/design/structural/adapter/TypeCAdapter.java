package com.erudev.design.structural.adapter;

/**
 * USB 转 Type-c 接口 转接头
 *
 * @author pengfei.zhao
 * @date 2020/12/7 19:57
 */
public class TypeCAdapter implements TypeC {
    private Usb usb;

    public TypeCAdapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public String slot() {
        String originalType = usb.slot();
        String type = transformSlot(originalType);
        System.out.println("接口类型: " + type);
        return type;
    }

    private String transformSlot(String originalType) {
        String type = "type-c";
        System.out.println("使用 " + originalType + " 转 " + type + " 转接头");
        return type;
    }
}
