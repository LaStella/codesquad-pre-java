package week04.mission01.one.printer;

public class GenericPrinter<T extends Material> {
    T material;

    public GenericPrinter() {

    }

    public GenericPrinter(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "재료는 " + material.toString() + "입니다.";
    }

    public void setMaterial(T material) {
        this.material = material;
    }
}
