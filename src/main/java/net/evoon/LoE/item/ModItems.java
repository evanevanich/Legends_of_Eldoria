package net.evoon.LoE.item;

import net.evoon.LoE.LoE;
import net.evoon.LoE.item.custom.FuelItem;
import net.evoon.LoE.item.custom.MetalDetectorItem;
import net.minecraft.world.item.*;
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


    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 200));




    public static final RegistryObject<Item> DWARVEN_SWORD = ITEMS.register("dwarven_sword",
            () -> new SwordItem(ModToolTiers.DWARVEN, 4,2, new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_PICKAXE = ITEMS.register("dwarven_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DWARVEN, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_AXE = ITEMS.register("dwarven_axe",
            () -> new AxeItem(ModToolTiers.DWARVEN, 4, 1, new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_SHOVEL = ITEMS.register("dwarven_shovel",
            () -> new ShovelItem(ModToolTiers.DWARVEN, 0,0, new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_HOE = ITEMS.register("dwarven_hoe",
            () -> new HoeItem(ModToolTiers.DWARVEN, 0,0, new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_BATTLEAXE = ITEMS.register("dwarven_battleaxe",
            () -> new AxeItem(ModToolTiers.DWARVEN, 7,1, new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_DAGGER = ITEMS.register("dwarven_dagger",
            () -> new SwordItem(ModToolTiers.DWARVEN, 2,3, new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_HALBERD = ITEMS.register("dwarven_halberd",
            () -> new SwordItem(ModToolTiers.DWARVEN, 7,1, new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_HATCHET = ITEMS.register("dwarven_hatchet",
            () -> new AxeItem(ModToolTiers.DWARVEN, 7,2, new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_KNIFE = ITEMS.register("dwarven_knife",
            () -> new ShearsItem(new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_PIKE = ITEMS.register("dwarven_pike",
            () -> new SwordItem(ModToolTiers.DWARVEN, 7,1, new Item.Properties()));

    public static final RegistryObject<Item> DWARVEN_SPEAR = ITEMS.register("dwarven_spear",
            () -> new SwordItem(ModToolTiers.DWARVEN, 7,1, new Item.Properties()));



    public static final RegistryObject<Item> ORE_DIVINATION_RUNE = ITEMS.register("ore_divination_rune",
            () -> new MetalDetectorItem(new Item.Properties().durability(15)));




    public static final RegistryObject<Item> ELVEN_STAFF = ITEMS.register("elven_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));







    public static final RegistryObject<Item> RAT_SKEWER = ITEMS.register("rat_skewer",
            () -> new Item(new Item.Properties().food(ModFoods.RAT_SKEWER)));

    public static final RegistryObject<Item> RAT_SKEWER_COOKED = ITEMS.register("rat_skewer_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.RAT_SKEWER_COOKED)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
