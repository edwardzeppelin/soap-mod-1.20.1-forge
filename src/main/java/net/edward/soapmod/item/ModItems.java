package net.edward.soapmod.item;

import net.edward.soapmod.SoapMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SoapMod.MOD_ID);

    public static final RegistryObject<Item> SOAP = ITEMS.register("soap",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FAT = ITEMS.register("fat",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TASTY_SOAP = ITEMS.register("tasty_soap",
            ()-> new Item(new Item.Properties().food(ModFoods.TASTY_SOAP)));

    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            ()-> new Item(new Item.Properties().food(ModFoods.BEER)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
