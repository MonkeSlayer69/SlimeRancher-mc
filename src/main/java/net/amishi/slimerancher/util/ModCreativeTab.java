package net.amishi.slimerancher.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeTab {

    public static final CreativeModeTab SLIME_RANCHER_TAB = new CreativeModeTab("slime_rancher") {
        @Override
        public ItemStack makeIcon() {
            return Items.BOW.getDefaultInstance();
        }
    };
}
