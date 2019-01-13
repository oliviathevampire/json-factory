package io.github.cottonmc.jsonfactory.gens

import io.github.cottonmc.jsonfactory.data.Identifier
import io.github.cottonmc.jsonfactory.gens.variants.*

/**
 * Lists [ContentGenerator]s.
 *
 * The generator properties (apart from [allGens]) are mostly version-independent and
 * won't change as often as their classes.
 */
object Gens {
    /**
     * The `block/cube_all` (default) block model generator.
     */
    val basicBlockModel = BasicBlockModel

    /**
     * The `item/generated` (default) item model generator.
     */
    val basicItemModel = BasicItemModel(Identifier.mc("item/generated"))

    /**
     * The `item/handheld` item model generator.
     */
    val basicHandheldItemModel = BasicItemModel(Identifier.mc("item/handheld"), " (Handheld)")

    /**
     * The block item model generator.
     */
    val basicBlockItemModel = BasicBlockItemModel

    /**
     * The basic `blockstates` file generator.
     */
    val basicBlockState = BasicBlockState

    /**
     * The basic loot table generator.
     */
    val basicLootTable = BasicLootTable

    /**
     * The placeholder block texture generator.
     */
    val placeholderTextureBlock = PlaceholderTexture(ContentGenerator.Categories.Block)

    /**
     * The placeholder block texture generator.
     */
    val placeholderTextureItem = PlaceholderTexture(ContentGenerator.Categories.Item)

    /**
     * The base ore block model generator.
     *
     * NOTE: The child ore models assume that this is named `modid:ore_template`.
     */
    val oreTemplateModel = BaseOreBlockModel

    /**
     * The stone ore block model generator.
     */
    val stoneOreBlockModel = OreBlockModel("Stone", Identifier.mc("block/stone"))

    /**
     * The netherrack ore block model generator.
     */
    val netherrackOreBlockModel = OreBlockModel("Netherrack", Identifier.mc("block/netherrack"))

    /**
     * The pillar block model generator.
     */
    val pillarBlockModel = PillarBlockModel

    /**
     * The pillar block state generator.
     */
    val pillarBlockState = PillarBlockState

    object Variants {
        // SLABS

        /**
         * The slab block model generator.
         */
        val slabBlockModel = SlabBlockModel

        /**
         * The slab blockstate generator.
         */
        val slabBlockState = SlabBlockState

        /**
         * The slab item model generator.
         */
        val slabItemModel = SuffixedBlockItemModel("Slab", "slab")

        /**
         * The slab loot table generator.
         */
        val slabLootTable = SlabLootTable

        // STAIRS

        /**
         * The stair block model generator.
         */
        val stairBlockModel = StairBlockModel

        /**
         * The stair blockstate generator.
         */
        val stairBlockState = StairBlockState

        /**
         * The stair item model generator.
         */
        val stairItemModel = SuffixedBlockItemModel("Stair", "stairs")

        /**
         * The stair loot table generator.
         */
        val stairLootTable = SuffixedLootTable("Stair", "stairs")

        // PRESSURE PLATES

        /**
         * The pressure plate block model generator.
         */
        val pressurePlateBlockModel = PressurePlateBlockModel

        /**
         * The pressure plate blockstate generator.
         */
        val pressurePlateBlockState = PressurePlateBlockState

        /**
         * The pressure plate item model generator.
         */
        val pressurePlateItemModel = SuffixedBlockItemModel("Pressure Plate", "pressure_plate")

        /**
         * The pressure plate loot table generator.
         */
        val pressurePlateLootTable = SuffixedLootTable("Pressure Plate", "pressure_plate")

        // BUTTONS

        /**
         * The button block model generator.
         */
        val buttonBlockModel = ButtonBlockModel

        /**
         * The button blockstate generator.
         */
        val buttonBlockState = ButtonBlockState

        /**
         * The button item model generator.
         */
        val buttonItemModel = SuffixedBlockItemModel("Button", "button", "button_inventory")

        /**
         * The button loot table generator.
         */
        val buttonLootTable = SuffixedLootTable("Button", "button")

        // FENCES

        /**
         * The fence block model generator.
         */
        val fenceBlockModel = FenceBlockModel

        /**
         * The fence blockstate generator.
         */
        val fenceBlockState = FenceBlockState

        /**
         * The fence item model generator.
         */
        val fenceItemModel = SuffixedBlockItemModel("Fence", "fence", "fence_inventory")

        /**
         * The fence loot table generator.
         */
        val fenceLootTable = SuffixedLootTable("Fence", "fence")

        // WALLS

        /**
         * The wall block model generator.
         */
        val wallBlockModel = WallBlockModel

        /**
         * The wall blockstate generator.
         */
        val wallBlockState = WallBlockState

        /**
         * The wall item model generator.
         */
        val wallItemModel = SuffixedBlockItemModel("Wall", "wall", "wall_inventory")

        /**
         * The wall loot table generator.
         */
        val wallLootTable = SuffixedLootTable("Wall", "wall")

        // SIGNS

        /**
         * The sign block model generator.
         */
        val signBlockModel = SignBlockModel

        /**
         * The sign blockstate generator.
         */
        val signBlockState = SignBlockState

        /**
         * The sign item model generator.
         */
        val signItemModel = SuffixedItemModel(Identifier.mc("item/generated"), "Sign", "sign", ContentGenerator.Categories.BlockVariants)

        /**
         * The sign loot table generator.
         */
        val signLootTable = SuffixedLootTable("Sign", "sign")
    }

    /**
     * An array of all generators.
     */
    val allGens = arrayOf(
        basicBlockModel,
        basicItemModel,
        basicHandheldItemModel,
        basicBlockItemModel,
        basicBlockState,
        basicLootTable,
        placeholderTextureBlock,
        placeholderTextureItem,
        // Ores
        oreTemplateModel,
        stoneOreBlockModel,
        netherrackOreBlockModel,
        // Pillars
        pillarBlockModel,
        pillarBlockState,
        // Slabs
        Variants.slabBlockModel,
        Variants.slabBlockState,
        Variants.slabItemModel,
        Variants.slabLootTable,
        // Stairs
        Variants.stairBlockModel,
        Variants.stairBlockState,
        Variants.stairItemModel,
        Variants.stairLootTable,
        // Pressure plates
        Variants.pressurePlateBlockModel,
        Variants.pressurePlateBlockState,
        Variants.pressurePlateItemModel,
        Variants.pressurePlateLootTable,
        // Buttons
        Variants.buttonBlockModel,
        Variants.buttonBlockState,
        Variants.buttonItemModel,
        Variants.buttonLootTable,
        // Fences
        Variants.fenceBlockModel,
        Variants.fenceBlockState,
        Variants.fenceItemModel,
        Variants.fenceLootTable,
        // Walls
        Variants.wallBlockModel,
        Variants.wallBlockState,
        Variants.wallItemModel,
        Variants.wallLootTable,
        // Signs
        Variants.signBlockModel,
        Variants.signBlockState,
        Variants.signItemModel,
        Variants.signLootTable
    )
}
