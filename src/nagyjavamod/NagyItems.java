package nagyjavamod;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class NagyItems {
    public static Item
    electricCyst, basalt, zinc;

        public static void load(){
        electricCyst = new Item("electric-cyst", Color.valueOf("fdb480")){{
            hardness = 1;
        }};
        basalt = new Item("basalt", Color.valueOf("606070")){{
            hardness = 1;
        }};
        zinc = new Item("zinc", Color.valueOf("b4b6c2")){{
            hardness = 1;
        }};

    }
}
