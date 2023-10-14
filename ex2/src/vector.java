public class vector {
    float x,y,z;
    public void get(float a,float b,float c){
        this.x = a;
        this.y = b;
        this.z = c;
    }
    public void plus(vector v1,vector v2){
      this.x = v1.x + v2.x;
      this.y = v1.y + v2.y;
      this.z = v1.z + v2.z;
    }
    public void mulk(vector v,float k){
      this.x = v.x*k;
      this.y = v.y*k;
      this.z = v.z*k;
    }
    public static float mulvec(vector v1,vector v2){
      return (v1.x*v2.x + v1.y*v2.y + v1.z*v2.z );
    }
}
