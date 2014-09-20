package com.kpeace74.magicmachinery.handler;

import java.util.Random;

import com.kpeace74.magicmachinery.block.BlockFlag;
import com.kpeace74.magicmachinery.init.ModBlocks;
import com.kpeace74.magicmachinery.worldgen.WorldGenFountain;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class GenerationHandler implements IWorldGenerator {

	private WorldGenerator testGen;
	private WorldGenerator fountainGen;
	private WorldGenerator lootChest;
	
	public GenerationHandler() {
		GameRegistry.registerWorldGenerator(this, 10);
		//fountainGen = new WorldGenFountain();
		
		
	}
	
	private void generateStandardOre(Random rand, int chunkX, int chunkZ, World world, int iterations, WorldGenerator gen, int lowestY, int highestY) {
		for (int i = 0; i < iterations; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = rand.nextInt(highestY - lowestY) + lowestY;
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, x, y, z);
		}
	}
	
	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		  
		  int Xcoord1 = blockX * 16 + random.nextInt(16);
		  int Ycoord1 = random.nextInt(80);
		  int Zcoord1 = blockZ * 16 + random.nextInt(16);
		
		 // fountainGen.generate(world, random, Xcoord1, Ycoord1, Zcoord1);

	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		//generateStandardOre(random, chunkX, chunkZ, world, 20, testGen, 0, 128);
		//generateSurface(world, random, chunkX, chunkZ);
	}

}
