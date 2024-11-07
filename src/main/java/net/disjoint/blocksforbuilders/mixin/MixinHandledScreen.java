package net.disjoint.blocksforbuilders.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.*;

@Mixin(HandledScreen.class)
public abstract class MixinHandledScreen extends Screen {

    @Unique
    String suffix;

    @Shadow
    protected int titleY;

    @Shadow protected int titleX;

    @Shadow @Final
    protected Text playerInventoryTitle;

    @Shadow protected int playerInventoryTitleX;

    @Shadow protected int playerInventoryTitleY;


    protected MixinHandledScreen(Text title) {
        super(title);
    }
    /**
     * @author Fellter
     * @reason Overflowing text in Chest boat inventory
     */
    @Overwrite
    public void drawForeground(DrawContext context, int mouseX, int mouseY) {
        setSuffixForRender("Boat");
        float max = 29;
        MatrixStack matrices = context.getMatrices();
        int length = title.getString().length();
        if (length > max && title.getString().endsWith(suffix)) {
            matrices.push();
            matrices.translate(this.titleX, this.titleY, 0.0f);
            matrices.scale(max / length, 1.0f, 1);
            context.drawText(this.textRenderer, this.title, 0, 0, 4210752, false);
            matrices.pop();
            context.drawText(textRenderer, this.playerInventoryTitle, this.playerInventoryTitleX, this.playerInventoryTitleY, 4210752, false);
        } else {
            context.drawText(this.textRenderer, this.title, titleX, titleY, 4210752, false);
            context.drawText(textRenderer, this.playerInventoryTitle, this.playerInventoryTitleX, this.playerInventoryTitleY, 4210752, false);
        }
    }

    @Unique
    public void setSuffixForRender(String string) {
        suffix = string;
    }

    @Unique
    public String getSuffixFromRender() {
        return suffix;
    }

}
