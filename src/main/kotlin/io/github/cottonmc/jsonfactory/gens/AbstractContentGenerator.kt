package io.github.cottonmc.jsonfactory.gens

import io.github.cottonmc.jsonfactory.data.Identifier
import io.github.cottonmc.jsonfactory.output.Output

/**
 * A base class for [ContentGenerator]s, that defines its properties in the constructor.
 *
 * @property displayName the display name of this generator
 * @property path the output directory
 * @property info the generator info
 * @property extension the file extension (without the dot)
 * @property resourceRoot the resource root
 */
abstract class AbstractContentGenerator(
    override val displayName: String,
    override val path: String,
    override val info: GeneratorInfo,
    override val extension: String = "json",
    override val resourceRoot: ResourceRoot = ResourceRoot.Assets
) : ContentGenerator {
    abstract override fun generate(id: Identifier): List<Output>

    override fun toString() = displayName

    enum class ResourceRoot(val path: String) {
        Assets("assets"), Data("data")
    }
}
