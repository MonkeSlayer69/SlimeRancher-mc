package net.amishi.slimerancher.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {

    public static final CreativeModeTab SLIME_RANCHER_TAB = new CreativeModeTab("Slime Rancher") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };
}
