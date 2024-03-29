public class DrawExample{
   public static void main( String[] args ){
   // draw outside border
      StdDraw.setPenColor(0,0,0);
      StdDraw.filledCircle(0.5,0.5,0.26);
      // draw "face
      StdDraw.setPenColor(255,255,0);
      StdDraw.filledCircle(0.5,0.5,0.25);
      
      // draw eyes
      StdDraw.setPenColor(255,255,255);  
      StdDraw.filledCircle(0.4,0.6,0.05);      // left eye
      StdDraw.filledCircle(0.6,0.6,0.05); // right eye
      // draw pupils
      StdDraw.setPenColor(0,0,0); 
      StdDraw.filledCircle(0.4,0.57,0.02);      
      StdDraw.filledCircle(0.6,0.63,0.02);
      
      // draw mouth
      StdDraw.setPenRadius(0.01);
      StdDraw.setPenColor(255,0,0);
      StdDraw.arc(0.5,0.5,0.15,225,315);                
      StdDraw.save("MyPic.png");
   }
}