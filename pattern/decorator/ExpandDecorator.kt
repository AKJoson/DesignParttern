package com.cherry.pattern.decorator

/**
 *  不改动原有逻辑的同时，完成扩展！
 */
class ExpandDecorator(component: Component) : Decorator(component) {

    override fun operation() {
        //原有逻辑
        super.operation()
        //完成扩展
        expandFunOne()
    }

    private fun expandFunOne() {
        println("在不改动原来逻辑的情况下,增加新的处理逻辑~~")
    }

}