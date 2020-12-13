package prototype;

public abstract  class Shape implements Cloneable {
    private String id;
    protected String type;

    public String getType() {
        return type;
    }

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }



}
