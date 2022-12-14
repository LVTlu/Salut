package net.minecraft.client.gui.screens;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.Options;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.TooltipAccessor;
import net.minecraft.client.gui.components.VolumeSlider;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.FormattedCharSequence;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SoundOptionsScreen extends OptionsSubScreen {
   @Nullable
   private AbstractWidget directionalAudioButton;

   public SoundOptionsScreen(Screen p_96702_, Options p_96703_) {
      super(p_96702_, p_96703_, Component.translatable("options.sounds.title"));
   }

   protected void init() {
      int i = this.height / 6 - 12;
      int j = 22;
      int k = 0;
      this.addRenderableWidget(new VolumeSlider(this.minecraft, this.width / 2 - 155 + k % 2 * 160, i + 22 * (k >> 1), SoundSource.MASTER, 310));
      k += 2;

      for(SoundSource soundsource : SoundSource.values()) {
         if (soundsource != SoundSource.MASTER) {
            this.addRenderableWidget(new VolumeSlider(this.minecraft, this.width / 2 - 155 + k % 2 * 160, i + 22 * (k >> 1), soundsource, 150));
            ++k;
         }
      }

      if (k % 2 == 1) {
         ++k;
      }

      this.addRenderableWidget(this.options.soundDevice().createButton(this.options, this.width / 2 - 155, i + 22 * (k >> 1), 310));
      k += 2;
      this.addRenderableWidget(this.options.showSubtitles().createButton(this.options, this.width / 2 - 155, i + 22 * (k >> 1), 150));
      this.directionalAudioButton = this.options.directionalAudio().createButton(this.options, this.width / 2 + 5, i + 22 * (k >> 1), 150);
      this.addRenderableWidget(this.directionalAudioButton);
      k += 2;
      this.addRenderableWidget(new Button(this.width / 2 - 100, i + 22 * (k >> 1), 200, 20, CommonComponents.GUI_DONE, (p_96713_) -> {
         this.minecraft.setScreen(this.lastScreen);
      }));
   }

   public void render(PoseStack p_96705_, int p_96706_, int p_96707_, float p_96708_) {
      this.renderBackground(p_96705_);
      drawCenteredString(p_96705_, this.font, this.title, this.width / 2, 15, 16777215);
      super.render(p_96705_, p_96706_, p_96707_, p_96708_);
      if (this.directionalAudioButton != null && this.directionalAudioButton.isMouseOver((double)p_96706_, (double)p_96707_)) {
         List<FormattedCharSequence> list = ((TooltipAccessor)this.directionalAudioButton).getTooltip();
         this.renderTooltip(p_96705_, list, p_96706_, p_96707_);
      }

   }
}