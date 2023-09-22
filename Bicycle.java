public class Bicycle {
     public static void main(String[] args){
          
// создание и заполнение 1го массива
     short[] c = new short[12];
     for (int i = 0; i < c.length; i++) {
          c[i]= (short)(i+4);
     }
// создание и заполнение 2го массива
     float[] x = new float[13];
     for (int  j= 0; j < x.length; j++) {
     x[j] = (float)((Math.random() * 23d) - 15d);
     }

     String string = "569101115";

// создание 3го массива
     float [][] matrix = new float [12][13];
     for (int  i=0; i<12 ;i++ ) {
          for (int j=0; j<13; j++){
               if (c[i] == 8){
                    matrix[i][j]=(float)(Math.pow((3/4)*(Math.asin((x[j]-3.5f)/23)),2));
               }else if (string.contains(Short.toString(c[i])))  {
                    matrix[i][j] = (float)Math.pow(Math.E,Math.pow((1-Math.log(Math.abs(x[j]))),2));
               }else {
                    matrix[i][j]=(float)Math.log(Math.pow(Math.E,Math.pow(2*Math.log(Math.pow(2*Math.PI*Math.abs(x[j]),2)),Math.atan(Math.pow(Math.E,-Math.abs(x[j]))))));  
               }
          }
     }
     for (int i = 0; i < 12; i++) {
          for (int j = 0; j < 13; j++){
               System.out.printf("%.5f", matrix[i][j]);
               System.out.print(" ");
          }
          System.out.println();
     }
}
}