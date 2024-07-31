package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Neo-Dustry");
                dialog.cont.add("Made by:").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("example-java-mod-nagpfp")).pad(20f).row();
                dialog.cont.image(Core.atlas.find("example-java-mod-nikipfp")).pad(20f).row();
                dialog.cont.button("Okay", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });d
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
    }

}
