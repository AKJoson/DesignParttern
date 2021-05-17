package com.cherry.pattern.decorator

class OriginComponent : Component {

    /**
     * Just do what you want.
     */
    override fun operation() {
        //get something
        println("${OriginComponent::class.java.name},do some thing...")
    }
}