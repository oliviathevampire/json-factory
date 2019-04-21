package io.github.cottonmc.jsonfactory.gens.block

import io.github.cottonmc.jsonfactory.data.Identifier
import io.github.cottonmc.jsonfactory.gens.ContentGenerator
import io.github.cottonmc.jsonfactory.gens.GeneratorInfo
import io.github.cottonmc.jsonfactory.output.model.Model
import io.github.cottonmc.jsonfactory.output.suffixed

internal object FenceGateBlockModel : ContentGenerator(
    "fence_gates.block_model", "models/block",
    GeneratorInfo.FENCE_GATES
) {
    override fun generate(id: Identifier) = listOf(
        Model(
            parent = Identifier.mc("block/template_fence_gate"),
            textures = mapOf(
                "texture" to id.prefixPath("block/")
            )
        ).suffixed("fence_gate"),
        Model(
            parent = Identifier.mc("block/template_fence_gate_wall"),
            textures = mapOf(
                "texture" to id.prefixPath("block/")
            )
        ).suffixed("fence_gate_wall"),
        Model(
            parent = Identifier.mc("block/template_fence_gate_open"),
            textures = mapOf(
                "texture" to id.prefixPath("block/")
            )
        ).suffixed("fence_gate_open"),
        Model(
            parent = Identifier.mc("block/template_fence_gate_wall_open"),
            textures = mapOf(
                "texture" to id.prefixPath("block/")
            )
        ).suffixed("fence_gate_wall_open")
    )
}
