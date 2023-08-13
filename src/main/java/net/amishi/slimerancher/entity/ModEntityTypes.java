package net.amishi.slimerancher.entity;

import net.amishi.slimerancher.SlimeRancher;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = SlimeRancher.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SlimeRancher.MODID);

    public static final RegistryObject<EntityType<PinkSlimeEntity>> PINK_SLIME = ENTITY_TYPES.register("pink_slime", () -> EntityType.Builder.of(PinkSlimeEntity::new, MobCategory.MONSTER).sized(0.4f, 1.5f).build(new ResourceLocation(SlimeRancher.MODID, "pink_slime").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

    @SubscribeEvent
    public static void initializeAttributes(EntityAttributeCreationEvent event) {
        //SpawnPlacements.register(PINK_SLIME.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, PinkSlimeEntity::checkMonsterSpawnRules);

        event.put(ModEntityTypes.PINK_SLIME.get(), PinkSlimeEntity.setAttributes());
    }

}
