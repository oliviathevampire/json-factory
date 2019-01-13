package io.github.cottonmc.jsonfactory.gens

import io.github.cottonmc.jsonfactory.data.Identifier
import io.github.cottonmc.jsonfactory.output.Model

object BasicBlockModel : ContentGenerator("Basic Block Model", "models/block", Categories.Block) {
    override fun generate(id: Identifier) = listOf(Model(
        parent = Identifier.mc("block/cube_all"),
        textures = mapOf(
            "all" to id.prefixPath("block/")
        )
    ))
}
