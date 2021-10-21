package TDA;

public class class_Point {
    private int x, y, z;
    String dimension;

    public void Point (int coorX, int coorY){
        this.x=coorX;
        this.y=coorY;
    }

    public void Point( int coorX, int coorY, int coorZ){
        this.x=coorX;
        this.y=coorY;
        this.z=coorZ;
    }

    public  void Point(){
        this.x=0;
        this.y=0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }

    public String getDimension(){
        return dimension;
    }

    void setX(int valorX){
        this.x=valorX;
    }
    void setY(int valorY){
        this.y=valorY;
    }
    void setZ(int valorZ){
        this.y=valorZ;
    }
    void  setDimension(String dime){
        this.dimension=dime;
    }
}
