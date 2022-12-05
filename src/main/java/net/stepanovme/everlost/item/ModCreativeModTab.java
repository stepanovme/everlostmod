package net.stepanovme.everlost.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab EVERLOST_ITEM_TAB = new CreativeModeTab("everlostitemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.FairyDust.get());
        }
    };
}
