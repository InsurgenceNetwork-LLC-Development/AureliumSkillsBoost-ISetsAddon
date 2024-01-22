package org.insurgencedev.aureliumskillsboost;

import org.insurgencedev.aureliumskillsboost.listeners.SkillsXPGainListener;
import org.insurgencedev.insurgencesets.api.addon.ISetsAddon;
import org.insurgencedev.insurgencesets.api.addon.InsurgenceSetsAddon;
import org.insurgencedev.insurgencesets.libs.fo.Common;

@ISetsAddon(name = "AureliumSkillsBoost", version = "1.0.1", author = "Insurgence Dev Team", description = "Boost the skill experience earned from AureliumSkills")
public class AureliumSkillsBoostAddon extends InsurgenceSetsAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (Common.doesPluginExist("AureliumSkills")) {
            registerEvent(new SkillsXPGainListener());
        }
    }
}
