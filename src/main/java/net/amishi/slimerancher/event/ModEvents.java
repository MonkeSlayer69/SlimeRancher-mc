package net.amishi.slimerancher.event;

import net.amishi.slimerancher.SlimeRancher;
import net.amishi.slimerancher.entity.ModEntityTypes;
import net.amishi.slimerancher.entity.custom.PinkSlimeEntity;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = SlimeRancher.MODID)
    public static class ForgeEvents
    {

    }

    @Mod.EventBusSubscriber(modid = SlimeRancher.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class ModEventBusEvents {

        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event){
            SpawnPlacements.register(ModEntityTypes.PINK_SLIME.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, PinkSlimeEntity::checkMonsterSpawnRules);

            event.put(ModEntityTypes.PINK_SLIME.get(), PinkSlimeEntity.setAttributes());
        }

    }
}
