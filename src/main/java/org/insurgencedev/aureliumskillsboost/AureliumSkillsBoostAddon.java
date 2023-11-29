package org.insurgencedev.aureliumskillsboost;

import org.bukkit.Bukkit;
import org.insurgencedev.insurgencesets.api.addon.ISetsAddon;
import org.insurgencedev.insurgencesets.api.addon.InsurgenceSetsAddon;

@ISetsAddon(name = "AureliumSkillsBoost", version = "1.0.0", author = "Insurgence Dev Team", description = "Boost the skill experience earned from AureliumSkills")
public class AureliumSkillsBoostAddon extends InsurgenceSetsAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (isDependentEnabled()) {
            registerEvent(new SkillsXPGainListener());
        }
    }

    private boolean isDependentEnabled() {
        return Bukkit.getPluginManager().isPluginEnabled("AureliumSkills");
    }
}
