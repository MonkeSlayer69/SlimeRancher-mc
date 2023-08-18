package net.amishi.slimerancher.item;

import net.amishi.slimerancher.SlimeRancher;
import net.amishi.slimerancher.entity.ModEntityTypes;
import net.amishi.slimerancher.item.custom.eggs.PinkBaseSlimeSpawnEgg;
import net.amishi.slimerancher.item.custom.eggs.TigerBaseSlimeSpawnEgg;
import net.amishi.slimerancher.util.ModCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SlimeRancher.MODID);

    public static final RegistryObject<Item> PINK_SLIME_SPAWN_EGG = ITEMS.register("pink_slime_spawn_egg", () -> new PinkBaseSlimeSpawnEgg(ModEntityTypes.PINK_SLIME.get(), new Item.Properties().tab(ModCreativeTab.SLIME_RANCHER_TAB)));
    public static final RegistryObject<Item> TIGER_SLIME_SPAWN_EGG = ITEMS.register("tiger_slime_spawn_egg", () -> new TigerBaseSlimeSpawnEgg(ModEntityTypes.PINK_SLIME.get(), new Item.Properties().tab(ModCreativeTab.SLIME_RANCHER_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
