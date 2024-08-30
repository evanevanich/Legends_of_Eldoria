package net.evoon.LoE.item;

import net.evoon.LoE.LoE;
import net.evoon.LoE.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LoE.MOD_ID);

    public static final RegistryObject<Item> ITHILANIUM = ITEMS.register("ithilanium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ITHILANIUM_INGOT = ITEMS.register("ithilanium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCUT_QUARTZ = ITEMS.register("uncut_quartz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> QUARTZ_GEM = ITEMS.register("quartz_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_STEEL = ITEMS.register("dwarven_steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTITE = ITEMS.register("adamantite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCUT_OPAL = ITEMS.register("uncut_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OPAL_GEM = ITEMS.register("opal_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCUT_SAPPHIRE = ITEMS.register("uncut_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCUT_CITRINE = ITEMS.register("uncut_citrine",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CITRINE_GEM = ITEMS.register("citrine_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCUT_CORUNDUM = ITEMS.register("uncut_corundum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CORUNDUM_GEM = ITEMS.register("corundum_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCUT_RUBY = ITEMS.register("uncut_ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCUT_PERIDOT = ITEMS.register("uncut_peridot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERIDOT_GEM = ITEMS.register("peridot_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORE_DIVINING_ROD = ITEMS.register("ore_divining_rod",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
