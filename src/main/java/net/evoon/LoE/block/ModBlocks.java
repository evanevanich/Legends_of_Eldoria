package net.evoon.LoE.block;

import net.evoon.LoE.LoE;
import net.evoon.LoE.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LoE.MOD_ID);

    public static final RegistryObject<Block> DWARVEN_STEEL_BLOCK = registerBlock("dwarven_steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_ITHILANIUM_BLOCK = registerBlock("raw_ithilanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).sound(SoundType.AMETHYST).lightLevel(value -> 5)));

    public static final RegistryObject<Block> ITHILANIUM_BLOCK = registerBlock("ithilanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).sound(SoundType.AMETHYST).lightLevel(value -> 5)));

    public static final RegistryObject<Block> ITHILANIUM_ORE = registerBlock("ithilanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).sound(SoundType.AMETHYST).lightLevel(value -> 3)));

    public static final RegistryObject<Block> DEEPSLATE_ITHILANIUM_ORE = registerBlock("deepslate_ithilanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).sound(SoundType.AMETHYST).lightLevel(value -> 3)));

    public static final RegistryObject<Block> DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> QUARTZ_ORE = registerBlock("quartz_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).sound(SoundType.NETHER_ORE)));

    public static final RegistryObject<Block> UNCUT_QUARTZ_BLOCK = registerBlock("uncut_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).sound(SoundType.STONE)));

    public static final RegistryObject<Block> REFINED_QUARTZ_BLOCK = registerBlock("refined_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ADAMANTITE_ORE = registerBlock("adamantite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> DEEPSLATE_ADAMANTITE_ORE = registerBlock("deepslate_adamantite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_ADAMANTITE_BLOCK = registerBlock("raw_adamantite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ADAMANTITE_BLOCK = registerBlock("adamantite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).sound(SoundType.METAL)));

    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).sound(SoundType.METAL)));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

    public static final RegistryObject<Block> DEEPSLATE_OPAL_ORE = registerBlock("deepslate_opal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> OPAL_ORE = registerBlock("opal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> UNCUT_OPAL_BLOCK = registerBlock("uncut_opal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> REFINED_OPAL_BLOCK = registerBlock("refined_opal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> UNCUT_SAPPHIRE_BLOCK = registerBlock("uncut_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> REFINED_SAPPHIRE_BLOCK = registerBlock("refined_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> UNCUT_CITRINE_BLOCK = registerBlock("uncut_citrine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> REFINED_CITRINE_BLOCK = registerBlock("refined_citrine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> DEEPSLATE_CORUNDUM_ORE = registerBlock("deepslate_corundum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> CORUNDUM_ORE = registerBlock("corundum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).sound(SoundType.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> UNCUT_CORUNDUM_BLOCK = registerBlock("uncut_corundum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> REFINED_CORUNDUM_BLOCK = registerBlock("refined_corundum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> PURPLE_MUSHROOM = registerBlock("purple_mushroom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).sound(SoundType.CROP)));

    public static final RegistryObject<Block> DEEPSLATE_GLOWSTONE_ORE = registerBlock("deepslate_glowstone_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).sound(SoundType.DEEPSLATE).lightLevel(value -> 7)));

    public static final RegistryObject<Block> GLOWSTONE_ORE = registerBlock("glowstone_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).sound(SoundType.AMETHYST_CLUSTER).lightLevel(value -> 7)));

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> UNCUT_RUBY_BLOCK = registerBlock("uncut_ruby_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> REFINED_RUBY_BLOCK = registerBlock("refined_ruby_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> PERIDOT_ORE = registerBlock("peridot_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> UNCUT_PERIDOT_BLOCK = registerBlock("uncut_peridot_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> REFINED_PERIDOT_BLOCK = registerBlock("refined_peridot_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier <T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends  Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register (IEventBus eventBus) {
    BLOCKS.register(eventBus);
    }
}
