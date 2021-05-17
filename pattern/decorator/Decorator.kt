package com.cherry.pattern.decorator

/**
 * 装饰的抽象
 * 完成原始逻辑处理 同时
 * 作为抽象层 提供给真正扩展的底层类使用
 */
open class Decorator(private val component: Component) : Component {

    override fun operation() {
        component.operation()
    }

}
