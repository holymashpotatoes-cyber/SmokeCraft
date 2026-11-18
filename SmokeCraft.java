package com.smokecraft;

import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;

/**
 * SmokeCraft server-side prototype.
 *
 * This safe starter intentionally contains no tobacco, smoking, drug-use,
 * or addiction mechanics. The planned gameplay direction is an abstract
 * environmental air-quality and player-condition system.
 */
@Mod(SmokeCraft.MOD_ID)
public final class SmokeCraft {
    public static final String MOD_ID = "smokecraft";

    public SmokeCraft(IEventBus modEventBus, ModContainer modContainer) {
        // Registry and gameplay systems will be attached here in subsequent steps.
    }
}
