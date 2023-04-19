package part2;

//static , final
public class Ex2_12 {
        private static String staticMessage = "Static Message~ "; //static field
        private String instanceMessage; //instance field

        public Ex2_12(){
            this.instanceMessage = "Instance Message~";
        }

        //instance method
        //instance method는 static 필드나, static 메서드 호출 가능하다.
        public void showInstanceMessage(){
            System.out.println(instanceMessage);
            System.out.println(staticMessage);
            Ex2_12.showStaticMessage(); //this보다 클래스 이름으로 접근 가능
        }

        //static method , 프로그램 실행 시 언제든 호출 가능.
        public static void showStaticMessage(){
            System.out.println(staticMessage);
            //System.out.println(instanceMessage); //에러,
//            this.showInstanceMessage(); //에러, 인스턴스가 생성 안돼있을 수도 있다.

            Ex2_12 se = new Ex2_12();
            se.showInstanceMessage();
            Ex2_12.showStaticMessage();

        }

}
