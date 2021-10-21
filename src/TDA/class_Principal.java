package TDA;

public class class_Principal {
    public static void main(String[] args) {

        class_Point objectPoint = new class_Point();
        objectPoint.setX(66);
        objectPoint.setY(4);
        objectPoint.setZ(8);
        objectPoint.setDimension("3D");
        System.out.println("Dimension: " + objectPoint.getDimension());
        System.out.println("Coordenada X: " + objectPoint.getX());
        System.out.println("Coordenada Y: " + objectPoint.getY());
        System.out.println("Coordenada Z: " + objectPoint.getZ());
    }
}
