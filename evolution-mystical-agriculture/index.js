const fs = require('fs')

function writeRecipe(name, type, data) {
  fs.mkdirSync(`data/imperador/recipes/${type}`, { recursive: true })
  fs.writeFileSync(`data/imperador/recipes/${type}/${name}_seeds.json`, JSON.stringify(data, null, 2))
}

function generateInsolatorRecipe(name) {
  const thermalData = {
    type: "thermal:insolator",
    ingredient: {
      item: `mysticalagriculture:${name}_seeds`
    },
    result: [
      {
        item: `mysticalagriculture:${name}_essence`,
        chance: 4.0
      },
      {
        item: `mysticalagriculture:${name}_seeds`,
        chance: 1.1
      }
    ],
    energy_mod: 3.0,
    water_mod: 3.0
  }

  return thermalData
}

function generateClocheRecipe(name) {
  const immersiveData = {
    type: "immersiveengineering:cloche",
    time: 1200,
    soil: [
      {
        item: "minecraft:farmland"
      }
    ],
    input: {
      item: `mysticalagriculture:${name}_seeds`
    },
    results: [
      {
        item: `mysticalagriculture:${name}_essence`,
        count: 4
      },
      {
        item: `mysticalagriculture:${name}_seeds`,
        count: 1
      }
    ],
    render: {
      type: "crop",
      block: `mysticalagriculture:${name}_crop`
    }
  }

  return immersiveData
}

function generateRecipe(name) {
  writeRecipe(name, "thermal", generateInsolatorRecipe(name))
  writeRecipe(name, "immersive", generateClocheRecipe(name))
}

const recipes = [
  'signalum', 'lumium', 'constantan', 'electrum', 'enderium', 'invar',
  'air', 'earth', 'water', 'fire', 'inferium', 'stone', 'dirt', 'wood',
  'ice', 'nature', 'dye', 'nether', 'coal', 'pig', 'chicken', 'cow',
  'sheep', 'slime', 'saltpeter', 'silicon', 'sulfur', 'aluminum', 'iron',
  'copper', 'enderman', 'blaze', 'experience', 'end', 'lapis_lazuli',
  'quartz_enriched_iron', 'gold', 'lead', 'bronze', 'silver', 'tin',
  'spider', 'creeper', 'skeleton', 'zombie', 'obsidian', 'redstone',
  'glowstone', 'nether_quartz', 'nickel', 'uranium', 'osmium', 'fluorite',
  'diamond', 'emerald', 'netherite', 'wither_skeleton', 'yellorium', 'apatite'
]

recipes.forEach(name => generateRecipe(name))
