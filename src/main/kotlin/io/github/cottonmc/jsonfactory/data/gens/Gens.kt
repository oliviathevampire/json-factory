package io.github.cottonmc.jsonfactory.data.gens

object Gens {
    val allGens = arrayOf(
        BasicBlockModel,
        BasicItemModel,
        BasicBlockItemModel,
        BasicBlockState,
        BasicLootTable,
        PlaceholderTexture("Block", "block"),
        PlaceholderTexture("Item", "item")
    )
}
