package nagyjavamod;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

public class NagyUnitTypes {
    public static UnitType trooper;

    public static void load(){
        trooper = new UnitType("trooper"){{
            constructor = UnitEntity::create;
            hovering = true;
            shadowElevation = 0.1f;
            speed = 2f;
            accel = 0.2f;
            drag = 0.2f;
            hitSize = 10f;
            flying = true;
            engineSize = 2.5f;
            engineOffset = 5f;
            health = 400;
            itemCapacity = 0;
            useEngineElevation = false;
            researchCostMultiplier = 0f;
            
            parts.add(
                new HoverPart(){{
                    x = 4f;
                    y = -3f;
                    mirror = true;
                    radius = 5f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("ffa566");
                }},
                new HoverPart(){{
                    x = 3f;
                    y = 1f;
                    mirror = true;
                    radius = 5f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("ffa566");
                }}
            );
    
            weapons.add(
                new Weapon(""){{
                reload = 15f;
                x = 0f;
                y = 3f;
                top = false;
                inaccuracy = 0;
                bullet = new BasicBulletType(5f, 20){{
                    width = 9f;
                    height = 12f;
                    lifetime = 60f;
                    }};
                }}
            );
        }};
    }
}
