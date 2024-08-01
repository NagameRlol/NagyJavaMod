package nagyjavamod;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.annotations.Annotations.*;
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
        trooper = new NagyUnitType("trooper"){{
            speed = 0.7f;
            hitSize = 10f;
            health = 400;
            weapons.add(new Weapon(""){{
                reload = 5f;
                x = 0f;
                y = 5f;
                top = false;
                inaccuracy = 3;
                ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(5f, 10){{
                    width = 9f;
                    height = 12f;
                    lifetime = 60f;
                }};
            }});
        }};
    }
}
