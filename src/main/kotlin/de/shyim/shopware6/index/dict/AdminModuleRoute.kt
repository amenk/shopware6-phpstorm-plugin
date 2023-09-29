package de.shyim.shopware6.index.dict

import org.apache.commons.lang3.builder.HashCodeBuilder
import java.io.Serializable
import java.util.*

class AdminModuleRoute(
    var name: String,
    var component: String? = null
) : Serializable {
    override fun hashCode(): Int {
        return HashCodeBuilder()
            .append(this.name)
            .append(this.component)
            .toHashCode()
    }

    override fun equals(other: Any?): Boolean {
        return other is AdminModuleRoute &&
                Objects.equals(other.name, this.name) &&
                Objects.equals(other.component, this.component)
    }
}