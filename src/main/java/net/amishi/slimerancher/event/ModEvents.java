package net.amishi.slimerancher.event;

import net.amishi.slimerancher.SlimeRancher;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = SlimeRancher.MODID)
    public static class ForgeEvents
    {

    }

    @Mod.EventBusSubscriber(modid = SlimeRancher.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class ModEventBusEvents {


    }
}
