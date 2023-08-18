package net.amishi.slimerancher.entity;

import net.amishi.slimerancher.SlimeRancher;
import net.amishi.slimerancher.entity.custom.PinkSlimeEntity;
import net.amishi.slimerancher.entity.custom.TigerSlimeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SlimeRancher.MODID);

    public static final RegistryObject<EntityType<PinkSlimeEntity>> PINK_SLIME = ENTITY_TYPES.register("pink_slime", () -> EntityType.Builder.of(PinkSlimeEntity::new, MobCategory.MONSTER).sized(0.4f, 1.5f).build(new ResourceLocation(SlimeRancher.MODID, "pink_slime").toString()));
    public static final RegistryObject<EntityType<TigerSlimeEntity>> TIGER_SLIME = ENTITY_TYPES.register("tiger_slime", () -> EntityType.Builder.of(TigerSlimeEntity::new, MobCategory.MONSTER).sized(0.4f, 1.5f).build(new ResourceLocation(SlimeRancher.MODID, "tiger_slime").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }


}
