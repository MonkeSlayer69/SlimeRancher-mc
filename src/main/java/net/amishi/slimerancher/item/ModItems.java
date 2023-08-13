package net.amishi.slimerancher.item;

import net.amishi.slimerancher.SlimeRancher;
import net.amishi.slimerancher.entity.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SlimeRancher.MODID);

    public static final RegistryObject<Item> PINK_SLIME_SPAWN_EGG = ITEMS.register("pink_slime_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.PINK_SLIME, 0x22b341, 0x19732e, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
