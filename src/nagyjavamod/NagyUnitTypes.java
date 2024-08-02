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
    public static UnitType
    trooper, sergeant, //serpulo hovertanks
    inflamation //red flying
    ; 

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
                bullet = new RicochetBulletType(5f, 20f, "bullet"){{
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
                new Weapon("nagyjavamod-sergeant-weapon"){{
                reload = 10f;
                alternate = true;
                x = 3f;
                y = 5f;
                top = true;
                rotate = true;
                rotationLimit = 40;
                inaccuracy = 0;
                bullet = new RicochetBulletType(4f, 15f, "bullet"){{
                    width = 9f;
                    height = 12f;
                    lifetime = 70f;
                    fragBullets = 6;
                    }};
                }}
            );
        }};

        inflamation = new UnitType("inflamation"){{
            constructor = UnitEntity::create;
            speed = 4f;
            rotateSpeed = 10f;
            accel = 0.1f;
            drag = 0.1f;
            engineSize = 4f;
            engineOffset = 7f;
            health = 300;
            armor = 3f;
            flying = true;
            trailLength = 10;
            circleTarget = true;
            outlineColor = NagyPal.basaltOutline;
            
            weapons.add(
                new Weapon(""){{
                reload = 10f;
                x = 0f;
                y = 3f;
                top = false;
                inaccuracy = 0;
                shootSound = Sounds.bolt;
                bullet = new BasicBulletType(6f, 20f, "laser"){{
                    width = 1f;
                    height = 20;
                    lifetime = 40f;
                    frontColor = NagyPal.redLaser;
                    trailColor = NagyPal.redLaser;
                    trailLength = 3;
                    trailWidth = 1;
                    pierce = true;   
                    }};
                }}
            );
        }};
        
    }
}
