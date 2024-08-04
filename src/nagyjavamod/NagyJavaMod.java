package nagyjavamod;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class NagyJavaMod extends Mod{

    public NagyJavaMod(){
        Log.info("Loaded NagyJavaMod constructor.");
        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Neo-Dustry");
                dialog.cont.add("Made by:").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("nagyjavamod-nagpfp")).pad(20f).row();
                dialog.cont.image(Core.atlas.find("nagyjavamod-nikipfp")).pad(20f).row();
                dialog.cont.button("Okay", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
        NagyUnitTypes.load();
        NagyBlocks.load();
        NagyItems.load();
    }

}
