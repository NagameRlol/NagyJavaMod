package nagyjavamod;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.content.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class NagyBlocks {
    public static Block 
    // ConsumeGenerators
    electricExtractor, 
    // cores
    coreOffice,
    // terrain
    blueWall;
    
    public static void load(){
        
        electricExtractor = new ConsumeGenerator("electric-extractor"){{
            requirements(Category.power, with(NagyItems.basalt, 40, NagyItems.zinc, 30));
            powerProduction = 0.5f;
            itemDuration = 50f;
            size = 2;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("fdb480")));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.08f;
            generateEffect = Fx.generatespark;

            consumeItem(NagyItems.electricCyst, 1);

            drawer = new DrawMulti(new DrawDefault());
        }};

        coreOffice = new CoreBlock("core-office"){{
            requirements(Category.effect, with(NagyItems.basalt, 900, NagyItems.zinc, 700));
            alwaysUnlocked = true;

            isFirstTier = true;
            unitType = UnitTypes.alpha;
            health = 2400;
            itemCapacity = 4000;
            size = 3;
            buildCostMultiplier = 2f;

            unitCapModifier = 12;
        }};

        blueWall = new StaticWall("blue-wall"){{
            attributes.set(Attribute.sand, 1f);
        }};
    }
}
