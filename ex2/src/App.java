public class App {
    public static vector vec1;
    public static vector vec2;
    public static vector vec3;
    public static void main(String[] args) throws Exception {
        vec1 = new vector();
        vec2 = new vector();
        vec3 = new vector();
        vec1.get((float)1,(float)2 ,(float)3);
        vec2.get((float)3,(float)4 ,(float)5);
        vec3.plus(vec2, vec1);
        System.out.println("Result 1:(" + vec3.x + "," + vec3.y + "," + vec3.z + ")");
        vec3.mulk(vec1,(float)5);
        System.out.println("Result 2:(" + vec3.x + "," + vec3.y + "," + vec3.z + ")");
        System.out.println("Result 3:"+vec3.mulvec(vec2, vec1));
    }
}
