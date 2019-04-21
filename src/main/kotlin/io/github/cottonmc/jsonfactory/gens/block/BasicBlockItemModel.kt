package io.github.cottonmc.jsonfactory.gens.block

import io.github.cottonmc.jsonfactory.data.Identifier
import io.github.cottonmc.jsonfactory.gens.ContentGenerator
import io.github.cottonmc.jsonfactory.gens.GeneratorInfo
import io.github.cottonmc.jsonfactory.output.model.Model

internal object BasicBlockItemModel : ContentGenerator("basic.block_item_model", "models/item", GeneratorInfo.BLOCK) {
    override fun generate(id: Identifier) = listOf(
        Model(
            parent = id.prefixPath("block/")
        )
    )
}
