package com.terraformersmc.terrestria.block.sapling;

import java.util.Random;
import java.util.function.Supplier;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class TerrestriaLargeSaplingGenerator extends LargeTreeSaplingGenerator {
	public final Supplier<ConfiguredFeature<TreeFeatureConfig, ?>> tree;
	public final Supplier<ConfiguredFeature<TreeFeatureConfig, ?>> largeTree;

	public TerrestriaLargeSaplingGenerator(Supplier<ConfiguredFeature<TreeFeatureConfig, ?>> tree, Supplier<ConfiguredFeature<TreeFeatureConfig, ?>> largeTree) {
		this.tree = tree;
		this.largeTree = largeTree;
	}

	protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
		return this.tree.get();
	}

	protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
		return this.largeTree.get();
	}
}
