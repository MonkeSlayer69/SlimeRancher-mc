package net.amishi.slimerancher.entity.client.model;

import net.amishi.slimerancher.SlimeRancher;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PinkSlimeModel extends AnimatedGeoModel {

    @Override
    public ResourceLocation getModelResource(Object object) {
        return new ResourceLocation(SlimeRancher.MODID, "geo/pink_slime.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Object object) {
        return new ResourceLocation(SlimeRancher.MODID, "textures/entity/pink_slime_texture.png");
    }


    @Override
    public ResourceLocation getAnimationResource(Object animatable) {
        return new ResourceLocation(SlimeRancher.MODID, "animations/pink_slime.animation.json");
    }

}
