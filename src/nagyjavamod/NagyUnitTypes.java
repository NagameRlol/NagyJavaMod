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
            constructor = ElevationMoveUnit::create;
            hovering = true;
            shadowElevation = -3f;
            lowAltitude = true;
            speed = 1.75f;
            accel = 0.09f;
            drag = 0.07f;
            hitSize = 8;
            engineSize = 2.5f;
            engineOffset = 5f;
            health = 400;
            flying = false;
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
        
        sergeant = new UnitType("sergeant"){{
            constructor = ElevationMoveUnit::create;
            hovering = true;
            shadowElevation = -3f;
            lowAltitude = true;
            speed = 1.5f;
            accel = 0.09f;
            drag = 0.07f;
            hitSize = 11;
            engineSize = 3f;
            engineOffset = 4f;
            health = 700;
            flying = false;
            itemCapacity = 0;
            useEngineElevation = false;
            researchCostMultiplier = 0f;
            
            parts.add(
                new HoverPart(){{
                    x = 5f;
                    y = -4f;
                    mirror = true;
                    radius = 6f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("ffa566");
                }},
                new HoverPart(){{
                    x = 4f;
                    y = -1f;
                    mirror = true;
                    radius = 6f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("ffa566");
                }}
            );
    
            weapons.add(
                new Weapon("sergeant-weapon"){{
                reload = 10f;
                alternate = true;
                x = 0f;
                y = 3f;
                top = false;
                inaccuracy = 0;
                bullet = new BasicBulletType(4f, 17){{
                    width = 9f;
                    height = 12f;
                    lifetime = 70f;
                    fragBullets = 6;
                    frag = true;
                    fragBullet = new BasicBulletType(7f, 5){{
                        width = 5f;
                        height = 7;
                        lifetime = 40;
                        }};
                       }}
                     }};
                    }}
            );
        }};
    }
}
