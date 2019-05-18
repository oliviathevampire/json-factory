package io.github.cottonmc.jsonfactory.gens.block

import io.github.cottonmc.jsonfactory.data.Identifier
import io.github.cottonmc.jsonfactory.gens.AbstractContentGenerator
import io.github.cottonmc.jsonfactory.gens.GeneratorInfo
import io.github.cottonmc.jsonfactory.output.model.ModelBlockState
import io.github.cottonmc.jsonfactory.output.suffixed

internal object PressurePlateBlockState : AbstractContentGenerator(
    "pressure_plates.block_state", "blockstates",
    GeneratorInfo.PRESSURE_PLATES
) {
    override fun generate(id: Identifier) = listOf(
        ModelBlockState(
            mapOf(
                "powered=false" to ModelBlockState.Variant(id.copy(path = "block/${id.path}_pressure_plate")),
                "powered=true" to ModelBlockState.Variant(id.copy(path = "block/${id.path}_pressure_plate_down"))
            )
        ).suffixed("pressure_plate")
    )
}
