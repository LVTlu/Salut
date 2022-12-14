
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.salutatouscestdemoncraft.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SalutATousCestDemoncraftModTabs {
	public static CreativeModeTab TAB_SALUT;

	public static void load() {
		TAB_SALUT = new CreativeModeTab("tabsalut") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.GOLD_ORE);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
