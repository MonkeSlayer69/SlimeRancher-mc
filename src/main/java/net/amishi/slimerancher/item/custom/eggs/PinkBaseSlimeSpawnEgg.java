package net.amishi.slimerancher.item.custom.eggs;

import net.amishi.slimerancher.item.custom.BaseSlimeSpawnEgg;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PinkBaseSlimeSpawnEgg extends BaseSlimeSpawnEgg {

    private static final String TOOLTIP_INFO = "tooltip.slimerancher.pink_slime_spawn_egg";

    public PinkBaseSlimeSpawnEgg(EntityType<? extends Mob> pDefaultType, Properties pProperties) {
        super(pDefaultType, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable(TOOLTIP_INFO).withStyle(ChatFormatting.RED));
        } else {
            pTooltipComponents.add(Component.translatable(TOOLTIP_SHIFT_DOWN).withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
