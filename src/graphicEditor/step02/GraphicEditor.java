package graphicEditor.step02;

public class GraphicEditor extends Shape{

    private static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {


        //shapes라는 배열 하나로 여러 도형들을 담을 수 있다.
        //따로 도형마다 방을 생성하지 않아도.
       Shape[] shapes = new Shape[ARRAY_LENGTH];

        //Generate Shapes
        for(int i =0; i<ARRAY_LENGTH; i++){
            int randomNumber = (int)(Math.random()*3);
            if(randomNumber ==0){
                shapes[i] = new Rectangle();
            }else if(randomNumber ==1){
                shapes[i] = new Ellipse();
            }else{
                shapes[i] = new Line();
            }
        }

        //Drawing Shapes
        //for each, 확장 for문
        //shapes 배열에서 값을 하나씩 꺼내서 Shape 형태의 shape에 저장한다.
        for(Shape shape : shapes){
            //shape이 Rectangle 타입으로 다운캐스팅이 되나?
            if(shape instanceof Rectangle){
                ((Rectangle)shape).drawRectangle();
            }else if(shape instanceof Ellipse){
                ((Ellipse)shape).drawEllipse();
            }else if(shape instanceof Line){
                ((Line)shape).drawLine();
            }
        }


    }
}
