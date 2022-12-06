package net.stepanovme.everlost.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.stepanovme.everlost.block.ModBlocks;

public class ModCreativeModTab {
    public static final CreativeModeTab EVERLOST_ITEM_TAB = new CreativeModeTab("everlostitemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.FairyDust.get());
        }
    };

    public static final CreativeModeTab EVERLOST_BLOCKS_TAB = new CreativeModeTab("everlostblockstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.ANGULAR_BASE_OF_ARAGIS_COLUMN.get());
        }
    };
}
