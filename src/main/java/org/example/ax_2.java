package org.example;

public class ax_2 extends AbstractTrack{
    public ax_2(String name, String engine_type, String body_type)
    {
        super(name);
        this.engine_type = engine_type;
        this.body_type = body_type;
    }

    @Override
    public String GetTruckType() {return "2-осевой";}
    @Override
    public String GetEngineType(){return engine_type;}
    @Override
    public String GetBodyType(){return body_type;}
}
