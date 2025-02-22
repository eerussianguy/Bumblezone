package com.telepathicgrunt.the_bumblezone.modcompat;

import com.telepathicgrunt.the_bumblezone.configs.BzModCompatibilityConfigs;
import com.telepathicgrunt.the_bumblezone.modinit.BzItems;
import vazkii.quark.content.client.tooltip.EnchantedBookTooltips;

public class QuarkCompat {
    public static void setupCompat() {
        if(BzModCompatibilityConfigs.injectBzItemsIntoQuarkEnchantmentTooltipsCompat.get()) {
            setupEnchantmentTooltipItemsSymbols();
        }

       // Keep at end so it is only set to true if no exceptions was thrown during setup
        ModChecker.quarkPresent = true;
    }

    public static void setupEnchantmentTooltipItemsSymbols() {
        EnchantedBookTooltips.getTestItems().add(BzItems.STINGER_SPEAR.get().getDefaultInstance());
        EnchantedBookTooltips.getTestItems().add(BzItems.CRYSTAL_CANNON.get().getDefaultInstance());
        EnchantedBookTooltips.getTestItems().add(BzItems.HONEY_CRYSTAL_SHIELD.get().getDefaultInstance());
    }
}
