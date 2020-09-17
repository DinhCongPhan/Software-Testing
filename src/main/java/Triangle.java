
public class Triangle {

    private int edge1;
    private int edge2;
    private int edge3;

    Triangle(int edge1, int edge2, int edge3){
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }



    public int getEdge1() {
        return edge1;
    }


    public void setEdge1(int edge1) {
        this.edge1 = edge1;
    }


    public int getEdge2() {
        return edge2;
    }

    public void setEdge2(int edge2) {
        this.edge2 = edge2;
    }

    public int getEdge3() {
        return edge3;
    }

    public void setEdge3(int edge3) {
        this.edge3 = edge3;
    }


    public static int  triangleType(int a, int b, int c){
        if(a > 0 && b > 0 && c > 0 ) {
            if (a + b > c && b + c > a && a + c > b) {
               if(a == b && b == c){
                   return 0;
               }
               else if(a == b || b == c || a == c){
                   return 1;
               }
               else {
                   return 2;
               }

            }
            else {
                return 3;
            }
        }




        return 4;
    }


}
