package org.example;

public class ax_3 extends AbstractTrack
{
    public ax_3(String name, String engine_type, String body_type)
    {
        super(name);
        this.engine_type = engine_type;
        this.body_type = body_type;
    }

    public String GetTruckType() {return "3-осевой";}
    @Override
    public String GetEngineType() {return engine_type;}
    @Override
    public String GetBodyType() {return body_type;}
}
