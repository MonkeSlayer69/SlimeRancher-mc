package net.amishi.slimerancher.entity.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.amishi.slimerancher.SlimeRancher;
import net.amishi.slimerancher.entity.custom.PinkSlimeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PinkSlimeRenderer extends GeoEntityRenderer<PinkSlimeEntity> {

    public PinkSlimeRenderer(EntityRendererProvider.Context renderManager, AnimatedGeoModel<PinkSlimeEntity> modelProvider) {
        super(renderManager, modelProvider);
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(PinkSlimeEntity instance) {
        return new ResourceLocation(SlimeRancher.MODID, "textures/entity/pink_slime.png");
    }

    @Override
    public RenderType getRenderType(PinkSlimeEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder,
                                    int packedLightIn, ResourceLocation textureLocation) {

        stack.scale(1.0f, 1.0f, 1.0f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
