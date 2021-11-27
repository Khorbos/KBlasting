package com.khorbos.kblasting;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(KBlasting.ID)
public class KBlasting
{
    public static final String ID = "kblasting";
    private static final Logger LOGGER = LogManager.getLogger();

    public KBlasting() {}

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {}
}
