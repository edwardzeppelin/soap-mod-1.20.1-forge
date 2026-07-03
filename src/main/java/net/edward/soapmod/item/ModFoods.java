package net.edward.soapmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties TASTY_SOAP = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f)
            .effect(()->new MobEffectInstance(MobEffects.POISON, 1200), 0.25f).build();

    public static final FoodProperties BEER = new FoodProperties.Builder().nutrition(6).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.LEVITATION, 600), 0.10f).build();
}
