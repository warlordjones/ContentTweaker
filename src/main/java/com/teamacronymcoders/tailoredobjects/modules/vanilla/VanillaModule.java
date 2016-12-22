package com.teamacronymcoders.tailoredobjects.modules.vanilla;

import com.teamacronymcoders.base.modulesystem.Module;
import com.teamacronymcoders.base.modulesystem.ModuleBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.teamacronymcoders.tailoredobjects.TailoredObjects.MOD_ID;

@Module(MOD_ID)
public class VanillaModule extends ModuleBase {
    @Override
    public String getName() {
        return "Vanilla";
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new VanillaDeserializers());
    }
}
