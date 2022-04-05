import java.util.Arrays;
    
    public class Image {

        private int[][] pixels;
    
        private int width;
    
        private int height;
    
     
    
     public Image(int[][] pixels) {
    
        this.pixels = pixels;
    
        this.height = pixels.length;
    
        this.width = pixels[0].length;
    
    }
    public String toString(){
       return Arrays.deepToString().replace("], ", "],\n");
    }

    public void flip(boolean horizontal){
    //flip horizontally
        if(horizontal){
            for(int i = 0; i < height; i++){
                for(int j = 0; j < width / 2; j++){
                    int temp = pixels[i][j];
                    pixels[i][j] = pixels[i][pixels.length -1 -j];
                    pixels[i][pixels.length -1 -j] = temp;
                }
            }
        }
    //flip vertically
        else{
            for (int i = 0; i < height / 2; i++) {
                for (int j = 0; j < width; j++) {
                    int temp = pixels[i][j];
                    pixels[i][j] = pixels[pixels.length - 1 - i][j];
                    pixels[pixels.length - 1 -i][j] = temp;
                }
            }        
        }
    }
    
    public void rotate(boolean clockwise){
        // i = rows j = columns
        if(clockwise){
            int[][] cArray = new int [width][height];
            for(int i = 0; i<width; i++ ){
                for(int j = 0; j<height; j++){
                    cArray[i][j] = pixels[(height -1) - j][i];
                }
            }
            System.out.println(this.toString(cArray));
        }
        else{
            int[][] acArray = new int [width][height];
            for(int i = 0; i<height; i++ ){
                for(int j = 0; j<width; j++){
                    acArray[(width-1) - j][i] = pixels[i][j];
            }
        }
        System.out.println(this.toString(acArray));
    } 
}
}