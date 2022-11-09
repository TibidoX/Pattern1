package org.example;

public abstract class AbstractTrack {
    protected String name;
    protected String engine_type;
    protected String body_type;
    //protected int axes;

    public AbstractTrack(String name) {this.name = name;}
    public String GetName() {return this.name;}
    public String GetTruckType() {return "для ручного согласования";}
    public String GetEngineType() {return "для ручного согласования";}
    public String GetBodyType() {return "для ручного согласования";}
}
