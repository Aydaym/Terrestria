package com.terraformersmc.terrestria.biome;

import com.terraformersmc.terrestria.biome.builder.DefaultFeature;
import com.terraformersmc.terrestria.biome.builder.TerrestriaBiome;
import com.terraformersmc.terrestria.init.TerrestriaBiomes;
import com.terraformersmc.terrestria.init.TerrestriaBlocks;
import com.terraformersmc.terrestria.init.TerrestriaFeatures;
import com.terraformersmc.terrestria.init.TerrestriaSurfaces;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MineshaftFeature;
import net.minecraft.world.gen.feature.MineshaftFeatureConfig;

public class VolcanicIslandBiomes {
	public static void register() {
		TerrestriaBiome.Frozen template = TerrestriaBiome.freeze(TerrestriaBiome.builder()
				.configureSurfaceBuilder(TerrestriaSurfaces.CLIFF, TerrestriaSurfaces.BASALT_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.BEACH)
				.temperature(0.9F)
				.downfall(0.9F)
				.waterColor(0x54d3c0)
				.waterFogColor(0x24a0b0)
				.addDefaultFeatures(DefaultFeature.LAND_CARVERS, DefaultFeature.STRUCTURES, DefaultFeature.LAKES, DefaultFeature.DUNGEONS, DefaultFeature.MINEABLES, DefaultFeature.ORES, DefaultFeature.DISKS, DefaultFeature.DEFAULT_FLOWERS,
						DefaultFeature.DEFAULT_GRASS, DefaultFeature.DEFAULT_MUSHROOMS, DefaultFeature.DEFAULT_VEGETATION, DefaultFeature.SPRINGS, DefaultFeature.FROZEN_TOP_LAYER)
				.addGrassFeature(TerrestriaBlocks.INDIAN_PAINTBRUSH.getDefaultState(), 1)
				.addGrassFeature(TerrestriaBlocks.MONSTERAS.getDefaultState(), 4)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SQUID, 3, 1, 4))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.SALMON, 15, 3, 6))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.COD, 15, 1, 5))
		);

		TerrestriaBiomes.VOLCANIC_ISLAND = TerrestriaBiomes.register("volcanic_island", template.builder()
				.category(Biome.Category.EXTREME_HILLS)
				.depth(0.1F)
				.scale(0.2F)
				.addTreeFeature(TerrestriaFeatures.JUNGLE_PALM_TREE, 5)
				.build());

		TerrestriaBiomes.VOLCANIC_ISLAND_SHORE = TerrestriaBiomes.register("volcanic_island_shore", template.builder()
				.depth(0.05F)
				.scale(0.05F)
				.addTreeFeature(TerrestriaFeatures.JUNGLE_PALM_TREE, 2)
				.build());

		TerrestriaBiomes.VOLCANIC_ISLAND_BEACH = TerrestriaBiomes.register("volcanic_island_beach", template.builder()
				.configureSurfaceBuilder(TerrestriaSurfaces.BASALT_BEACH, TerrestriaSurfaces.BASALT_CONFIG)
				.depth(0F)
				.scale(0.05F)
				.addTreeFeature(TerrestriaFeatures.JUNGLE_PALM_TREE, 2)
				.build());
	}
}