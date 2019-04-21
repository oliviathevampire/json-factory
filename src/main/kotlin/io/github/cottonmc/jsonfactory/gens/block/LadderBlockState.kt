package io.github.cottonmc.jsonfactory.gens.block

import io.github.cottonmc.jsonfactory.data.BlockStateProperty
import io.github.cottonmc.jsonfactory.data.Identifier
import io.github.cottonmc.jsonfactory.gens.ContentGenerator
import io.github.cottonmc.jsonfactory.gens.GeneratorInfo
import io.github.cottonmc.jsonfactory.output.model.ModelBlockState
import io.github.cottonmc.jsonfactory.output.suffixed

internal object LadderBlockState : ContentGenerator("ladders.block_state", "blockstates", GeneratorInfo.LADDERS) {
    private fun getYRotation(facing: String) = when (facing) {
        "east" -> 90
        "south" -> 180
        "west" -> 270
        else -> 0
    }

    override fun generate(id: Identifier) = listOf(
        ModelBlockState.create(id, setOf(BlockStateProperty.horizontalFacing)) { values, variant ->
            variant.copy(
                model = variant.model.suffixPath("_ladder"),
                y = getYRotation(values["facing"] ?: "")
            )
        }.suffixed("ladder")
    )
}
