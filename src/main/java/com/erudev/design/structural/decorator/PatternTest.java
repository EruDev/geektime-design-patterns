package com.erudev.design.structural.decorator;

/**
 * @author pengfei.zhao
 * @date 2020/12/7 20:30
 */
public class PatternTest {
    public static void main(String[] args) {
        KeyBoard baseKeyBoard = new BaseKeyBoard();
        printInfo(baseKeyBoard);

        MechanicalKeyBoard mechanicalKeyBoard = new MechanicalKeyBoard(baseKeyBoard);
        printInfo(mechanicalKeyBoard);
    }

    public static void printInfo(KeyBoard keyBoard) {
        System.out.println("当前材质: " + keyBoard.getMaterial());
        System.out.println("当前类型: " + keyBoard.getType());
        System.out.println("当前价格: " + keyBoard.getPrice());
    }
}
