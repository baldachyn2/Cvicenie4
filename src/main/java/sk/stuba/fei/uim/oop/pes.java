package sk.stuba.fei.uim.oop;

public class pes extends zivocich {
    String name;
    public void setName(String name) {
        this.name = name;
    }

    public pes(String name) {
        this.name = name;
    }

    @Override
    protected void zvuk() {
        System.out.println("pes");
    }

}
