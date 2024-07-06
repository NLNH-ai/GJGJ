
import java.util.Scanner;

public class JDBC {
    public static void main(String[] args) {

              Scanner sc = new Scanner((System.in));
              
              while(true){

                System.out.println("1.회원가입 2. 로그인 3. 회원목록 4. 회원수정 5. 회원삭제6.종료>>");
                int menu = sc.nextInt();

                if(menu==1){

                    System.out.println(
                        "======회원가입======"
                    );
                    System.out.println("id : ");
                    String id = sc.next();
                    System.out.println("pw: ");
                    String pw = sc.next();
                    System.out.println("nick: ");
                    String nick = sc.next();

                }

                if(menu==2){



                }
                if(menu==3){


                    
                }
                if(menu==4){


                    
                }
                if(menu==5){


                    
                }
                if(menu==6){


                    
                }



              }


    }

}
