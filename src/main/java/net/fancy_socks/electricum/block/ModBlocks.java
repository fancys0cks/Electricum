package net.fancy_socks.electricum.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fancy_socks.electricum.Electricum;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block LITHIUM_BLOCK = registerBlock("lithium_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block LITHIUM_ORE = registerBlock("lithium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 5), AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block DEEPSLATE_LITHIUM_ORE = registerBlock("deepslate_lithium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 5), AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));


    public static Block registerBlock(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Electricum.MOD_ID, name), new BlockItem(block, new Item.Settings()));

        return Registry.register(Registries.BLOCK, Identifier.of(Electricum.MOD_ID, name), block);
    }

    public static void registerBlocks() {
        Electricum.LOGGER.info("Registering blocks for "+ Electricum.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(LITHIUM_BLOCK);
            entries.add(LITHIUM_ORE);
            entries.add(DEEPSLATE_LITHIUM_ORE);
        });
    }
}
