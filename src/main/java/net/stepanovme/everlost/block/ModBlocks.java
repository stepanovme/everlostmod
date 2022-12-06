package net.stepanovme.everlost.block;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stepanovme.everlost.Everlost;
import net.stepanovme.everlost.item.ModCreativeModTab;
import net.stepanovme.everlost.item.ModItem;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Everlost.Mod_ID);

    public static final RegistryObject<Block> ANGULAR_BASE_OF_ARAGIS_RIGHT = registerBlock("angular_base_of_aragis_right",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModTab.EVERLOST_BLOCKS_TAB);
    public static final RegistryObject<Block> ANGULAR_BASE_OF_ARAGIS_LEFT = registerBlock("angular_base_of_aragis_left",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModTab.EVERLOST_BLOCKS_TAB);
    public static final RegistryObject<Block> ANGULAR_BASE_OF_ARAGIS_BOTTOM_RIGHT = registerBlock("angular_base_of_aragis_bottom_right",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModTab.EVERLOST_BLOCKS_TAB);
    public static final RegistryObject<Block> ANGULAR_BASE_OF_ARAGIS_BOTTOM_LEFT = registerBlock("angular_base_of_aragis_bottom_left",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModTab.EVERLOST_BLOCKS_TAB);
    public static final RegistryObject<Block> ANGULAR_BASE_OF_ARAGIS_COLUMN = registerBlock("angular_base_of_aragis_column",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModTab.EVERLOST_BLOCKS_TAB);
    public static final RegistryObject<Block> ANGULAR_BASE_OF_ARAGIS_ROW = registerBlock("angular_base_of_aragis_row",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModTab.EVERLOST_BLOCKS_TAB);

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends  Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItem.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
