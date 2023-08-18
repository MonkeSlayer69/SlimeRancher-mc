package net.amishi.slimerancher.entity.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.amishi.slimerancher.SlimeRancher;
import net.amishi.slimerancher.entity.client.model.TigerSlimeModel;
import net.amishi.slimerancher.entity.custom.PinkSlimeEntity;
import net.amishi.slimerancher.entity.custom.TigerSlimeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TigerSlimeRenderer extends GeoEntityRenderer<TigerSlimeEntity> {

    public TigerSlimeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TigerSlimeModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(TigerSlimeEntity instance) {
        return new ResourceLocation(SlimeRancher.MODID, "textures/entity/pink_slime_texture.png");
    }

    @Override
    public RenderType getRenderType(TigerSlimeEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder,
                                    int packedLightIn, ResourceLocation textureLocation) {

        stack.scale(5.0f, 5.0f, 5.0f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
