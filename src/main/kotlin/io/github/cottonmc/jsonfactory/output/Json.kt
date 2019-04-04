package io.github.cottonmc.jsonfactory.output

import com.google.gson.GsonBuilder
import java.io.File
import java.io.OutputStream

/**
 * A JSON output.
 */
interface Json : Output {
    override fun writeToFile(file: File) = file.writeText(toJson(this))
    override fun writeToStream(stream: OutputStream) =
        stream.bufferedWriter().write(toJson(this))

    /**
     * Converts this output to a JSON string.
     * @since 0.3.3
     */
    fun toJsonString(): String = toJson(this)

    /**
     * A JSON output that is generated from the [properties].
     */
    interface ByProperties : Json {
        val properties: List<Property<*>>
    }

    companion object {
        private val gson = GsonBuilder()
            .registerTypeHierarchyAdapter(Json.ByProperties::class.java, Property)
            .disableHtmlEscaping()
            .setPrettyPrinting()
            .create()

        /**
         * Converts an [obj] to a JSON string.
         */
        fun toJson(obj: Any): String =
            gson.toJson(obj)
    }
}
