package net.evoon.LoE.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

public class ModFoods {
    public static final FoodProperties RAT_SKEWER = new FoodProperties.Builder().nutrition(3).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().build();

    public static final FoodProperties RAT_SKEWER_COOKED = new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).meat().build();
}