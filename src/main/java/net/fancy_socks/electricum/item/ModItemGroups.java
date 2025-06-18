package net.fancy_socks.electricum.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fancy_socks.electricum.Electricum;
import net.fancy_socks.electricum.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ELECTRIC_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Electricum.MOD_ID, "electricum_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LITHIUM))
                    .displayName(Text.translatable("itemgroup.electricum.electric_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_LITHIUM);
                        entries.add(ModItems.LITHIUM);
                        entries.add(ModBlocks.LITHIUM_BLOCK);
                        entries.add(ModBlocks.LITHIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LITHIUM_ORE);
                        entries.add(ModItems.LIGHTNING_SABER);

                    }).build());

    public static void registerItemGroups () {
        Electricum.LOGGER.info("Registering Item Groups for " + Electricum.MOD_ID);
    }
}
