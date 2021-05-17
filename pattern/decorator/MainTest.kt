package com.cherry.pattern.decorator

fun main() {
    //原始逻辑处理,可在不改动原来代码的情况下，增加逻辑处理
    val realComponent = OriginComponent()
    //扩展一层 装饰
    val expandDecorator = ExpandDecorator(realComponent)
    expandDecorator.operation()
}