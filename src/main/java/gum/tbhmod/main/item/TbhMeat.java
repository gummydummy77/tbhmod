package gum.tbhmod.main.item;

import gum.tbhmod.main.init.EffectRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class TbhMeat extends ModItem{
    public TbhMeat() {
        super(new FabricItemSettings().food(new FoodComponent.Builder()
                .hunger(3)
                .saturationModifier(1.2f)
                .meat()
                .statusEffect(new StatusEffectInstance(
                        EffectRegistry.AUTISM,
                        999999999, 0,
                        false, false, true
                        ),
                        100
                )
                .build()));
    }
}
