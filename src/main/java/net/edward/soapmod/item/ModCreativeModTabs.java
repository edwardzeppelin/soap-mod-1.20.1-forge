package net.edward.soapmod.item;

import net.edward.soapmod.SoapMod;
import net.edward.soapmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SoapMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SOAP_TAB = CREATIVE_MODE_TABS.register("soap_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SOAP.get()))
                    .title(Component.translatable("creativetab.soap_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //pOutput.accept(ModItems.SOAP.get());
                        pOutput.accept(ModItems.TASTY_SOAP.get());
                        pOutput.accept(ModBlocks.SOAP_BLOCK.get());
                        pOutput.accept(ModItems.FAT.get());
                        pOutput.accept(ModItems.BEER.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
